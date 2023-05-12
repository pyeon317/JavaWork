package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class 빠른입력 {

	public static void main(String[] args) {
		
		/*
		 * 입력은 스캐너 => 
		 * InputStreamReader 는
		 * 1바이트 데이터를 => 2바이트 기반으로 변경
		 */
		
		//Reader rd = new InputStreamReader( System.in );
		
		//BufferedReader br = new BufferedReader(rd);
		//--------------------------------------------
		
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println(">");
			String name = br.readLine();
			
			System.out.println(name);//입력받은 결과
			
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
