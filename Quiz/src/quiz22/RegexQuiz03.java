package quiz22;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class RegexQuiz03 {

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
		String excel = "C:\\Users\\user\\Desktop\\file\\건담.xlsx";
		List<Product> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"))) {
			String str;
			
			while( (str = br.readLine()) != null ) {
				String pattern1 = "\\d{8}-\\d+-\\d{11,}";
				String pattern2 = "건담[가-힣]* [가-힣]+점|널"; //공백도 같이 포함함. 목록 중 하나가 점으로 끝나지 않고 널로 끝나서 마지막에 | 연산자를 이용해 점(또는)널의 조건으로 만들었음.
				String pattern3 = "\\[[A-Z가-힣]*\\]";
				String pattern5 = "[0-9,]+원";
			
				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m5 = Pattern.compile(pattern5).matcher(str);
				
				if(m1.find() && m2.find() && m3.find() && m5.find()) {
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					String detail = str.substring(m3.end(), m5.start());
					String price = m5.group();
			
					Product p = new Product(day, store, grade, detail, price);
					list.add(p);
				}
			}
			createExcel(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void createExcel(List<Product> list) {
		//워크북
		XSSFWorkbook workbook = new XSSFWorkbook();
		//시트
		XSSFSheet sheet = workbook.createSheet();
		//시트 안에 행
		XSSFRow row1 = sheet.createRow(0);
//		XSSFCell cell = row1.createCell(0);
//		cell.setCellValue("날짜");
		row1.createCell(0).setCellValue("날짜");
		row1.createCell(1).setCellValue("지점");
		row1.createCell(2).setCellValue("등급");
		row1.createCell(3).setCellValue("상세");
		row1.createCell(4).setCellValue("가격");
		
		for(int i = 0; i < list.size(); i++) {
			XSSFRow row = sheet.createRow(i+1);
			
			Product p = list.get(i);
			
			row.createCell(0).setCellValue(p.getDay());
			row.createCell(1).setCellValue(p.getStore());
			row.createCell(2).setCellValue(p.getGrade());
			row.createCell(3).setCellValue(p.getDetail());
			row.createCell(4).setCellValue(p.getPrice());
		}
		String path = "C:\\Users\\user\\Desktop\\file\\gundam.xlsx";
		
		try(FileOutputStream fos = new FileOutputStream(path)) {
			workbook.write(fos);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}