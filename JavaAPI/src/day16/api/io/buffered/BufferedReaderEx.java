package day16.api.io.buffered;

import java.io.*;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		/*
		 * BufferedReader는 입력에 대한 성능향상보조스트림입니다.
		 * Reader클래스와 같이 사용됩니다.
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\file\\test.txt";
		
		
		
		try (BufferedReader br = new BufferedReader( new FileReader(path) )) {
			
			//br.read();//한글자씩 읽음
			//String result = br.readLine();//한 배열?한 줄?씩 읽음
			
			String result;
			while( (result = br.readLine()) != null) {
				System.out.println(result);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
