<%@page import="vo.Club_PageInfo"%>
<%@page import="vo.Offer_club"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>

    <jsp:include page="header.jsp"/>
    
<%
ArrayList<Offer_club> ClubList=(ArrayList<Offer_club>)request.getAttribute("ClubList");
    Club_PageInfo pageInfo = (Club_PageInfo)request.getAttribute("Club_pageInfo");
	int listCount=pageInfo.getListCount();
	int nowPage=pageInfo.getPage();
	int maxPage=pageInfo.getMaxPage();
	int startPage=pageInfo.getStartPage();
	int endPage=pageInfo.getEndPage();
%>

    <link rel="stylesheet" href="css/boardgameclub.css" type="text/css">
    <script src="js/boardgame_club_list.js"></script>
    

     <section id="club_slider">

        <div class="inner_slider">

            <div class="left slide-btn"><img src="img/next-left.png" alt="left"></div>
            <div class="right slide-btn"><img src="img/next-right.png" alt="right"></div>

            <ul class="sclub_wrap">

                <li class="sclub type1 clearfix">
                    <div class="off"></div>
                    <div class="sclub_cover"><img src="img/peakyblinders.png" alt="7wonders"></div>
                    <div class="sclub_info">

                        <p class="sclub_title">톰 셸비와 함께 하는 보드게임 여행</p>
                        <p class="sclub_moder">by green</p>
                        <p class="hashtag"><span>#1회차</span><span>#Crime</span><span>#Business</span><span>#Offline</span></p>

                        <p class="sclub_detail">톰 셸비가 직접 안내하는 보드게임 여행은 다양한 보드게임을 즐기며 새로운 사람들과 친구가 될 수 있는 좋은 기회입니다. 각종 이벤트와 대회도 준비되어 있으며, 보드게임을 좋아하는 사람이라면 누구나 참여할 수 있습니다.</p>

                        <a href="#">자세히 보기</a>

                    </div>
                </li>

                <li class="sclub type2 clearfix">
                    <div class="off"></div>
                    <div class="sclub_cover"><img src="img/7wonders.png" alt="7wonders"></div>
                    <div class="sclub_info">

                        <p class="sclub_title">톰 셸비와 함께 하는 보드게임 여행</p>
                        <p class="sclub_moder">by green</p>
                        <p class="hashtag"><span>#1회차</span><span>#Crime</span><span>#Business</span><span>#Offline</span></p>

                        <p class="sclub_detail">톰 셸비가 직접 안내하는 보드게임 여행은 다양한 보드게임을 즐기며 새로운 사람들과 친구가 될 수 있는 좋은 기회입니다. 각종 이벤트와 대회도 준비되어 있으며, 보드게임을 좋아하는 사람이라면 누구나 참여할 수 있습니다.</p>

                        <a href="#">자세히 보기</a>

                    </div>
                </li>

                <li class="sclub type3 active clearfix">
                    <div class="off"></div>
                    <div class="sclub_cover"><img src="img/peakyblinders.png" alt="7wonders"></div>
                    <div class="sclub_info">

                        <p class="sclub_title">톰 셸비와 함께 하는 보드게임 여행</p>
                        <p class="sclub_moder">by green</p>
                        <p class="hashtag"><span>#1회차</span><span>#Crime</span><span>#Business</span><span>#Offline</span></p>

                        <p class="sclub_detail">톰 셸비가 직접 안내하는 보드게임 여행은 다양한 보드게임을 즐기며 새로운 사람들과 친구가 될 수 있는 좋은 기회입니다. 각종 이벤트와 대회도 준비되어 있으며, 보드게임을 좋아하는 사람이라면 누구나 참여할 수 있습니다.</p>

                        <a href="#">자세히 보기</a>

                    </div>
                </li>

                <li class="sclub type4 clearfix">
                    <div class="off"></div>
                    <div class="sclub_cover"><img src="img/peakyblinders.png" alt="7wonders"></div>
                    <div class="sclub_info">

                        <p class="sclub_title">톰 셸비와 함께 하는 보드게임 여행</p>
                        <p class="sclub_moder">by green</p>
                        <p class="hashtag"><span>#1회차</span><span>#Crime</span><span>#Business</span><span>#Offline</span></p>

                        <p class="sclub_detail">톰 셸비가 직접 안내하는 보드게임 여행은 다양한 보드게임을 즐기며 새로운 사람들과 친구가 될 수 있는 좋은 기회입니다. 각종 이벤트와 대회도 준비되어 있으며, 보드게임을 좋아하는 사람이라면 누구나 참여할 수 있습니다.</p>

                        <a href="#">자세히 보기</a>

                    </div>
                </li>

                <li class="sclub type5 clearfix">
                    <div class="off"></div>
                    <div class="sclub_cover"><img src="img/Champions_of_Midgard.png" alt="7wonders"></div>
                    <div class="sclub_info">

                        <p class="sclub_title">톰 셸비와 함께 하는 보드게임 여행</p>
                        <p class="sclub_moder">by green</p>
                        <p class="hashtag"><span>#1회차</span><span>#Crime</span><span>#Business</span><span>#Offline</span></p>

                        <p class="sclub_detail">톰 셸비가 직접 안내하는 보드게임 여행은 다양한 보드게임을 즐기며 새로운 사람들과 친구가 될 수 있는 좋은 기회입니다. 각종 이벤트와 대회도 준비되어 있으며, 보드게임을 좋아하는 사람이라면 누구나 참여할 수 있습니다.</p>

                        <a href="#">자세히 보기</a>

                    </div>
                </li>

            </ul>

        </div>

    </section>

    <section id="boardgame_club_list">
        
        <h3>Boardgame Club</h3>

        <div class="club_index">

            <!--검색/form태그 추가--->
            <form name="searchfrm" method="get" action="#">
                <div class="searchBox">
                    <div class="keyword"><input type="text" name="search" placeholder="검색어를 입력해 주세요."></div>
                    <button>검색</button>
                </div>
            </form>
            <ul class="index_wrap clearfix">
                <li class="active">전체 클럽</li>
                <li>오프라인 클럽</li>
                <li>온라인 클럽</li>
                <li><a href="#">클럽 제안하기</a></li>
            </ul>

        </div>


        <div class="inner_club_list">

            <div class="club_wraps clearfix">
		<% // for(int i=0; i < ClubList.size(); i++){ %>
                <a href="#" class="club">
                    <img src="img/peakyblinders.png" alt="7wonders" class="boardgame">

                    <div class="club_info">
                        <p class="club_title">톰 셸비와 함께 하는 보드게임 여행</p>
                        <p class="club_moder">by green</p>
                        <p class="hashtag"><span>#1회차</span><span>#Crime</span><span>#Business</span><span>#Offline</span></p>

                        <p class="club_detail">톰 셸비가 직접 안내하는 보드게임 여행은 다양한 보드게임을 즐기며 새로운 사람들과 친구가 될 수 있는 좋은 기회입니다. 각종 이벤트와 대회도 준비되어 있으며, 보드게임을 좋아하는 사람이라면 누구나 참여할 수 있습니다.</p>
                    </div>

                    <div class="lower">
                        <div class="participate clearfix">
                            <img src="img/user.png" alt="user">
                            <p>23.04.12-13 | 수, 목 | 18-20시 | 경기 | 1/5명 | 8,000원 </p>
                        </div>
                    </div>

                </a>

            </div>

        </div>

    </section>

    <section id="reviews">

        <div class="review_tap">
            <p class="review_title">Recently Review</p>

            <ul class="review_wrap">

                <li class="review clearfix">
                    <div class="img_wrap">
                        <img src="img/user.png" alt="user">
                    </div>
                    <div class="txt_wrap">
                        <p class="nickname">nickname</p>
                        <p class="sentence">존 셸비의 보드게임 클럽 모임에 참여해보았는데, 정말 즐거운 시간을 보냈습니다. 모임장인 존 셸비는 매우 친절하고 재미있는 보드게임을 준비해주어 모임에 참여하는 모든 사람들이 즐길 수 있도록 배려해주었습니다.</p>
                        <p class="r_date">셸비 가문의 보드게임 / 23. 04. 07.</p>
                        <p class="btn">☆</p>
                    </div>
                </li>

                <li class="review clearfix">
                    <div class="img_wrap">
                        <img src="img/user.png" alt="user">
                    </div>
                    <div class="txt_wrap">
                        <p class="nickname">nickname</p>
                        <p class="sentence">게임이 시작되면 모임원들끼리 친목을 도모하며 게임을 진행해나갈 수 있는 분위기를 만들어주었고, 게임을 마친 후에는 함께 이야기를 나눌 수 있는 시간도 가지게 해주었습니다.</p>
                        <p class="r_date">셸비 가문의 보드게임 / 23. 04. 07.</p>
                        <p class="btn">☆</p>
                    </div>
                </li>

                <li class="review clearfix">
                    <div class="img_wrap">
                        <img src="img/user.png" alt="user">
                    </div>
                    <div class="txt_wrap">
                        <p class="nickname">nickname</p>
                        <p class="sentence">또한, 클럽 모임의 장소 역시 넓고 깨끗한 공간을 사용하였고, 보드게임에 필요한 모든 장비와 음료 등도 제공해주어 편안하게 게임을 즐길 수 있었습니다.</p>
                        <p class="r_date">셸비 가문의 보드게임 / 23. 04. 07.</p>
                        <p class="btn">☆</p>
                    </div>
                </li>

                <li class="review clearfix">
                    <div class="img_wrap">
                        <img src="img/user.png" alt="user">
                    </div>
                    <div class="txt_wrap">
                        <p class="nickname">nickname</p>
                        <p class="sentence">총평하자면, 존 셸비의 보드게임 클럽 모임은 게임을 즐기는 것 뿐만 아니라 사람들과 소통하고 친해지는 좋은 기회가 되어주는 모임이었습니다. 강력 추천합니다!</p>
                        <p class="r_date">셸비 가문의 보드게임 / 23. 04. 07.</p>
                        <p class="btn">☆</p>
                    </div>
                </li>

            </ul>

        </div>

    </section>

 <jsp:include page="footer.jsp"/>
