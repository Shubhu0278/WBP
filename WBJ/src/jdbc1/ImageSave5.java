package jdbc1;

import java.sql.*;
import java.io.*;

public class ImageSave5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/query","root","Shubhu@278");
			
			String q = "insert into Images(pic) value(?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			FileInputStream fis = new FileInputStream("dog7.jpg");
			
			pstmt.setBinaryStream(1, fis,fis.available());
			pstmt.executeUpdate();
			
			System.out.println("Done....!");
		}
		catch(Exception e) {
			System.out.println("Error....!");
		}
	}

}
