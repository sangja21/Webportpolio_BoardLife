package dao;

import static db.JdbcUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;

public class Function_DAO {
	// 쿼리문 실행을 담당하는 클래스

	DataSource ds;
	Connection con;
	private static Function_DAO boardDAO;

	private Function_DAO() {
	}

	public static Function_DAO getInstance(){
		if(boardDAO == null){
			boardDAO = new Function_DAO();
		}
		return boardDAO;
	}

	public void setConnection(Connection con){
		this.con = con;
	}

	


} // Function_DAO.class
