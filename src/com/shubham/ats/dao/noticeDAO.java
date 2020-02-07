package com.shubham.ats.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.http.HttpSession;

import com.shubham.ats.dto.collegeDTO;
import com.shubham.ats.dto.noticeDTO;
import com.shubham.ats.dto.roleDTO;

public class noticeDAO {

	
	public static boolean addnotice(String sessemail,String noticesubject,String contact,String email,String desc,String date) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmtmap1 = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into notice_mst(noticesubject,contact,email,description,date) values(?,?,?,?,?)");
		pstmt.setString(1, noticesubject);
		pstmt.setString(2, contact);
		pstmt.setString(3, email);
		pstmt.setString(4, desc);
		pstmt.setString(5, date);
		int recordCount = pstmt.executeUpdate();
		pstmtmap1 = con.prepareStatement("insert into user_notice_mapping(userid,noticeid) values((select uid from user_mst where email=?),(select noticeid from notice_mst where noticesubject=?))");
		pstmtmap1.setString(1,sessemail);
		pstmtmap1.setString(2, noticesubject);
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

	
	
	public static ArrayList shownotice() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		ArrayList<noticeDTO> noticelist = new ArrayList<>();
		pstmt = con.prepareStatement("select noticeid,noticesubject,description,email,contact,date from notice_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			noticeDTO noticedto = new noticeDTO();
			noticedto.setNoticeid(rs.getInt("noticeid"));
			noticedto.setNoticesubject(rs.getString("noticesubject"));
			noticedto.setDescription(rs.getString("description"));
			noticedto.setEmail(rs.getString("email"));
			noticedto.setContact(rs.getString("contact"));
			noticedto.setDate(rs.getString("date"));
			noticelist.add(noticedto);
		}
		rs.close();
		pstmt.close();
		con.close();
		return noticelist;	
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException, NamingException {
//		System.out.println(showrole());
//	}
}
