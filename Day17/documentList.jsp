<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>






<div class="library_nav_container">
    <div class="library_nav_box_content">
        <table class="table table-hover custom-table" id="documentListTable">
            <thead>
                <tr>
                    <th scope="col" class="col_doc_no">Number</th>
                    <th scope="col" class="col_doc_collect">Collected</th>
                    <th scope="col" class="col_doc_title">Source</th>
                    <th scope="col" class="col_doc_content">content</th>
                    <th scope="col" class="col_doc_date">Date</th>
                    <th scope="col" class="col_doc_view">View</th>
                </tr>
            </thead>
            <tbody id="documentListBody">
                </tbody>
        </table>
        
        <div id="paginationArea" class="pagination_center_group">
        </div>
    </div>
</div>


