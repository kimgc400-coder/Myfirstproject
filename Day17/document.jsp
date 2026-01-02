<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="<%=request.getContextPath()%>/Resource/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/common.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/writeindocument.css"
	rel="stylesheet">

<link
	href="https://fonts.googleapis.com/css2?family=Libre+Barcode+39+Text&display=swap"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/document.css"
	rel="stylesheet">

</head>
<body data-context="<%=request.getContextPath()%>">

	<jsp:include page="commonheader.jsp">
		<jsp:param name="pageTitle" value="${sessionScope.loginUser.loginId}-Document" />
	</jsp:include>
	<div class="body_container">


		<c:choose>
			<c:when test="${not empty requestScope.document}">
			
				<c:set var="currentDocumentIndex" value="${requestScope.document.document_index}"/>
				
				<c:set var="loginUserIndex" value="${sessionScope.loginUser.user_index}}" />
				<c:set var="documentUserIndex" value="${requestScope.document.user_index}}" />

				<div class="document-detail-view" id="documentViewContainer">
				
					

					<div class="document_meta document_read_meta">
						작성자 : <a href ="${pageContext.request.contextPath}/userlibrary.do?authorId=${requestScope.document.user_index}" style="color: #555; text-decoration: underline;">${requestScope.document.nickName}</a>  | 작성일: ${requestScope.document.document_create_at} | 
						조회수 : <span id="viewCount">${requestScope.document.document_view_count}</span>
					</div>
					
					<div class="writebox document_read_box">
					<div class="source" id="documentTitleDisplay">${requestScope.document.document_title}</div>
						<div class="document_content_area" id="documentContentArea">
							<pre style="white-space: pre-wrap;">${requestScope.document.document_content}</pre>
						</div>
					</div>
					<input type="hidden" id="documentTypeHidden" name="document_type" value="${not empty documentType ? documentType : 'Quote'}">
					<div class="document_btn_group" id="documentButtons">
						<c:choose>
							<c:when test="${loginUserIndex == documentUserIndex}">
								<button id="modifyBtn" class="S_button" data-document-index="${currentDocumentIndex}">Modify</button>
								<button id="deleteBtn" class="S_button" data-document-index="${currentDocumentIndex}">Delete</button>
							</c:when>
							<c:otherwise>
								<button id="collectBtn" class="S_button" data-document-index="${currentDocumentIndex}">Collect</button>
								<span id="collectionCountDisplay" style="line-height: 2.5; color: #555; font-size: 14px;">
									(수집 ${requestScope.document.collection_count}) </span>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
				

			</c:when>

			<c:otherwise>
			
				<c:set var="currentView" value="${param.view}" scope="request"/>
				<c:set var="currentView" value="${empty currentView ? 'write' : currentView}"/>
				<div class="docCartetoryContainer">
					<div class="docCartetoryBox_w" id="docwriteBtn" data-view="write">Log</div>
					<div class="docCartetoryBox_l" id="doclistBtn" data-view="list">List</div>
					<div class="docCartetoryBox_r" id="docrepoBtn" data-view="repository">Repository</div>
			
				</div>
				<div class="writeSecssion">
				<c:if test="${currentView == 'write'}">
					<jsp:include page="writeindocument.jsp" />
					</c:if>
				</div>
				
				<div id="dynamicContentArea">
				<c:if test="${currentView != 'write' }">
				<div class="text-center p-5">페이지가 로딩되었습니다.</div>
				</c:if>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
	<script
		src="<%=request.getContextPath()%>/Resource/jquery-3.7.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/header.js"></script>
	<script src="<%=request.getContextPath()%>/js/document.js"></script>
	<script src="<%=request.getContextPath()%>/js/barcodeEffect.js"></script>
	<jsp:include page="memberinfo.jsp"/>
	<jsp:include page="memberdeleteconfirm.jsp"/>
<script src="<%=request.getContextPath()%>/js/memberinfo.js"></script>
<script src="<%=request.getContextPath()%>/js/deleteConfirmModal.js"></script>		
</body>
</html>


