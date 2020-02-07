package com.shubham.ats.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.http.HttpSession;

import com.shubham.ats.dto.collegeDTO;
import com.shubham.ats.dto.emailDTO;
import com.shubham.ats.dto.noticeDTO;
import com.shubham.ats.dto.roleDTO;

public class emailDAO {

	
	public static boolean addemail(String sessemail,String emailsubject,String semail,String remail,String desc) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmtmap1 = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into email_mst(emailsubject,semail,remail,description) values(?,?,?,?)");
		pstmt.setString(1, emailsubject);
		pstmt.setString(2, semail);
		pstmt.setString(3, remail);
		pstmt.setString(4, desc);
//		pstmt.setString(5, date);
		int recordCount = pstmt.executeUpdate();
		pstmtmap1 = con.prepareStatement("insert into user_email_mapping(userid,emailid) values((select uid from user_mst where email=?),(select emailid from email_mst where emailsubject=?))");
		pstmtmap1.setString(1,sessemail);
		pstmtmap1.setString(2, emailsubject);
		int recordCountmap1 = pstmtmap1.executeUpdate();
		if(recordCount>0) {
				if(recordCountmap1>0) {
//			msg = "Register SuccessFully";
			System.out.println("register successfully");
			return true;
			}
		}
		return false;
	}

	
	
	public static ArrayList showemail() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		ArrayList<emailDTO> emaillist = new ArrayList<>();
		pstmt = con.prepareStatement("select emailid,emailsubject,description,semail,remail from email_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			emailDTO emaildto = new emailDTO();
			emaildto.setEmailid(rs.getInt("emailid"));
			emaildto.setEmailsubject(rs.getString("emailsubject"));
			emaildto.setDescription(rs.getString("description"));
			emaildto.setSemail(rs.getString("semail"));
			emaildto.setRemail(rs.getString("remail"));
			emaillist.add(emaildto);
		}
		rs.close();
		pstmt.close();
		con.close();
		return emaillist;	
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException, NamingException {
//		System.out.println(showrole());
//	}
}
