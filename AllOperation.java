// Date: 2025-06-02

package databaseprogram;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;

public class AllOperation {
	AllOperation() {
		JFrame f = new JFrame();
		JLabel lblRollno = new JLabel("Roll Number");
		lblRollno.setBounds(10, 10, 150, 20);
		f.add(lblRollno);
		JTextField txtRollno = new JTextField();
		txtRollno.setBounds(100, 10, 150, 20);
		f.add(txtRollno);
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 40, 150, 20);
		f.add(lblName);
		JTextField txtName = new JTextField();
		txtName.setBounds(100, 40, 150, 20);
		f.add(txtName);
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 70, 150, 20);
		f.add(lblAddress);
		JTextField txtAddress = new JTextField();
		txtAddress.setBounds(100, 70, 150, 20);
		f.add(txtAddress);
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(20, 110, 80, 20);
		f.add(btnInsert);
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(110, 110, 80, 20);
		f.add(btnDelete);
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(200, 110, 80, 20);
		f.add(btnUpdate);
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(290, 110, 80, 20);
		f.add(btnSearch);
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsccsit", "root", "");
					String sql = "Insert into students (id,name,address) values(?,?,?)";
					PreparedStatement ptst = conn.prepareStatement(sql);
					ptst.setInt(1, Integer.parseInt(txtRollno.getText()));
					ptst.setString(2, txtName.getText());
					ptst.setString(3, txtAddress.getText());
					ptst.executeUpdate();
					if (ptst.getUpdateCount() > 0)
						JOptionPane.showMessageDialog(null, "Data inserted Successfully");
					conn.close();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsccsit", "root", "");
					String sql = "delete from students where id=?";
					PreparedStatement ptst = conn.prepareStatement(sql);
					ptst.setInt(1, Integer.parseInt(txtRollno.getText()));
					ptst.executeUpdate();
					if (ptst.getUpdateCount() > 0)
						JOptionPane.showMessageDialog(null, "Data deleted Successfully");
					else
						JOptionPane.showMessageDialog(null, "Data not Found");
					conn.close();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsccsit", "root", "");
					String sql = "update students set id=?,name=?,address=? where id=?";
					PreparedStatement ptst = conn.prepareStatement(sql);
					ptst.setInt(1, Integer.parseInt(txtRollno.getText()));
					ptst.setString(2, txtName.getText());
					ptst.setString(3, txtAddress.getText());
					ptst.setInt(4, Integer.parseInt(txtRollno.getText()));
					ptst.executeUpdate();
					if (ptst.getUpdateCount() > 0)
						JOptionPane.showMessageDialog(null, "Data Updated Successfully");
					else
						JOptionPane.showMessageDialog(null, "Data not found");
					conn.close();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsccsit", "root", "");
					String sql = "select * from students where id=?";
					PreparedStatement ptst = conn.prepareStatement(sql);
					ptst.setInt(1, Integer.parseInt(txtRollno.getText()));
					ResultSet rs = ptst.executeQuery();
					if (rs.next()) {
						txtName.setText(rs.getString("Name"));
						txtAddress.setText(rs.getString("Address"));
					} else {
						JOptionPane.showMessageDialog(null, "Data not Found");
					}
					conn.close();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		f.setSize(400, 500);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new AllOperation();
	}
}