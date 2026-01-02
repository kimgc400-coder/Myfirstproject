<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="ticket-container-static" id="libraryWelcomeTicket">
    <div class="ticket">
    

        <div class="left ticket-profile-area">
            <div class="stats-header">PROFILE</div>
            
          
            <div id="profileNickArea" class="ticket-profile-field clickable-profile" data-field="nickName">
                NickName : <span id="profileNickname">Loading...</span>
            </div>
            <div id="profileEmailArea" class="ticket-profile-field clickable-profile" data-field="email">
                E-Mail : <span id="profileEmail">Loading...</span>
            </div>
            
          
            <div id="profile-btn-area" style="display:none; margin-top: 20px;">
                <button id="saveProfileBtn" class="S_button w_submit">Save</button>
                <button type="button" id="cancelProfileBtn" class="S_button w_reset">Cancel</button>
            </div>
        </div>
        
        <div class="right ticket-stats-area">
            <div class="stats-header">MEMBER STATS</div> 
            
            
            <div class="stats-field">
                Total Posts: <span id="totalPostCount">...</span>
            </div>
            <div class="stats-field">
                Total Collected: <span id="totalCollectedCount">...</span>
            </div>
            
            
            <div class="footer">
                <span>ARKIVE</span> <span>ONE PASS</span> <span>CHECK IN</span>
            </div>
        </div>
        
    </div>
</div>