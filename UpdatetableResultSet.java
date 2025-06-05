// Date: 2025-06-01

package databaseprogram;

import java.sql.*;
import javax.swing.JOptionPane;

public class UpdatetableResultSet {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsccsit", "root", "");
			String sql = "select * from students";
			PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			rs.absolute(1);
			rs.updateInt(1, 103);
			rs.updateString(2, "Sabin");
			rs.updateString(3, "Tandi");
			rs.updateRow();
//rs.absolute(0);
			rs.beforeFirst();
			System.out.println("\n");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			rs.absolute(1);
			rs.deleteRow();
//rs.absolute(0);
			rs.beforeFirst();
			System.out.println("\n");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
