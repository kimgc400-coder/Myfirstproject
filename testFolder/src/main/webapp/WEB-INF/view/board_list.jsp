<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 서블릿 MVC 게시판 목록</title>
</head>
<body>
<table border="1">
 <tr>
  <th colspan="4">서블릿 MVC 게시판 목록</th>
 </tr>
 <tr>
  <th>번호</th> <th>제목</th> <th>내용</th> <th>등록날짜</th>
 </tr>
 <c:if test="${!empty b_list}">
  <c:forEach var="b" items="${b_list}">
  <tr>
   <th>${b.b_no}</th>
   <th><a href="board_cont?bno=${b.b_no}">${b.b_title}</a></th> <%-- board_cont?bno=번호를 웹주소창에 노출되는 get방식으로 
   전달한다. 이런 경우 bno=번호는 문자열 형태로 전달된다. 하이퍼링크 get방식으로 번호값을 전달한다.--%>
   <th>${b.b_cont}</th>
   <th>${fn:substring(b.b_date,0,10)}</th> <%-- 0이상 10미만 사이의 연월일만 반환 --%>
  </tr>
  </c:forEach>
 </c:if>
  
 <c:if test="${empty b_list}">
  <tr>
   <th colspan="4">게시판 목록이 없습니다.</th>
  </tr>
 </c:if>
 <tr>
  <th colspan="4">
   <button type="button" onclick="location='board_write';">서블릿 MVC(모델 2) 게시판 입력</button>
  </th>
 </tr>
</table>
</body>
</html>