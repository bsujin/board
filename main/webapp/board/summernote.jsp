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
	<title>BoardMain</title>
	<%@include file="/common/common_lib.jsp"%>
	<%@include file="/common/summernote.jsp" %>
</head>

<body class="sb-nav-fixed">
	<%@include file="/common/header.jsp"%>
	<div id="layoutSidenav">
		<div id="layoutSidenav_nav">
			<nav class="sb-sidenav accordion sb-sidenav-dark"
				id="sidenavAccordion">
				<%@include file="/common/left.jsp"%>
			</nav>
		</div>
		<div id="layoutSidenav_content">
			<main>
				<form id="frm" >
				<input type="hidden" >
					<div class="container-fluid">
						<div class="row">

							<div
								class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


								<div class="row">
									<div class="col-sm-8 blog-main">
										<h2 class="mt-4">summernote</h2>
										<br>
										<br>
										<br>
										<div class="table-responsive">
										
										
										<!-- summer -->
											<div id="summernote"></div>
											  <script>
											    $(document).ready(function() {
											        $('#summernote').summernote();
											    });
											  </script>
										<!-- /summer -->



										</div>

										<button id="actUpdate" class="btn btn-primary" type="button">활성상태 변경하기</button>
										<button id="insertBoard" class="btn btn-primary" type="button">게시판 추가하기</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</form>
			</main>
			<%@include file="/common/footer.jsp"%>
		</div>
	</div>
	<%@include file="/common/script.jsp"%>
</body>
</html>
