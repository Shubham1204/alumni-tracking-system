package com.shubham.ats.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.shubham.ats.dto.rightsDTO;
import com.shubham.ats.dto.userDTO;

public interface ATSDAO {
	
	public static userDTO login(String email, String password) throws ClassNotFoundException, SQLException, NamingException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<rightsDTO> rights = null;
		userDTO userDTO = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("SELECT USER_MST.USERID AS USERID, ROLE_MST.ROLENAME AS ROLE,RIGHT_MST.RIGHTNAME,RIGHT_MST.LINK FROM USER_MST, ROLE_MST,RIGHT_MST "
				+ ",USER_ROLE_MAPPING,ROLE_RIGHT_MAPPING WHERE USER_MST.UID=USER_ROLE_MAPPING.USERID AND ROLE_MST.ROLEID=USER_ROLE_MAPPING.ROLEID "
				+ "AND ROLE_MST.ROLEID=ROLE_RIGHT_MAPPING.ROLEID AND RIGHT_MST.RIGHTID=ROLE_RIGHT_MAPPING.RIGHTID and USER_MST.EMAIL=? and PASSWORD=?");
//		pstmt = con.prepareStatement("select userid, password "
//				+ "from user_mst where userid=? and password=?");
		pstmt.setString(1, email);
		pstmt.setString(2, password);
		rs = pstmt.executeQuery();
		System.out.println(pstmt);
		System.out.println(rs);
		 while(rs.next()){
			  if(userDTO == null){
				userDTO = new userDTO();
				  userDTO.setUserid(rs.getString("USERID"));
				  userDTO.setRolename(rs.getString("ROLE"));
				  rights= new ArrayList<rightsDTO>();
				  userDTO.setRights(rights);
			  }
			  rightsDTO right = new rightsDTO(rs.getString("RIGHTNAME"), rs.getString("link"));
			  rights.add(right);
//			  return true;
		  }
//		if(rs.next()) {
////			msg = "Welcome "+userid;
//			System.out.println("Login successful");
//			return true;
//		}
//		 return false;
		 return userDTO;
	}


}