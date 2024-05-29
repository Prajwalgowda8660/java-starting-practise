package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
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
			String sql="INSERT INTO teacher_info VALUES(37,'gopiii',999997878,7.5)";

			//step 3
			Statement stm = con.createStatement();
			//step 4 
			stm.execute(sql);
			System.out.println("done");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
