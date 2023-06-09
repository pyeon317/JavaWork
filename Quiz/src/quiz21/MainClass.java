package quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args){
		
		
		//지역명, 규모구분. 연도, 월, 분양가격 =>1행 x 4800개
		/*
		 * 1. 버퍼리더 이용해서 한줄씩 읽습니다.
		 * 2. split(",", 5)를 사용해서 Data객체에 한줄 단위로 저장을 하고
		 * 3. List<Data> 에 하나씩 추가를 합니다.
		 * 
		 * 4. 람다식을 이용해서 지역: 서울, 4분기중 9~12월, 분양가격: 2000 이상인 객체만 뽑아서
		 * 새로운 리스트로 반환.
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz21\\주택도시보증공사_전국 평균 분양가격.csv";
		List<Data> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"))) {//EUC-KR 한글읽기 위함
			
			br.readLine(); //제목행 한줄 넘어감
			
			String str;
			while( (str = br.readLine()) != null ) {
				str = br.readLine();
				String[] arr = str.split(",", 5);
				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				String price = arr[4].replace(" ","").replace(",","").replace("\"", "").replace("-", "");//에러요소 (공백, 반점, 따옴표, - )
				
				Data data = new Data(region, size, year, month, price);
				list.add(data); //리스트에 추가
			}
			
			//4번
			
			
			List<Data> newlist = list.stream().filter( a -> a.equals("서울"))
					  							.filter( a -> Integer.parseInt(a.getMonth()) >= 9 && Integer.parseInt(a.getMonth()) <= 12)
					  							.filter( a -> Integer.parseInt(a.getPrice()) >= 2000)
					  							.collect(Collectors.toList());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
