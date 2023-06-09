package quiz22;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class rere {
	
	public static void main(String[] args) {
		
		
		/*
		 * 1. 버퍼리더를 사용해서 건담.txt 를 읽어들입니다.
		 * 2. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격 을 정규표현식으로 패턴분석
		 * Product객체에 저장하고, 리스트에 저장
		 * 
		 * 3.외부라이브러리 (POI) - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록하는 기능
		 * 	 하나의 시트에 각 행데이터를 엑셀파일로 출력 
		 */
		
		String path ="C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.txt";
		String excel = "C:\\Users\\user\\Desktop\\file\\건담.xls";
		List<pro> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));
			BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(excel))) {
			String str;
			
			while( (str = br.readLine()) != null ) {
				String pattern1 = "\\d{8}-\\d+-\\d{11,}";
				String pattern2 = "[가-힣]+ [가-힣]+점|널"; 
				String pattern3 = "\\[[A-Z가-힣]+\\]";
				String pattern5 = "[0-9,]+원";
			
				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m5 = Pattern.compile(pattern5).matcher(str);
				
				if(m1.find() && m2.find() && m3.find() && m5.find()) {
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					String detail = str.substring(m3.end()+1, m5.start()-1);//앞뒤공백 제거
					String price = m5.group();
			
					pro p = new pro(day, store, grade, detail, price);
					list.add(p);
				}
			
			}
			
			int i = 1;
			Workbook xlsxWb = new XSSFWorkbook(); //엑셀파일 생성
			Sheet sheet = xlsxWb.createSheet("건담"); //시트 생성 및 제목
			Row curRow = sheet.createRow(0); //시트 행 지정
			Cell cell = curRow.createCell(0); //시트 열 지정
			
			for(pro s : list) {
				curRow = sheet.createRow(i);
				cell = curRow.createCell(0);
				
				cell.setCellValue(s.getDay());
				cell = curRow.createCell(1);
				cell.setCellValue(s.getStore());
				cell = curRow.createCell(2);
				cell.setCellValue(s.getGrade());
				cell = curRow.createCell(3);
				cell.setCellValue(s.getDetail());
				cell = curRow.createCell(4);
				cell.setCellValue(s.getPrice());
			
				i++;
				
			}
			xlsxWb.write(bw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		
//		try(BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(excel))){
//			int i = 1;
//			XSSFWorkbook workbook = new XSSFWorkbook(); //엑셀파일 생성
//			XSSFSheet sheet = workbook.createSheet("건담"); //시트 생성 및 제목
//			XSSFRow curRow = sheet.createRow(0); //시트 행 지정
//			XSSFCell cell = curRow.createCell(0); //시트 열 지정
//			for(pro s : list) {
//				curRow = sheet.createRow(i);
//				cell = curRow.createCell(0);
//				cell.setCellValue(s.getDay());
//				cell = curRow.createCell(1);
//				cell.setCellValue(s.getStore());
//				cell = curRow.createCell(2);
//				cell.setCellValue(s.getGrade());
//				cell = curRow.createCell(3);
//				cell.setCellValue(s.getDetail());
//				cell = curRow.createCell(4);
//				cell.setCellValue(s.getPrice());
//			
//				i++;
//				
//			}
//			workbook.write(bw);
//		
//			} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
	}
}
	