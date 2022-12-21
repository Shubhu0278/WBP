package jdbc1;

//Update Table

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class UpadateTable1 {

	public static void main(String[] args) {
		try {
			
			Connection con= ConnectionProvider.getConnection();
			String q = "update table1 set tName =?,tCity=? where tId=? ";
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter New Name");
			String name = br.readLine();
			
			System.out.println("Enter New City");
			String city = br.readLine();
			
			System.out.println("Enter The Id");
			int id = Integer.parseInt(br.readLine());
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1,name);
			pstmt.setString(2,city);
			
			pstmt.setInt(3, id);
			
			pstmt.executeUpdate();
			
			System.err.println("done...!");
			
			con.close();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Error...!");
		}
	}

}
