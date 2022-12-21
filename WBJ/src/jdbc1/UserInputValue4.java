package jdbc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserInputValue4 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/query";
			String username = "root";
			String pass = "Shubhu@278";
			
			Connection con = DriverManager.getConnection(url,username,pass);
			
			String q ="insert into table1(tname,tCity) values(?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name...");
			String name = br.readLine();
			
			System.out.println("Enter City...");
			String city = br.readLine();
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
			pstmt.executeUpdate();
			
			System.out.println("Insertd");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
