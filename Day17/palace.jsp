<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Palace of Arkive</title>
<link
	href="<%=request.getContextPath()%>/Resource/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/common.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/palace.css"
	rel="stylesheet">
	
</head>
<body data-context="<%=request.getContextPath()%>">

<jsp:include page="commonheader.jsp">
		<jsp:param name="pageTitle" value="Palace" />
	</jsp:include>
	
	<div class="body_container">
		<!-- 바디 부분을 여기서 작성하시오. -->
		<table class="table table-hover custom-table" id="palaceTable">
			<thead>
				<tr>
					<th scope="col" class="col_doc_collect">Collected</th>
					<th scope="col" class="col_doc_title">Author</th>
					<th scope="col" class="col_doc_cntent">Content</th>
				</tr>
			</thead>
			<tbody id="palaceTableBody">
				<tr>
				<td colspan="3" class="text-center">Loading list structure...</td>
				</tr>
			</tbody>
		</table>
			<div id="paginationArea" class="pagination_center_group">
			</div>
		</div>
		<script src="<%=request.getContextPath()%>/Resource/jquery-3.7.1.min.js"></script>
		<script src="<%=request.getContextPath()%>/js/header.js"></script>
		<script src="<%=request.getContextPath()%>/js/palace.js"></script>
		<script src="<%=request.getContextPath()%>/js/barcodeEffect.js"></script>
		<jsp:include page="memberinfo.jsp"/>
	<jsp:include page="memberdeleteconfirm.jsp"/>
<script src="<%=request.getContextPath()%>/js/memberinfo.js"></script>
<script src="<%=request.getContextPath()%>/js/deleteConfirmModal.js"></script>		

</body>
</html>