<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Arkive Main</title>
<link
	href="<%=request.getContextPath()%>/Resource/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/common.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/weeklytop.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Libre+Barcode+39+Text&display=swap"
	rel="stylesheet">
<script
	src="<%=request.getContextPath()%>/Resource/bootstrap/js/bootstrap.bundle.min.js"></script>
</head>
<body data-context="<%=request.getContextPath()%>">

	<c:if
		test="${not empty showWelcomeModal and showWelcomeModal == 'true'}">
		<div id="welcomeModalTrigger" data-username="${newUserName}"
			class="ark-hidden-data"></div>
	</c:if>

	<jsp:include page="commonheader.jsp">
		<jsp:param name="pageTitle" value="${sessionScope.loginUser.loginId}-Arkive" />
	</jsp:include>

	<div class="body_container">
		<!-- 바디 부분을 여기서 작성하시오. -->
		<div class="library_nav_box libraryDocumentBtn cartetory_top">Weekly
			Top</div>
		<div class="library_nav_box_content_box"></div>
		<div class="library_nav_box_content">
			<table class="table table-hover custom-table" id="weeklyTopTable">
				<thead>
					<tr>
						<th scope="col" class="col_doc_no">Rank</th>
						<th scope="col" class="col_doc_author">Author</th>
						<th scope="col" class="col_doc_content">Content</th>
						<th scope="col" class="col_doc_collect">Collected</th>
						<th scope="col" class="col_doc_view">View</th>
					</tr>
				</thead>
				<tbody id="weeklyTopBody">
					<tr>
						<td colspan="5" class="text-center">Loading Weekly Top...</td>
					</tr>
				</tbody>
			</table>
			<div class="text-end mt-2">
				<a href="<%=request.getContextPath()%>/palace.do"
					class="btn btn-outline-dark btn-sm">View All Documents</a>
			</div>
		</div>
	</div>
	
	
	<section class="reveal-section">
			<img src="<%=request.getContextPath()%>/images/steveJobs.jpg" 
			     alt="독서 이미지" class="reveal-image"><br>
			<div class="reveal-text">
			"the people who are crazy enough to think they can change the world,<br>
			are the ones who do."<br>
			-Steve Jobs-
			</div>
		</section>
		
	<script
		src="<%=request.getContextPath()%>/Resource/jquery-3.7.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/header.js"></script>
	<script src="<%=request.getContextPath()%>/js/library.js"></script>
	<script src="<%=request.getContextPath()%>/js/main.js"></script>
	<script src="<%=request.getContextPath()%>/js/barcodeEffect.js"></script>
	<script src="<%=request.getContextPath()%>/js/scrollmain.js"></script>
	

	<div id="welcomeModal" class="modal-overlay">
		<div class="ticket">
			<span class="close-modal"></span>
			<div class="left">
				<div class="photo">
					<img src="<%=request.getContextPath()%>/images/member.jpg">
				</div>
				<div class="vip">ARKIVE MEMBER</div>
			</div>
			<div class="right">
				<div>
					<div class="header">
						<span>01</span> <span
							style="font-family: 'Playfair Display', serif;">WELCOME
							TICKET</span>
					</div>
					<div class="welcome-message">
						<h2 id="welcomeName"></h2><p>님, 환영합니다.</p>
					</div>
					<div class="number">NO. H3605GF23</div>
				</div>
				<div class="footer">
					<span>ARKIVE</span> <span>ONE PASS</span> <span>CHECK IN</span>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="memberinfo.jsp"/>
	<jsp:include page="memberdeleteconfirm.jsp"/>
<script src="<%=request.getContextPath()%>/js/memberinfo.js"></script>
<script src="<%=request.getContextPath()%>/js/deleteConfirmModal.js"></script>		
</body>
</html>