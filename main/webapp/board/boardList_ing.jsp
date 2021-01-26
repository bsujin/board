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
</head>
<script type="text/javascript">
	$(function() {
		$('#actUpdate').on('click', function() {
			var activation = $('#activation option:selected').val();
			var userid = $('#userid').val();
			var boardno = $('.boardno').val();
// // 			var boardnm = $('#boardnm').val();
			
// 			console.log(userid);
// 			console.log(boardno);
// 			console.log(activation);
			$("#frm").attr("method", "get");
			$("#frm").attr("action", "${cp }/boardSet?userid="+userid+"boardno="+boardno+"activation="+activation);
			$('#frm').submit();
		})
		
		$('#insertBoard').on('click', function() {
			
			location.href="${cp}/board/addBoard.jsp";
		})
		

	})
</script>
<body class="sb-nav-fixed">
	<%@include file="/common/header.jsp"%>
	<div id="layoutSidenav">
		<div id="layoutSidenav_nav">
			<nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
				<%@include file="/common/left.jsp"%>
			</nav>
		</div>
		<div id="layoutSidenav_content">
			<main>
				<form id="frm">
				<input type="hidden" id="userid" name="userid" value="${M_USER.user_id }">
					<div class="container-fluid">
						<div class="row">

							<div
								class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


								<div class="row">
									<div class="col-sm-8 blog-main">
										<h2 class="mt-4">사용자 게시판  [${M_USER.usernm}]</h2>
										<br>
										<br>
										<br>
										<div class="table-responsive">
											<table class="table table-striped">
												<tr>
													<th>게시판 목록</th>
													<th>게시판 이름</th>
													<th>게시판 활성상태</th>
													<th>게시판 활성상태 변경</th>
													<th></th>
												</tr>

												<c:forEach items="${board }" var="board">
												<tr class="board" data-board_no="${board.board_no }">
														<td><input type="button" class="boardno" value="${board.board_no }"></td>
														<td>${board.board_nm}</td>
														<c:set var="act" value="${board.activation}" />
														<c:choose>
															<c:when test="${act == 1}">
																<td>사용0</td>
															</c:when>
															<c:otherwise>
																<td>사용x</td>
															</c:otherwise>
														</c:choose>
														<td><select class="form-control col-md-5" name="activation" id="activation">
																<option value="">활성상태</option>
																<option value="0">사용x</option>
																<option value="1">사용o</option>
														</select>
														<td>
														<button id="actUpdate" class="btn btn-primary" type="button">변경</button></td>
														</tr>
												</c:forEach>
											</table>
										</div>
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
