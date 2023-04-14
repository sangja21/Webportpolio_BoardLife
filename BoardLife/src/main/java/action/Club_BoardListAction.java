package action;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import svc.Club_BoardListService;
import vo.ActionForward;
import vo.Club_PageInfo;
import vo.Offer_club;

 public class Club_BoardListAction implements Action {
	 
	 public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
		 
		ArrayList<Offer_club> articleList=new ArrayList<Offer_club>();
	  	int page=1;
		int limit=10;
		
		if(request.getParameter("page")!=null){
			page=Integer.parseInt(request.getParameter("page"));
		}

		
		Club_BoardListService boardListService = new Club_BoardListService();
		int listCount=boardListService.getListCount();
		articleList = boardListService.getArticleList(page,limit);
   		int maxPage=(int)((double)listCount/limit+0.95); 
   		int startPage = (((int) ((double)page / 10 + 0.9)) - 1) * 10 + 1;
   	    int endPage = startPage+10-1;

   		if (endPage> maxPage) endPage= maxPage;

   		Club_PageInfo pageInfo = new Club_PageInfo();
   		pageInfo.setEndPage(endPage);
   		pageInfo.setListCount(listCount);
		pageInfo.setMaxPage(maxPage);
		pageInfo.setPage(page);
		pageInfo.setStartPage(startPage);	
		request.setAttribute("pageInfo", pageInfo);
		request.setAttribute("articleList", articleList);
		ActionForward forward= new ActionForward();
   		forward.setPath("/qna_board_list.jsp");
   		return forward;
   		
	 }
	 
 }