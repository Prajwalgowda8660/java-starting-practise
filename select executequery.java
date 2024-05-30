package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mikki {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/alvas?user=postgres&password=root";

		try {
			//step 1
			Class.forName("org.postgresql.Driver");
			//step 2
			Connection con=DriverManager.getConnection(url);
			String sql="SELECT* FROM teacher_info"  ;

			//step 3
			Statement stm = con.createStatement();
			//step 4 
			ResultSet rs =stm.executeQuery(sql);//execute query method
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getLong(3));
				System.out.println(rs.getDouble(4));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
