package svc;

import static db.JdbcUtil.*;
import java.sql.Connection;
import java.util.ArrayList;
import dao.Club_Function_DAO;
import vo.Offerclub;

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

	public ArrayList<Offerclub> getclubList(int page, int limit) throws Exception{
		System.out.println("getclubList");
		
		ArrayList<Offerclub> clubList = null;
		Connection con = getConnection();
		Club_Function_DAO boardDAO = Club_Function_DAO.getInstance();
		// Club_Fuction_DAO의 싱글톤 패턴 코드
		boardDAO.setConnection(con);
		clubList = boardDAO.selectClubList(page,limit);
		close(con);
		
		return clubList;
	}

}
