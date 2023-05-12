package day16.api.io.buffered;

import java.io.*;
import java.util.Scanner;

public class BufferWriterEx2 {

	public static void main(String[] args) {
		
		/*
		 * flush() - 중간중간 파일을 즉시 쓰고 싶으면 flish()를 사용합니다.
		 * 
		 * 버퍼라이트가 끝나면 자동으로 flsh() 나감
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String path = "C:\\Users\\user\\Desktop\\file\\test2.txt";
		
		try( BufferedWriter bw = new BufferedWriter (new FileWriter(path, true))) {
			
			System.out.print(">");
			String word1 = scan.next();
			bw.write(word1);//여기까지만 쓰고나서 파일 열어보면 입력안되있음.
			bw.flush(); //버퍼에 있는 내용을 내보낸다.
			
			System.out.print(">");
			String word2 = scan.next();
			bw.write(word2);//
			
			System.out.println("파일출력 완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
