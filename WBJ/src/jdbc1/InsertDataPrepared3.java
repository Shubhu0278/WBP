package jdbc1;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;

public class InsertDataPrepared3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Drive");
			
			String url = "jdbc:mysql://localhost:3306/query";
			String username = "root";
			String pass = "Shubhu@278";
			
			Connection con = DriverManager.getConnection(url,username,pass);
			
			String q ="insert into table1(tName,iCity) values(?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1,"Shubham Tembhurne");
			pstmt.setString(2,"Aniket Rangari");
			
			System.out.println("Inserted...");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
