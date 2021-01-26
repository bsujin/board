<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="sb-sidenav-menu">
	<div class="nav">
		<div class="sb-sidenav-menu-heading">&nbsp;&nbsp;&nbsp;Menu</div>
		<a class="nav-link" href="${cp }/main.jsp">
			<div class="sb-nav-link-icon">
				<i class="fas fa-tachometer-alt"> </i>
			</div> Main
		</a> 
		<a class="nav-link collapsed" href="${cp }/boardMain">
			<div class="sb-nav-link-icon">
				<i class="fas fa-columns"></i>
			</div> 게시판 관리
		</a>
		<div class="sb-sidenav-menu-heading">&nbsp;&nbsp;&nbsp;현재 활성화 된 게시판</div>
		<c:forEach items="${boardList}" var="board">
			<c:set var="act" value="${board.activation}" />
			<c:choose>
				<c:when test="${act == 1}">
					<a class="nav-link collapsed" href="${cp }/boardList?board_no=${board.board_no}">
						<div class="sb-nav-link-icon">
							<i class="fas fa-columns"></i>
						</div> ${board.board_nm}
					</a>
				</c:when>
				<c:otherwise></c:otherwise>
			</c:choose>
		</c:forEach>
	</div>
</div>
