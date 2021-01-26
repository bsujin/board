<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Page Title - SB Admin</title>
<%@ include file="/common/common_lib.jsp"%>
<!-- cookies.get 을 사용하기 위한 api를 가져온다  -->
<script
	src="https://cdn.jsdelivr.net/npm/js-cookie@rc/dist/js.cookie.min.js"></script>
<script type="text/javascript">
	// html문서 로딩이 완료되고나서 실행되는 코드 - $(function()) 사용 
	$(function() {
		//userid, rememberme 쿠키를 확인하여 존재할 경우 값 설정, 체크
		if (Cookies.get("userid" != undefined)) {
			$("#userid").val(Cookies.get("userid"));
			$("#rememberme").prop("checked", true);

		}
		//singin 아이디를 select  - 그냥사용하면 실행되지 않는다 
		$("#signin").on("click", function() {
			//rememberme 체크박스가 체크 되어있는지 확인

			// 체크 되어있을 경우
			if ($("#rememberme").is(":checked") == true) {

				// userid input에 있는 값을 userid쿠키로 저장
				Cookies.set("userid", $("#userid").val());

				// rememberme 쿠키로 Y값을 저장
				Cookies.set("rememberme", "Y");

			}
			// 체크 해제 되어 있는 경우 : 삭제 - remove
			//더이상 사용하지 않는다는 의미 이므로 userid, rememberme 쿠키 삭제 ==> 저장되어있으면 지워준다 
			else {
				Cookies.remove("userid");
				Cookies.remove("rememberme");
			}

			// form태그를 이용하여 signin 요청
			$("#frm").submit();

		});
	});
</script>
</head>
<body class="bg-primary">
	<div id="layoutAuthentication">
		<div id="layoutAuthentication_content">
			<main>
				<div class="container">
					<div class="row justify-content-center">
						<div class="col-lg-5">
							<div class="card shadow-lg border-0 rounded-lg mt-5">
								<div class="card-header">
									<h3 class="text-center font-weight-light my-4">Login</h3>
								</div>
								<div class="card-body">
									<form class="form-signin" id="frm" action="${cp }/loginController" method="post">
										<div class="form-group">
											<label for="userid" class="sr-only">userid</label> <input
												type="text" id="userid" class="form-control"
												placeholder="사용자 아이디" required autofocus name="userid"
												value="con">
										</div>
										<div class="form-group">
											<label for="inputPassword" class="sr-only">Password</label> <input
												type="password" id="userpw" class="form-control"
												placeholder="Password" required name="userpw" value="conPass">
										</div>
										<div class="form-group">
											<div class="custom-control custom-checkbox">
												<label> <input type="checkbox" id="rememberme"
													value="remember-me"> Remember me
												</label>
											</div>
										</div>
									</form>
								</div>
								<div class="card-footer text-center">
									<div class="small">
										<button class="btn btn-lg btn-primary btn-block" type="button"
											id="signin">Sign in</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</main>
		</div>
				<%@include file="/common/footer.jsp"%>
		</div>
	</div>
	<%@include file="/common/script.jsp"%>
</body>
</html>
