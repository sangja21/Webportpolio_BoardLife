package dao;

import static db.JdbcUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;

import vo.Offer_club;

public class Club_Function_DAO {
	// 쿼리문 실행을 담당하는 클래스

	DataSource ds;
	Connection con;
	private static Club_Function_DAO boardDAO;

	private Club_Function_DAO() {
	}

	public static Club_Function_DAO getInstance(){
		if(boardDAO == null){
			boardDAO = new Club_Function_DAO();
		}
		return boardDAO;
	}

	public void setConnection(Connection con){
		this.con = con;
	}
	
	
	public int club_selectListCount() {
		
		int listCount = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = con.prepareStatement("select count(*) from offer_club");
			// offer_club table에 있는 자료들의 숫자를 세어보는 쿼리문
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				listCount = rs.getInt(1);
			}
			
		} catch(Exception ex) {
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return listCount;
		
	} // club_selectListCount()
	
	public ArrayList<Offer_club> selectClubList(int page, int limit){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String club_list_sql="select * from board offer_club order by club_num desc limit ?,12";
		ArrayList<Offer_club> clubList = new ArrayList<Offer_club>();
		Offer_club Club = null;
		int startrow = (page-1)*10;
		
		try {
			pstmt = con.prepareStatement(club_list_sql);
			pstmt.setInt(1, startrow);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				Club = new Offer_club();
				Club.setClub_num(rs.getInt("club_num"));
				Club.setClub_title(rs.getString("club_title"));
				Club.setClub_intro(rs.getString("club_intro"));
				Club.setUser_id(rs.getString("user_id"));
				Club.setB_id(rs.getString("b_id"));
				Club.setClub_day(rs.getString("club_day"));
				Club.setClub_place(rs.getString("club_place"));
				Club.setClub_time(rs.getString("club_time"));
				Club.setClub_reps(rs.getInt("club_reps"));
				Club.setStart_date(rs.getString("club_date"));
				Club.setMembership_fee(rs.getInt("Membership_fee"));
				Club.setCapacity(rs.getInt("capacity"));
				clubList.add(Club);
			}
			
		} catch(Exception ex) {
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return clubList;
		
		
	} // selectClubList();
	


} // Function_DAO.class
