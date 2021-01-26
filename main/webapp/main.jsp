<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Board</title>
<%@include file="/common/common_lib.jsp"%>
</head>
<body class="sb-nav-fixed">
	<%@include file="/common/header.jsp"%>
	<div id="layoutSidenav">
		<div id="layoutSidenav_nav">
			<nav class="sb-sidenav accordion sb-sidenav-dark"
				id="sidenavAccordion">
				<%@include file="/common/left.jsp"%>
				<div class="sb-sidenav-footer">
					<div class="small">Logged in as:</div>
					<c:if test="${M_USER !=null }" />
					${M_USER.usernm}님
				</div>
			</nav>
		</div>
		<div id="layoutSidenav_content">
			<main>

				<div class="container-fluid">
					<h1 class="mt-4">Dashboard</h1>
					<ol class="breadcrumb mb-4">
						<li class="breadcrumb-item active">
							<h2 class="blog-post-title">
								<c:if test="${M_USER !=null }" />
								${M_USER.usernm}님의게시판
							</h2>
						</li>
					</ol>
					<jsp:useBean id="now" class="java.util.Date" />
					<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"
						var="today" />
					<br> <br>
					<h4>
						<c:out value="${today}" />
					</h4>
					<br> <br>
					<div class="row">
					<c:forEach items="${boardList}" var="board">
						<div class="col-xl-3 col-md-6">
							<div class="card bg-primary text-white mb-4">
							
								<div class="card-body">${board.board_nm }</div>
								<div
									class="card-footer d-flex align-items-center justify-content-between">
									<a class="small text-white stretched-link" href="#">View
										Details</a>
									<div class="small text-white">
										<i class="fas fa-angle-right"></i>
									</div>
								</div>
							</div>
						</div>
						</c:forEach>
					
					</div>
				</div>
			</main>
			<%@include file="/common/footer.jsp"%>
		</div>
	</div>
	<%@include file="/common/script.jsp"%>
</body>
</html>
