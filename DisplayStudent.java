// Date: 2025-06-02

package databaseprogram;

import java.sql.*;

public class DisplayStudent {
    static final String DATABASE_URL = "jdbc:mysql://localhost/bsccsit";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Connect to database
            connection = DriverManager.getConnection(DATABASE_URL, "root", "");

            // Step 2: Update all student names to "UpdatedName"
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rsUpdate = statement.executeQuery("SELECT * FROM students");
            while (rsUpdate.next()) {
                rsUpdate.updateString("name", "ram");
                rsUpdate.updateRow();
            }

            // Step 3: Insert one student using updatable ResultSet
            rsUpdate.moveToInsertRow();
            rsUpdate.updateInt("id", 13);  // Ensure this ID is not used already
            rsUpdate.updateString("name", "Subash");
            rsUpdate.updateString("address", "Pokhara");
            rsUpdate.insertRow();
            rsUpdate.beforeFirst();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            // Step 4: Batch insert using Statement
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            statement.addBatch("INSERT INTO students VALUES (14, 'Hari', 'Kathmandu')");
            statement.addBatch("INSERT INTO students VALUES (15, 'Ram', 'Butwal')");
            statement.addBatch("INSERT INTO students VALUES (16, 'Shyam', 'Chitwan')");
            statement.addBatch("INSERT INTO students VALUES (17, 'Govinda', 'Dharan')");
            statement.executeBatch();
            connection.commit();
        } catch (BatchUpdateException b) {
            b.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            // Step 5: Batch insert using PreparedStatement
            connection.setAutoCommit(false);
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO students VALUES (?, ?, ?)");
            pstmt.setInt(1, 18);
            pstmt.setString(2, "Navin");
            pstmt.setString(3, "Baglung");
            pstmt.addBatch();

            pstmt.setInt(1, 19);
            pstmt.setString(2, "Rajesh");
            pstmt.setString(3, "Tanahun");
            pstmt.addBatch();

            pstmt.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            // Step 6: Display all students
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM students");

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            System.out.println("\nStudents Table from 'adavancejava' Database:\n");

            for (int i = 1; i <= columnCount; i++) {
                System.out.printf("%-15s", metaData.getColumnName(i));
            }
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.printf("%-15s", resultSet.getObject(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) {
                    connection.setAutoCommit(true);
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}