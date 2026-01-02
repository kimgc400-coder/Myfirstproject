<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Arkive Library</title>
<link
	href="<%=request.getContextPath()%>/Resource/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/common.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/library.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Libre+Barcode+39+Text&display=swap"
	rel="stylesheet">
</head>


<body data-context="<%=request.getContextPath()%>">

	<jsp:include page="commonheader.jsp">
		<jsp:param name="pageTitle" value="${sessionScope.loginUser.loginId}-Library" />
	</jsp:include>

	<div class="body_container">
		<!-- 바디 부분을 여기서 작성하시오. -->
		<c:if test="${!empty sessionScope.loginUser && (empty showWelcomeModal || showWelcomeModal == 'false')}">
			<jsp:include page="libraryprofile.jsp"/>
		</c:if>

		<div class="library_nav_container">
			<div class="library_nav_box cartetory_top">My TOP</div>
			<div class="library_nav_box_content_box"></div>
			<div class="library_nav_box_content">
				<table class="table table-hover custom-table" id="documentListTable">
					<thead>
						<tr>
							<th scope="col" class = "col_doc_no">Number</th>
							<th scope="col" class="col_doc_collect">Collected</th>
							<th scope="col" class = "col_doc_title">Source</th>
							<th scope="col" class = "col_doc_content">Content</th>
							<th scope="col" class="col_doc_date">Date</th>
							<th scope="col" class="col_doc_view">View</th>
						</tr>
					</thead>
					<tbody id="top5list">
					</tbody>
				</table>
			</div>
		</div>

		<div class="library_nav_container">
			<div class="library_nav_box cartetory_top">Repository</div>
			<div></div>
			<div class="library_nav_box_content">
				<table class="table table-hover custom-table" id="documentListTable">
					<thead>
						<tr>
							<th scope="col" class = "col_doc_no">Number</th>
							<th scope="col" class="col_doc_collect">Collected</th>
							<th scope="col" class = "col_doc_title">Source</th>
							<th scope="col" class = "col_doc_content">Content</th>
							<th scope="col" class="col_doc_date">Date</th>
							<th scope="col" class="col_doc_view">View</th>
						</tr>
					</thead>
					<tbody id = "documentListBody">

					</tbody>
				</table>

			</div>
		</div>


	</div>
	<script src="<%=request.getContextPath()%>/Resource/jquery-3.7.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/Resource/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/library.js"></script>
	<script src="<%=request.getContextPath()%>/js/header.js"></script>
	<script src="<%=request.getContextPath()%>/js/barcodeEffect.js"></script>
	<jsp:include page="memberinfo.jsp"/>
	<jsp:include page="memberdeleteconfirm.jsp"/>
<script src="<%=request.getContextPath()%>/js/memberinfo.js"></script>
<script src="<%=request.getContextPath()%>/js/deleteConfirmModal.js"></script>		
</body>
</html>