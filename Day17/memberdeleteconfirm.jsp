<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<%=request.getContextPath()%>/css/memberdelete.css"
	rel="stylesheet">

<div class="delete-modal-overlay" id="deleteConfirmModal">
<div class="delete-modal-container">

<span class="delete-modal-close" id="closeDeleteModal">&times;</span>


<h2 class="delete-modal-header libre-barcode-39-text-regular">ARCHIVE SEALING</h2>

<div class="delete-modal-left">
<p class="delete-modal-description">
if you wish to delete your account, please enter your <strong>password</strong>
</p>

<form id="memberDeleteForm" class="delete-modal-form">
<input type="password" id="deletePassword" name="password" class="delete-modal-input" placeholder="Current Password" required>

<div class="delete-modal-buttons">
<button type="submit" class="delete-modal-btn delete-confirm-btn">Seal Archive</button>
<button type="button" class="delete-modal-btn delete-cancel-btn" id="cancelDeleteBtn">Cancel</button>
</div>
</form>
</div>
<div class="delete-modal-right">
<div class="delete-modal-message">
<h2 id="farewellmessage">Your Archive Has Been Sealed.</h2>
<p>Thank you for being part of this story.</p> 
</div>
<div class="delete-modal-seal">
	<img src="<%=request.getContextPath()%>/images/sela_stamp.png" alt="Seal Stamp">
</div>
</div>
</div>
</div>

<script src="<%=request.getContextPath()%>/js/deleteConfirmModal.js"></script>