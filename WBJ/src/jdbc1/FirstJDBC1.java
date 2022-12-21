package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJDBC1 {

	public static void main(String[] args) {
		try {
			//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Establist Connection
			
			String url="jdbc:mysql://localhost:3306/query";
			String username = "root";
			String Pass = "Shubhu@278";
			Connection con = DriverManager.getConnection(url,username,Pass);
			
			if(con.isClosed()) {
				System.out.println("Connection is Closed");
			}
			else {
				System.out.println("Connection Created...");
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
