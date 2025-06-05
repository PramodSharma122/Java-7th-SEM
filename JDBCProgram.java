// Date: 2025-05-28

package databaseprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCProgram {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsccsit", "root", "");

			String sql = "INSERT INTO students (id,name,address) VALUES (1,'ram','bharatpur')";
			PreparedStatement ps = con.prepareStatement(sql);

			int i = ps.executeUpdate();

			if (i > 0) {
				System.out.println("Successfully recorded");
			} else {
				System.out.println("Failed to insert records");
			}

			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
