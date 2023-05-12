package day14.api.io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다.
		 * 생성자 매개값으로 파일을 쓸 경로가 들어갑니다.
		 * io패키지 거의 모든 클래스들은생성자에 throws가 있기 때문에
		 * 반드시 예외처리 문장 안에서 사용합니다.
		 */ 
		
		String path = "C:\\Users\\user\\Desktop\\file\\example.txt";
		
//		new FileOutputStream("경로") //String name은 경로
		//FileOutputStream out = new FileOutputStream(path); // \가 한개면 출력이 안되는걸 주의
		//new OutputStream(0);
		//
		try {
			OutputStream out = new FileOutputStream(path);
			
//			1st
//			out.write(65); //한글자씩 씀
//			out.write(66);
//			out.write(67);
			
			//2nd
			//byte[] arr = {65, 66, 67, 68, 69}; //배열에 들어있는 데이터를 한번에 씀
			//out.write(arr);
			
			//3rd
			String str = "한글~"; //한글은 1byte기반으로 쓰기엔 적합하지 않습니다
			byte[] arr = str.getBytes();//문자열을 바이트 배열로 변환
			
			out.write(arr);
			
			
			
			
			
			out.close();//통로를 닫아주지 않으면 점점 늘어나서 나중에 문제가 생김
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
