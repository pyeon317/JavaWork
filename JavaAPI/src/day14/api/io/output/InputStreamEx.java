package day14.api.io.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * 1.파일을 읽는데 사용하는 클래스  FileInpurStream
		 * 2.생성자 매개변수에 읽을 파일의 경로가 들어갑니다.
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\file\\example.txt";
		
		//FileInputStream is= new FileInputStream(path);
		try {
			InputStream is = new FileInputStream(path);
			
//			int result = is.read(); //한글자 읽기
//			System.out.println( (char)result );
			
//			System.out.println( is.read() );
//			System.out.println( is.read() );
//			System.out.println( is.read() ); //이러면 하나 하나씩  읽음
			
			//1st
			//read()는 하나씩 데이터를 읽고, 더 읽을 값이 없다면 -1을 반환
//			while(true) {
//				
//				int result = is.read();
//				if(result == -1) break; //그만
//				System.out.println( (char)result );
//				
//			}
			
			//2nd
			//read(배열) 해당 배열 크기만큼 읽음
			
			byte[] arr = new byte[2048]; //2kb
			int result = is.read(arr); //읽어들인 크기 반환
			System.out.println(result);
			
			int i = 0;
			while(true) {
				
				if(arr[i] == 0) break;
				System.out.println( (char)arr[i] );
				
				i++;
			}
			
			int result2 = is.read(arr); //더 읽을 값이 없다면 -1 반환
			System.out.println(result2);
			
			
			is.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
