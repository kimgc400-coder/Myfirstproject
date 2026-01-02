<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="login.jsp" />


<header>
	<div class="header_container">
		<div class="upper_right">
			<ul class="nav_menu">
				<c:choose>
					<c:when test="${not empty sessionScope.loginUser}">
						<li id="homeBtn">Home</li>
						<li id="palaceBtn">Palace</li>
						<li id="documentBtn">Document</li>
						<li id="libraryBtn">Library</li>
						<li id="memberInfoBtn">Member Info</li>
						<li id="deleteAccountBtn">unsubscribe</li>
						<li id="logoutBtn">Log-out</li>
						
					</c:when>


					<c:otherwise>
						<li id="homeBtn">Home</li>
						<li id="palaceBtn">Palace</li>
						<li id="loginBtn">Log In</li>
						<li id="signupBtn">Sign up</li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>


	
		<div id="arkiveEffect" class="libre-barcode-39-text-regular">
			<c:out value="${param.pageTitle}" default="Arkive" />
		</div>
	</div>
	
</header>
