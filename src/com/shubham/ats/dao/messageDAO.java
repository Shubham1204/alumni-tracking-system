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
import com.shubham.ats.dto.messageDTO;
import com.shubham.ats.dto.noticeDTO;
import com.shubham.ats.dto.roleDTO;

public class messageDAO {

	
	public static boolean addmessage(String sessemail,String messagesubject,String scontact,String rcontact,String desc) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmtmap1 = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into message_mst(messagesubject,scontact,rcontact,description) values(?,?,?,?)");
		pstmt.setString(1, messagesubject);
		pstmt.setString(2, scontact);
		pstmt.setString(3, rcontact);
		pstmt.setString(4, desc);
//		pstmt.setString(5, date);
		int recordCount = pstmt.executeUpdate();
		pstmtmap1 = con.prepareStatement("insert into user_message_mapping(userid,messageid) values((select uid from user_mst where email=?),(select messageid from message_mst where messagesubject=?))");
		pstmtmap1.setString(1,sessemail);
		pstmtmap1.setString(2, messagesubject);
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

	
	
	public static ArrayList showmessage() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		ArrayList<messageDTO> messagelist = new ArrayList<>();
		pstmt = con.prepareStatement("select messageid,messagesubject,description,scontact,rcontact from message_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			messageDTO messagedto = new messageDTO();
			messagedto.setMessageid(rs.getInt("messageid"));
			messagedto.setMessagesubject(rs.getString("messagesubject"));
			messagedto.setDescription(rs.getString("description"));
			messagedto.setScontact(rs.getString("scontact"));
			messagedto.setRcontact(rs.getString("rcontact"));
			messagelist.add(messagedto);
		}
		rs.close();
		pstmt.close();
		con.close();
		return messagelist;	
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException, NamingException {
//		System.out.println(showrole());
//	}
}
