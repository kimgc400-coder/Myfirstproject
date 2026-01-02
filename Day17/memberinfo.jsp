<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Info</title>

<link href="https://fonts.googleapis.com/css2?family=Libre+Barcode+39+Text&display=swap" rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/memberinfo.css" rel="stylesheet">
</head>
<body>

<div class="memberinfo-overlay" id="memberInfoModalOverlay">
	<div class="memberinfo-modal" id="memberInfoModal">
		<span class="close-memberinfo-modal">&times;</span>
		<h2 class="memberinfo-title libre-barcode-39-text-regular">MEMBER-INFO</h2>

		<form id="memberInfoForm" class="memberinfo-form">
			
			<!-- ✅ 아이디 (수정 불가) -->
			<div class="form-group">
				<label>Id</label>
				<div id="mem_id_display" class="readonly-field"></div>
				<input type="hidden" id="mem_id" name="mem_id">
			</div>

			<!-- ✅ 닉네임 (표시만) -->
			<div class="form-group">
				<label>Nick Name</label>
				<div id="mem_nickName_display" class="readonly-field"></div>
				<input type="hidden" id="mem_nickName" name="mem_nickName">
			</div>

			<!-- 이름 (표시만) -->
			<div class="form-group">
				<label>Name</label>
				<div id="mem_name_display" class="readonly-field"></div>
				<input type="hidden" id="mem_name" name="mem_name">
			</div>

			<!-- 비밀번호 -->
			<div class="form-group">
				<label>Password</label>
				<input type="password" id="mem_password" name="mem_password" maxlength="20">
			</div>

			<!-- 전화번호 -->
			<div class="form-group">
				<label>Phone Number</label>
				<input type="text" id="mem_phoneNumber" name="mem_phoneNumber" maxlength="11">
			</div>

			<!-- 이메일 -->
			<div class="form-group">
				<label>E-mail</label>
				<input type="text" id="mem_Email" name="mem_Email" maxlength="30">
			</div>

			<!-- 주소 -->
			<div class="form-group">
				<label>Address</label>
				<div class="addr-group">
					<input type="text" id="sample4_postcode" name="mem_zip_Addr" placeholder="우편번호">
					<button type="button" onclick="sample4_execDaumPostcode()">우편번호 찾기</button>
				</div>
				<input type="text" id="sample4_roadAddress" name="mem_RoadAddr" placeholder="도로명주소">
				<input type="text" id="sample4_detailAddress" name="mem_RoadDetail" placeholder="상세주소">
			</div>

			<div class="btn-area">
				<button type="submit" class="btn-primary">저장</button>
				<button type="button" class="btn-secondary close-memberinfo-modal">취소</button>
			</div>
		</form>
	</div>
</div>

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="<%=request.getContextPath()%>/js/memberinfo.js"></script>
</body>
</html>
