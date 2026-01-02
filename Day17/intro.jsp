<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Arkive Intro</title>

<link href="https://fonts.googleapis.com/css2?family=Libre+Barcode+39+Text&display=swap" rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/intro.css" rel="stylesheet">
<script>
  const ctx = "${pageContext.request.contextPath}";
</script>

</head>

<body style="overflow: hidden;"> 
  <div class="intro-container">
    <div id="arkiveEffect" class="intro-barcode"></div>
    <div id="loadingPercent" class="loading-percent">0%</div>
  </div>
  

  <div id="scrollGuide" class="scroll-guide"></div>

  <!-- JS -->
  <script src="<%=request.getContextPath()%>/js/intro.js"></script>
</body>
</html>
