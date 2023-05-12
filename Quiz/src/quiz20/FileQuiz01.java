package quiz20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1.스캐너를 통해서 파일명을 입력을 받급니다.
		 * 2.입력받은 파일을 filecopy로 복사해서 옮겨주면 됩니다.
		 * 
		 * 3.자원해제주의!
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("복사할 파일명>");
		String re = scan.next();
		System.out.print("복사된 파일명>");
		String wr = scan.next();
		
		
		String readpath = "C:\\Users\\user\\Desktop\\file\\" + re + ".png";//경로
		String writepath = "C:\\Users\\user\\Desktop\\filecopy\\"+ wr + ".png";//경로
			//확장자 명도 따로 붙여줘야 파일 경로를 제대로 읽는다.
		
		try(InputStream is = new FileInputStream(readpath);
				OutputStream out = new FileOutputStream(writepath)) {
			
			byte[] arr = new byte[2048]; //데이터 받을 배열
			
			int result;
			while( (result = is.read(arr)) != -1 ) { //read로 읽었으니 안에는 write로 쓰면 된다.
				out.write(arr, 0, result); //arr배열의 0번에서 result(마지막 값)까지만 입력.
			}
			
			System.out.println("파일 복사 완료");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}		
	}
}
