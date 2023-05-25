package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoInsert01 {

	public static void main(String[] args) {
		
		//입력될 값은 콘솔로 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("부서이름>");
		String name = scan.nextLine();
		System.out.println("매니저아이디>");
		String manager_id = scan.nextLine();
		System.out.println("로케이션아이디>");
		String location_id = scan.nextLine();
		
		//데이터베이스 연결통로
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //jdbc:oracle:thin:호스트이름:포트번호:DB이름
		String uid = "HR";
		String upw = "HR";
		
		//insert, update, delete는 ResultSet객체가 필요없음
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES (depts_seq.nextval, ?, ?, ?)";
		//SELECT * FROM DEPTS INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES (depts_seq.nextval, 'TEST', 100, 3000); 
		try {
			
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.conn
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3.pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);//첫번째 물음표, name
			pstmt.setInt(2, Integer.parseInt(manager_id)); //정수로 변형
			pstmt.setString(3, location_id); //자동형변환
			
			//4. sql실행
			int result = pstmt.executeUpdate();
			
			System.out.println("성공실패?" + result);
			
		}catch (Exception e) {
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
