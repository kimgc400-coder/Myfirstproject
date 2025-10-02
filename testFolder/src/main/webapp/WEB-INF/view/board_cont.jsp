<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 MVC 게시판 내용보기 </title>
</head>
<body>
<table border="1">
 <tr>
  <th colspan="2">서블릿 MVC 게시판 내용보기</th>
 </tr>
 <tr>
  <th>번호</th> <td>${bc.b_no}</td>
 </tr>
 <tr>
  <th>제목</th> <td>${bc.b_title}</td>
 </tr>
 <tr>
  <th>글내용</th> <td>${bcont}</td>
 </tr>
 <tr>
  <th>등록날짜</th> <td>${bc.b_date}</td>
 </tr>
 <tr>
  <th colspan="2">
   <input type="button" value="수정" onclick="location='board_edit?bno=${bc.b_no}';" >
   <input type="button" value="삭제" onclick=
     "if(confirm('정말로 삭제할까요?') == true){location='board_del?bno=${bc.b_no}';}else{return;}" >
     <%-- 자바스크립트 내장함수 중 confirm()은 확인/취소 버튼을 가진 창을 만들어 준다. 확인을 클릭하면  true를 반환해서 삭제되게 하고, 취소를 클릭하면
     false를 반환해서 현재창에 그대로 있게 하고 삭제되지 않는다. 주로 다시 한번더 삭제 유무를 판단할 때 사용한다. --%>
   <input type="button" value="목록" onclick="location='board_list';" >  
  </th>
 </tr>
</table>
</body>
</html>
