package com.shubham.ats.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.shubham.ats.dto.collegeDTO;
import com.shubham.ats.dto.roleDTO;

public class collegeDAO {

	
	public static boolean registercollege(String cllgname,String contact,String email,String desc,String cllgaddress) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmtmap,pstmtmap1 = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into college_mst(collegename,contact,email,description,address) values(?,?,?,?,?)");
		pstmt.setString(1, cllgname);
		pstmt.setString(2, contact);
		pstmt.setString(3, email);
		pstmt.setString(4, desc);
		pstmt.setString(5, cllgaddress);
		int recordCount = pstmt.executeUpdate();
		pstmtmap = con.prepareStatement("insert into user_mst(userid,contact,email,password) values(?,?,?,?)");
		pstmtmap.setString(1,cllgname);
		pstmtmap.setString(2, contact);
		pstmtmap.setString(3, email);
		pstmtmap.setString(4, email);
		int recordCountmap = pstmtmap.executeUpdate();
		pstmtmap1 = con.prepareStatement("insert into user_role_mapping(userid,roleid) values((select uid from user_mst where email=?),(select roleid from role_mst where rolename=?))");
		pstmtmap1.setString(1,email);
		pstmtmap1.setString(2, "college");
		int recordCountmap1 = pstmtmap1.executeUpdate();
		if(recordCount>0) {
			if(recordCountmap>0) {
				if(recordCountmap1>0) {
//			msg = "Register SuccessFully";
			System.out.println("register successfully");
			return true;
			}
			}
		}
		return false;
	}

	
	
	public static ArrayList showcollege() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		ArrayList<collegeDTO> collegelist = new ArrayList<>();
		pstmt = con.prepareStatement("select collegeid,collegename,description,email,contact,address from college_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			collegeDTO collegedto = new collegeDTO();
			collegedto.setCollegeid(rs.getInt("collegeid"));
			collegedto.setCollegename(rs.getString("collegename"));
			collegedto.setDescription(rs.getString("description"));
			collegedto.setEmail(rs.getString("email"));
			collegedto.setContact(rs.getString("contact"));
			collegedto.setAddress(rs.getString("address"));
			collegelist.add(collegedto);
		}
		rs.close();
		pstmt.close();
		con.close();
		return collegelist;	
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException, NamingException {
//		System.out.println(showrole());
//	}
}
