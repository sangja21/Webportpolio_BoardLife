$(document).ready(function () {

//    var BoardgameTitle1 = $('#boardgame1').attr('alt');
//    var BoardgameTitle2 = $('#boardgame2').attr('alt');
//    var BoardgameTitle3 = $('#boardgame3').attr('alt');
//
//    var BoardgameSrc1 = $('#boardgame1').attr('src');
//    var BoardgameSrc2 = $('#boardgame2').attr('src');
//    var BoardgameSrc3 = $('#boardgame3').attr('src');
//
//    var BoardgameDesc1 = $('#boardgame1').data('value');
//    var BoardgameDesc2 = $('#boardgame2').data('value');
//    var BoardgameDesc3 = $('#boardgame3').data('value');

    var $bgImg = $('.club_img img');
    var $clubBG = $('.club_img');
    var $clubTitle = $('.boardgame_detail .title');
    var $clubDesc = $('.boardgame_detail .description');

    var BoardgameTitle;
    var BoardgameSrc;
    var BoardgameDesc;
    var $ClubBgImg;

    var imgIndex;
    var newBackgroundImage;


    var overClick = false;
    // 광클 금지


    //    console.log(BoardgameTitle1);
    //    console.log(BoardgameDesc1);
    //    console.log("");
    //    console.log(BoardgameTitle2);
    //    console.log(BoardgameDesc2);
    //    console.log("");
    //    console.log(BoardgameTitle3);
    //    console.log(BoardgameDesc3);

    $(".boardgame_wrap img").click(function () {
        //        console.log($(this).attr('alt'));
        //        console.log($(this).attr('src'));
        //        console.log($(this).data('value'));

        if (overClick) {
            return false;
        }
        overClick = true;
        //광클 금지

        BoardgameSrc = $(this).attr('src');
        BoardgameTitle = $(this).attr('alt');
        BoardgameDesc = $(this).data('value');
        // 클릭한 요소의 이미지 파일 경로 & 보드게임 이름 & 설명을 받아옴.

        console.log(BoardgameSrc);
        console.log(BoardgameTitle);
        console.log(BoardgameDesc);

        $(".boardgame_wrap img").removeClass("choice");
        $(this).addClass("choice");

        //$clubBG.css('background-image', ("../" + BoardgameSrc));
        // 클럽 게임의 Background-img 변경

        //L console.log($clubBG.css('background-image'));

        $ClubBgImg = $clubBG.css('background-image');

        //console.log("ClubBgImg : " + $ClubBgImg);

        // img/ 이후의 값을 변경하기 위해 문자열에서 img/ 위치를 찾습니다.
        imgIndex = $ClubBgImg.indexOf('img/');

        //console.log("imgIndex : " + imgIndex);

        // 새로운 이미지 파일 이름을 지정하고, 기존 문자열에 삽입합니다.
        if (imgIndex !== -1) {
            newBackgroundImage = $ClubBgImg.slice(0, imgIndex) + BoardgameSrc;

            //$ClubBgImg.slice(imgIndex + 4 + 'old-image.jpg'.length);
            //console.log(newBackgroundImage);

            $clubBG.css('background-image', newBackgroundImage);
        }

        $clubTitle.html(BoardgameTitle);
        $clubDesc.html(BoardgameDesc);

        //$bgImg.attr('src', BoardgameSrc);
        //$clubBG.attr('background-image')

        // 이미지 fade out
        $bgImg.fadeOut(10, function () {
            // fade out 완료 후 실행되는 콜백 함수

            // 이미지의 src 변경 및 클래스 업데이트
            //$(".boardgame_wrap img").removeClass("choice");
            //$(this).addClass("choice");
            $bgImg.attr('src', BoardgameSrc);

            $bgImg.fadeIn(1500, function () {
                // fade in 완료 후 실행되는 콜백 함수
                overClick = false;
            });

        }); // fade animation
        //광클금지 스위치 해제

    }); // click Event


}); // $(document).ready(function(){}); 
