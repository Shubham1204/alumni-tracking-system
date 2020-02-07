package com.shubham.ats.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shubham.ats.dto.rightsDTO;
import com.shubham.ats.dto.roleDTO;
import com.shubham.ats.dto.rolerightDTO;

public interface rolerightDAO {

	public static ArrayList existingroleright() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
//		ArrayList<rightsDTO> rightlist = new ArrayList<>();
		ResultSet rs = null;
		ArrayList<rolerightDTO> rolerightlist = new ArrayList<>();
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select role_mst.rolename,role_mst.description,right_mst.rightname from role_mst,right_mst,role_right_mapping"
				+ " where role_mst.roleid=role_right_mapping.roleid and right_mst.rightid=role_right_mapping.rightid");
//		pstmt = con.prepareStatement("select role_mst.rolename,role_mst.description,right_mst.rightname from role_mst,right_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			rolerightDTO rolerightdto = new rolerightDTO();
//			int roleid = rs.getInt("roleid");
			rolerightdto.setRolename(rs.getString("rolename"));
			rolerightdto.setDescription(rs.getString("description"));
			rolerightdto.setRights(rs.getString("rightname"));
//			pstmtright = con.prepareStatement("select rightname from right_mst where rightid in(select rightid from role_right_mapping where roleid in (select roleid from role_mst where rolename=?))");
//			pstmtright.setString(1,rs.getString("rolename"));
//			rsright = pstmtright.executeQuery();
//			while(rsright.next()) {
//				rightsDTO rightdto = new rightsDTO();
//				rightdto.setRightname(rsright.getString("rightname"));
//				rightlist.add(rightdto);
//				System.out.println(rightlist);
//			}
//			rightlist.add(rightdto);
//			rolerightdto.setRights(rightlist);
			rolerightlist.add(rolerightdto);
//			System.out.println(rolelist);
		}
		System.out.println(rolerightlist);
		rs.close();
		pstmt.close();
		con.close();
		return rolerightlist;		
	}
	
//	public static ArrayList existingright() throws ClassNotFoundException, SQLException {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		ArrayList<rightsDTO> rightlist = new ArrayList<>();
//		con = CommonDAO.getConnection();
//		pstmt = con.prepareStatement("select rightname,link from right_mst");
//		rs = pstmt.executeQuery();
//		while(rs.next()) {
//			rightsDTO rightdto = new rightsDTO();
////			rightdto.setRightname(rs.getInt("rightid"));
//			rightdto.setRightname(rs.getString("rightname"));
////			rightdto.setDescription(rs.getString("description"));
//			rightdto.setScreenname(rs.getString("link"));
//			rightlist.add(rightdto);
//			System.out.println(rightlist);
//		}
//		rs.close();
//		pstmt.close();
//		con.close();
//		return rightlist;		
//	}
}
