package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBCquery2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			String url = "jdbc:mysql://localhost:3306/query";
			String username = "root";
			String pass = "Shubhu@278";
			
			Connection con = DriverManager.getConnection(url,username,pass);
			
			String q = "create table table1(tId int(20) primary key auto_increment, "
					+ "tName varchar(200) not null, "
					+ "tCity varchar(400))";
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table created in databse...");
			
			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
