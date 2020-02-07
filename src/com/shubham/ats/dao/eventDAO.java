package com.shubham.ats.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.http.HttpSession;

import com.shubham.ats.dto.collegeDTO;
import com.shubham.ats.dto.eventDTO;
import com.shubham.ats.dto.noticeDTO;
import com.shubham.ats.dto.roleDTO;

public class eventDAO {

	
	public static boolean addevent(String sessemail,String eventname,String contact,String email,String desc,String date,String time,String venue) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmtmap1 = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into event_mst(eventname,contact,email,description,date,time,venue) values(?,?,?,?,?,?,?)");
		pstmt.setString(1, eventname);
		pstmt.setString(2, contact);
		pstmt.setString(3, email);
		pstmt.setString(4, desc);
		pstmt.setString(5, date);
		pstmt.setString(6, time);
		pstmt.setString(7, venue);
		int recordCount = pstmt.executeUpdate();
		pstmtmap1 = con.prepareStatement("insert into user_event_mapping(userid,eventid) values((select uid from user_mst where email=?),(select eventid from event_mst where eventname=?))");
		pstmtmap1.setString(1,sessemail);
		pstmtmap1.setString(2, eventname);
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

	
	
	public static ArrayList showevent() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		ArrayList<eventDTO> eventlist = new ArrayList<>();
		pstmt = con.prepareStatement("select eventid,eventname,description,email,contact,date,time,venue from event_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			eventDTO eventdto = new eventDTO();
			eventdto.setEventid(rs.getInt("eventid"));
			eventdto.setEventname(rs.getString("eventname"));
			eventdto.setDescription(rs.getString("description"));
			eventdto.setEmail(rs.getString("email"));
			eventdto.setContact(rs.getString("contact"));
			eventdto.setDate(rs.getString("date"));
			eventdto.setTime(rs.getString("time"));
			eventdto.setVenue(rs.getString("venue"));
			eventlist.add(eventdto);
		}
		rs.close();
		pstmt.close();
		con.close();
		return eventlist;	
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException, NamingException {
//		System.out.println(showrole());
//	}
}
