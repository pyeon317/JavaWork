package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoUpdate01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//부서아이디, 부서이름을 입력받아서, 해당 부서의 이름을 변경하는 update구문
		System.out.println("새로운 부서이름>");
		String name = scan.nextLine();
		System.out.println("부서 위치");
		String id = scan.nextLine(); 
		
		
		
		//데이터베이스 연결통로
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //jdbc:oracle:thin:호스트이름:포트번호:DB이름
		String uid = "HR";
		String upw = "HR";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql ="UPDATE DEPTS SET DEPARTMENT_NAME = ? WHERE DEPARTMENT_ID = ?";
				
		try {
			//1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2
			conn = DriverManager.getConnection(url,uid,upw);
			//3
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			//4
			int result = pstmt.executeUpdate();
			System.out.println("성공실패?:" + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
