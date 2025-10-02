<%@ page contentType="text/html; charset=UTF-8" %>
<%-- page 디렉티브인 지시자로 contentType="text/html;charset=UTF-8"속성값 의미는 웹브라우저에 출력되는 문자와 태그,언어코딩 타입을 설정 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 MVC 게시판 수정폼 </title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%-- jQuery CDN 방식이다. CDN은 Content Delivery NetWork의 약자로, 콘텐츠 전송 네트워크를 의미한다. CDN은 온라인 인터넷으로 연결된 상태에서
적용된다. 웹서버에 있는 jQuery 라이브러리 파일을 온라인으로 가져와서 사용하는 방식이다.  --%>
<body>
 <form method="post" action="board_edit_ok" onsubmit="return check();">
  <%--
    post방식 특징)
     1. 브라우저 주소창에 서버로 전달되는 값이 보이지 않는다.보안상 좋다.
     2. 즉,본문내용속에 포함되어 값이 서버로 전달된다. 서버로 보내는 자료길이 제한도 없다.
    action="게시판 저장 서버매핑주소 설정" -> board_write_ok
    onsubmit은 서버로 자료 보내는 이벤트 핸들러인 사건처리기이다. 서버로 제출 사건 이벤트를 처리하면서 check()함수를 호출한다. 
   --%>
   
   <input type="hidden" name="b_no" value="${eb.b_no}" >
   <%-- hidden은 웹브라우저에서는 만들어 지지 않는다. 하지만 b_no 네임피라미터 이름에 value속성값을 담아서 서버로 전송할 때 많이 사용한다. 
   웹브라우저 페이지 소스창에서는 노출되기 때문에 보안상 중요한 데이터는 히든으로 전송하면 안된다. --%>
   
   <table border="1">
    <tr>
     <th colspan="2">서블릿 MVC 게시판 수정폼</th>
    </tr>
    <tr>
     <th>제목</th>
     <td><input type="text" name="b_title" id="b_title" size="36" value="${eb.b_title}" ></td>
    </tr>
    <tr>
     <th>글내용</th>
     <td>
      <textarea name="b_cont" id="b_cont" rows="10" cols="36">${eb.b_cont}</textarea>
     </td>
    </tr>
    <tr>
     <th colspan="2">
      <input type="submit" value="수정" >
      <input type="reset" value="취소" >
      <button type="button" onclick="location='board_list';">목록</button>
     </th>
    </tr>
   </table>
 </form>
</body>
</html>