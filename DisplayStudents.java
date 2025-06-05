// Date: 2025-06-02

package databaseprogram;

import java.sql.*;

public class DisplayStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bsccsit";
        String user = "root";
        String password = "";

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );
            ResultSet rs = stmt.executeQuery("SELECT * FROM students")
        ) {
            // 1. Update all student names to "Ramesh"
            while (rs.next()) {
                rs.updateString("name", "Ramesh");
                rs.updateRow();
            }

            // 2. Insert one new student record using ResultSet
            rs.moveToInsertRow();
            rs.updateInt("id", 6);
            rs.updateString("name", "Sita");
            rs.updateString("address", "pokhara");
            rs.insertRow();

            // 3. Insert multiple students using Statement and addBatch()
            stmt.addBatch("INSERT INTO students VALUES (7, 'Ramila', 'Butwal')");
            stmt.addBatch("INSERT INTO students VALUES (8, 'Bikash', 'Hetauda')");
            stmt.executeBatch();

            // 4. Insert using PreparedStatement and batch
            PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES (?, ?, ?)");
            ps.setInt(1, 9);
            ps.setString(2, "Rabin");
            ps.setString(3, "Damak");
            ps.addBatch();

            ps.setInt(1, 10);
            ps.setString(2, "Kritika");
            ps.setString(3, "Janakpur");
            ps.addBatch();

            ps.executeBatch();

            // 5. Display all student records
            System.out.println("Students Table of adavancejava Database:\n");

            // Re-execute the query to get updated records
            try (ResultSet rs2 = stmt.executeQuery("SELECT * FROM students")) {
                ResultSetMetaData rsmd = rs2.getMetaData();
                int columnCount = rsmd.getColumnCount();

                // Print column names
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rsmd.getColumnName(i) + "\t");
                }
                System.out.println();

                // Print records
                while (rs2.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(rs2.getString(i) + "\t");
                    }
                    System.out.println();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
