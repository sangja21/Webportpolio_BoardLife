package dao;

import static db.JdbcUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;

import vo.Boardgames2;
import vo.Offerclub;

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
			pstmt = con.prepareStatement("select count(*) from offer_club;");
			// offer_club table에 있는 자료들의 숫자를 세어보는 쿼리문
			
			//System.out.println("select count(*) from offer_club");
			
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
	
	public ArrayList<Offerclub> selectClubList(int page, int limit){
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// String club_list_sql="select * from offer_club order by club_num desc limit 1, 12;";
		
		String club_list_sql=
		"SELECT oc.club_num, oc.club_title, oc.user_id, oc.club_place, oc.club_day, oc.club_time, oc.club_intro, oc.start_date, oc.finish_date, oc.club_reps, oc.capacity, oc.membership_fee, bg.b_img"
		+ " FROM offer_club oc, board_game bg"
		+ " WHERE oc.b_id = bg.b_id"
		+ " ORDER BY club_num DESC"
		+ " LIMIT 1, 12;";
		
		ArrayList<Offerclub> clubList = new ArrayList<Offerclub>();
		// System.out.println(club_list_sql);
		Offerclub Club = null;
		//int startrow = (page-1)*12;
		
		try {
			pstmt = con.prepareStatement(club_list_sql);
			//System.out.println(club_list_sql);
			//System.out.println("prepareStatement");
			//System.out.println("startrow" + startrow);
			
			//pstmt.setInt(1, startrow);
			
			//System.out.println("pstmt.setInt(1, startrow)");
			
			rs = pstmt.executeQuery();
			
			//System.out.println("executeQuery");
			
			while(rs.next()) {
				Club = new Offerclub();
				Club.setClub_num(rs.getInt("club_num"));
				Club.setClub_title(rs.getString("club_title"));
				Club.setClub_intro(rs.getString("club_intro"));
				Club.setUser_id(rs.getString("user_id"));
				Club.setClub_day(rs.getString("club_day"));
				Club.setClub_place(rs.getString("club_place"));
				Club.setClub_time(rs.getString("club_time"));
				Club.setClub_reps(rs.getInt("club_reps"));
				Club.setStart_date(rs.getString("start_date"));
				Club.setFinish_date(rs.getString("finish_date"));
				Club.setMembership_fee(rs.getInt("Membership_fee"));
				Club.setCapacity(rs.getInt("capacity"));
				Club.setB_img(rs.getString("b_img"));
				clubList.add(Club);
			}
			
		} catch(Exception ex) {
			
			System.out.println("problem");
			ex.printStackTrace();
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return clubList;
	} // selectClubList();
	
	
	public String boardgame_img(String b_id) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Boardgames2 bg = null;
		
		try{
			pstmt = con.prepareStatement(
					"select b_img from board_game2 where b_id = ?;");
			pstmt.setString(1, b_id);
			rs= pstmt.executeQuery();

			if(rs.next()){
				bg = new Boardgames2();
				bg.setB_img(rs.getString("b_img"));
			}
		}catch(Exception ex){
			
			ex.printStackTrace();
			
		}finally{
			close(rs);
			close(pstmt);
		}
		
		
		return "";
	} // boardgame_img();
	


} // Function_DAO.class
