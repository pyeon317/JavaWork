package day14.api.io.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx {

	public static void main(String[] args) {
		
		/*
		 * FileInputStream, FileOutputStream은
		 * 동영상, 이미지 파일을 읽거나 쓸때 사용합니다.
		 */
		
		String readpath = "C:\\Users\\user\\Desktop\\file\\메서드1.mp4";
		String writepath = "C:\\Users\\user\\Desktop\\filecopy\\메서드1_copy.mp4";
		
		//향상된 try~catch문
		//Closeable 인터페이스를 상속받은 클래스만 사용이 가능
		//close작업을 대신 함
		
		try(InputStream is = new FileInputStream(readpath);//경로에서 데이터 가져오기
			OutputStream out = new FileOutputStream(writepath);) {//경로로 데이터 보내기
			
			//InputStream is = new FileInputStream(readpath);
			//OutputStream out = new FileOutputStream(writepath);
			
			//읽음
			byte[] arr = new byte[2048]; //여기에 데이터를 담아서 이동
			
			
			/*int result = is.read(arr);
				System.out.println(result);//읽은 길이를 반환
				if(result == -1) break;*/ //밑의 while에서 true를 썼을 때 사용되는 코드
			int result;
			while((result = is.read(arr)) != -1) { //읽은 값이 1이 아닐 때까지
				
				//쓰기
				out.write(arr, 0, result); //arr데이터를 0에서 바이트 배열의 result까지만 씀
				//안하면 100으로 안끝났을 때 남는 부분이 0으로 출력됨
				
			}
			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료");
		
		
	}
}
