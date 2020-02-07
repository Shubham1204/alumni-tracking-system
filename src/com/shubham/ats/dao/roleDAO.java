package com.shubham.ats.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shubham.ats.dto.collegeDTO;
import com.shubham.ats.dto.rightsDTO;
import com.shubham.ats.dto.roleDTO;

public interface roleDAO {

	public static ArrayList existingrole() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<roleDTO> rolelist = new ArrayList<>();
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select roleid,rolename,description from role_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			roleDTO roledto = new roleDTO();
			roledto.setRolename(rs.getString("rolename"));
			roledto.setDescription(rs.getString("description"));
			rolelist.add(roledto);
		}
		rs.close();
		pstmt.close();
		con.close();
		return rolelist;		
	}
	
	public static ArrayList showright() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		ArrayList<rightsDTO> rightlist = new ArrayList<>();
		pstmt = con.prepareStatement("select rightname,link from right_mst");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			rightsDTO rightdto = new rightsDTO();
			rightdto.setRightname(rs.getString("rightname"));
			rightdto.setScreenname(rs.getString("link"));
			rightlist.add(rightdto);
		}
		rs.close();
		pstmt.close();
		con.close();
		return rightlist;	
	}
	
	public static boolean addnewrole(String rolename,String desc,String rightlist[]) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement pstmt,pstmtmap = null;
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into role_mst(rolename,description) values(?,?)");
		pstmt.setString(1, rolename);
		pstmt.setString(2, desc);
		int recordcount = pstmt.executeUpdate();
		if(rightlist!=null) {
			for(int i=0;i<rightlist.length;i++) {
				pstmtmap = con.prepareStatement("insert into role_right_mapping(roleid,rightid) values((select roleid from role_mst where rolename=?),(select rightid from right_mst where rightname=?))");
				pstmtmap.setString(1, rolename);
				pstmtmap.setString(2, rightlist[i]);
				int recordcountmap = pstmtmap.executeUpdate();
			}
		}		
		if(recordcount>0) {
				System.out.println("register successfully");
				return true;
		}
		pstmt.close();
		con.close();
		return false;
		
	}

}
