<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>boardList</title>

<%@include file="/common/common_lib.jsp"%>
<link href="${cp }/css/dashboard.css" rel="stylesheet">
<link href="${cp }/css/blog.css" rel="stylesheet">
</head>
<script type="text/javascript">
	$(function(){
		$('#actUpdate').on('click', function() {
			var activation = $('#activation option:selected').val();
			console.log(activation);
			var boardno = $('.boardno').val();
			console.log(boardno);
// 			$("#frm").attr("method", "get");
// 			$("#frm").attr("action", "${cp }/boardSet");
// 			$('#frm').submit();
		})
		
	})
</script>
<body>
	<%@include file="/common/header.jsp"%>
	<form id="frm" action="${cp }/boardList">
		<input type="hidden" id="boardno" name="boardno" value="/">

		<div class="container-fluid">
			<div class="row">

				<div class="col-sm-3 col-md-2 sidebar">
					<%@include file="/common/left.jsp"%>
				</div>

				<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


					<div class="row">
						<div class="col-sm-8 blog-main">
							<h2 class="sub-header">사용자 게시판</h2>
							<div class="table-responsive">
								<table class="table table-striped">
									<tr>
										<th>게시판 목록</th>
										<th>게시판 이름</th>
										<th>게시판 제목</th>
									</tr>

									<c:forEach items="${bList}" var="board">
										<tr class="board" data-userid="${board.board_no }">
											<td><input type="text" class="no" value="${board.board_no }"></td>
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

							<a id="actUpdate" class="btn btn-default pull-right">활성상태 변경하기</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>
