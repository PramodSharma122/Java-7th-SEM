// Date: 2025-06-02

package databaseprogram;

import java.sql.*;
import javax.swing.JOptionPane;

public class ScrollResultSet {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsccsit", "root", "");
			String sql = "select * from students";
			PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			rs.first();
			System.out.println("\nFirst Record");
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			rs.absolute(3);
			System.out.println("\nThird Record");
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			rs.last();
			System.out.println("\nLast Record");
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			rs.previous();
			System.out.println("\nPrevious of Last Record");
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
