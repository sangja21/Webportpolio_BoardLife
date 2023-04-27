package dao;

import static db.JdbcUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import vo.*;

public class Info_Function_DAO {

	DataSource ds;
	Connection con;
	private static Info_Function_DAO boardDAO;

	private Info_Function_DAO() {
	}

	public static Info_Function_DAO getInstance(){
		if(boardDAO == null){
			boardDAO = new Info_Function_DAO();
		}
		return boardDAO;
	}

	public void setConnection(Connection con){
		this.con = con;
	}

	public int selectListCount() {

		int listCount= 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			pstmt=con.prepareStatement("select count(*) from board_game2");
			rs = pstmt.executeQuery();
			if(rs.next()){
				listCount=rs.getInt(1);
			}
		}catch(Exception ex){

		}finally{
			close(rs);
			close(pstmt);
		}

		return listCount;

	}
	
	public ArrayList<Boardgames2> selectArticleList(int page,int limit){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Boardgames2 board = null;
		String board_list_sql="select * from board_game2 order by b_id desc limit ?,50";
		ArrayList<Boardgames2> articleList = new ArrayList<Boardgames2>();
		
		int startrow=(page-1)*10; 
		
		try{
			pstmt = con.prepareStatement(board_list_sql);
			pstmt.setInt(1, startrow);
			rs = pstmt.executeQuery();

			while(rs.next()){
				board = new Boardgames2();
        		

        		board.setB_id(rs.getString("b_id"));
        		board.setB_img(rs.getString("b_img"));
        		board.setB_title_kor(rs.getString("b_title_kor"));
        		board.setB_title_eng(rs.getString("b_title_eng"));
        		board.setYearof(rs.getString("yearof"));
        		board.setPnum(rs.getString("pnum"));
        		board.setRunning_time(rs.getString("running_time"));
        		board.setAge(rs.getString("age"));
        		board.setGame_level(rs.getInt("game_level"));
        		board.setSub_lang(rs.getString("sub_lang"));
        		board.setB_detail(rs.getString("b_detail"));
        		board.setPublisher(rs.getString("publisher"));
        		board.setGeeklink(rs.getString("geeklink"));
        		board.setDesigner(rs.getString("designer"));
        		board.setB_theme(rs.getString("b_theme"));
        		board.setProceed(rs.getString("proceed"));
				articleList.add(board);
			}

		}catch(Exception ex){
			System.out.println(ex);
		}finally{
			close(rs);
			close(pstmt);
		}

		return articleList;

	}

}
