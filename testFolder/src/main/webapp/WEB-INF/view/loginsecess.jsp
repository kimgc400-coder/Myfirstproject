<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> </title>
</head>
<body>
<form action="sucess" method="post">
로그인에 성공했습니다.<br>
<form action="${pageContext.request.contextPath}/board_write.jsp" method="post">
    <button type="submit">게시판에 글쓰기</button>
</form>
</form>

</body>
</html>