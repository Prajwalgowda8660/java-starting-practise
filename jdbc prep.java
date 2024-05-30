package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Mikki {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		String url="jdbc:postgresql://localhost:5432/alvas?user=postgres&password=root";
       Connection con=null;
		try {
			//step 1
			Class.forName("org.postgresql.Driver");
			//step 2
			 con=DriverManager.getConnection(url);
			String sql="INSERT INTO teacher_info VALUES(?,?,?,?)";

			//step 3 // using Prepared statement
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, sc.nextInt());
			ps.setString(2,sc.next());
			ps.setLong(3, sc.nextLong());
			ps.setDouble(4, sc.nextDouble());
			//step 4 
			ps.execute();
			System.out.println("inserted");
					} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null)
				{
					con.close();
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	
	}
}}
