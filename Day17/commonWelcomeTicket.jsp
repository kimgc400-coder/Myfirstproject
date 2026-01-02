<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="ticket-container-static" id="libraryWelcomeTicket">
	<div class="ticket">
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
					<h2 id="welcomeName">${sessionScope.loginUser.name}</h2>
					<p>님, 환영합니다.</p>
				</div>
				<div class="number">NO. H3605GF23</div>
			</div>
			<div class="footer">
				<span>ARKIVE</span> <span>ONE PASS</span> <span>CHECK IN</span>
			</div>
		</div>
	</div>
</div>
