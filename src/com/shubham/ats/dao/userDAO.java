package com.shubham.ats.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.shubham.ats.dto.collegeDTO;
import com.shubham.ats.dto.roleDTO;
import com.shubham.ats.dto.userDTO;

public class userDAO {
	
	public static ArrayList showuser() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		ArrayList<userDTO> userlist = new ArrayList<>();
		pstmt = con.prepareStatement("select userid,email,contact from user_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			userDTO userdto = new userDTO();
			userdto.setUserid(rs.getString("userid"));
			userdto.setEmail(rs.getString("email"));
			userdto.setContact(rs.getString("contact"));
			userlist.add(userdto);
		}
		rs.close();
		pstmt.close();
		con.close();
		return userlist;	
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException, NamingException {
//		System.out.println(showrole());
//	}
}
