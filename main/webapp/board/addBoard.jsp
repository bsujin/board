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
<script type="text/javascript">

</script>
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

					<div class="container-fluid">

								<h2 class="mt-4">게시판 등록</h2>
								<br><br>
							<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
								
								<form class="form-horizontal" role="form" action="${cp }/addboard" method="get">
									<input type="hidden" id="userid" name="userid" value="${M_USER.user_id }">

									<div class="form-group">
										<label class="col-sm-2 control-label"><strong>게시판 이름</strong></label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="boardnm"
												name="boardnm" placeholder="게시판 이름" value="${param.boardnm}" />
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-sm-10">
											<select class="form-control col-md-3" name="activation" id="activation">
													<option value="">활성상태</option>
													<option value="0">사용x</option>
													<option value="1">사용o</option>
											</select> 
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-sm-offset-2 col-sm-10">
											<button id="add" class="btn btn-primary" type="submit">게시판 등록</button>
										</div>
									</div>
								</form>
						</div>
					</div>
		</div>
	<%@include file="/common/footer.jsp"%>
	</div>
	<%@include file="/common/script.jsp"%>
</body>
</html>
