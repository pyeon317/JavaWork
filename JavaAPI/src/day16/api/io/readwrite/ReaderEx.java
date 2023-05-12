package day16.api.io.readwrite;

import java.io.FileReader;
import java.io.Reader;

import day12.api.lang.object.MainClass;

public class ReaderEx {

	public static void main(String[] args) {
		
	/*
	 * 문자기반 파일을 읽어서 사용할 때는 FileReader클래스를 사용합니다.
	 * 2바이트 기반
	 */
		
		String path = "C:\\Users\\user\\Desktop\\file\\text.txt";
		
		try(Reader fr = new FileReader(path)){
			
			int result = fr.read();
			while( (result = fr.read() ) != -1) { //더이상 읽을 값이 없다면 -1반환
				System.out.println( (char)result );
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}			
			
}
