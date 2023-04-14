package svc;

import static db.JdbcUtil.*;
import java.sql.Connection;
import java.util.ArrayList;
import dao.Club_Function_DAO;
import vo.Offer_club;

public class Club_BoardListService {

	public int getListCount() throws Exception{
		int listCount = 0;
		Connection con = getConnection();
		Club_Function_DAO boardDAO = Club_Function_DAO.getInstance();
		boardDAO.setConnection(con);
		listCount = boardDAO.club_selectListCount();
		close(con);
		return listCount;
		
	}

	public ArrayList<Offer_club> getArticleList(int page, int limit) throws Exception{
		
		ArrayList<Offer_club> articleList = null;
		Connection con = getConnection();
		Club_Function_DAO boardDAO = Club_Function_DAO.getInstance();
		boardDAO.setConnection(con);
		articleList = boardDAO.selectClubList(page,limit);
		close(con);
		return articleList;
		
	}

}
