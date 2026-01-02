<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<div id="loginModal" class="modal">
<div class="modal-content">


<h3 class="P_S_center">Log-In</h3>

<form id="loginModalForm">
<div class="l_I_center">
<label for="loginId">Id</label><br>
<input type="text" id="loginId" name="loginId" required><br><br>

<label for="loginPassword">Password</label><br>
<input type="password" id="loginPassword" name="loginPassword" required><br><br>

<div class ="S_button_box">
<button type="submit" class="S_button">LogIn</button>
<button type="button" class="S_button" onclick="document.getElementById('loginModal').style.display='none'">cancel</button>
</div>
</div>
</form>
</div>
</div>