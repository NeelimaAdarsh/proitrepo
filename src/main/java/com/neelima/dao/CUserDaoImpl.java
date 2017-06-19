package com.neelima.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.PreparedStatement;
import com.neelima.model.LoginModel;

public class CUserDaoImpl implements IUserDao {
	String uName = null;
	String psw= null;

	public boolean isValidUser(LoginModel loginModel) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try {
			Connection conn = DriverManager.getConnection("com.mysql.jdbc.Driver", "root", "root");
			String query = "Select * from user_pass where username = ? and password = ?";
			PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(query);
			pstmt.setString(1, loginModel.getUserName());
			pstmt.setString(2, loginModel.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
		return false;
	}
}
