<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Giriş</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath }/resources/login/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/login/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/login/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/login/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/login/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/login/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/login/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/login/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/login/css/util.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/login/css/main.css">
<!--===============================================================================================-->
</head>
<body>

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form validate-form">
					<span class="login100-form-title p-b-26"> Online Notepad </span> <span
						class="login100-form-title p-b-48"> <i
						class="zmdi zmdi-font"></i>
					</span>
					<form:form action="register" modelAttribute="user">

						<div class="wrap-input100 validate-input" data-validate="Name">
							<form:input path="name" class="input100" />
							<span class="focus-input100" data-placeholder="Name"></span>
						</div>

						<div class="wrap-input100 validate-input" data-validate="Surname">
							<form:input class="input100" path="surname" />
							<span class="focus-input100" data-placeholder="Surname"></span>
						</div>

						<div class="wrap-input100 validate-input" data-validate="Username">
							<form:input path="userName" class="input100" />
							<span class="focus-input100" data-placeholder="Username"></span>
						</div>

						<div class="wrap-input100 validate-input" data-validate="Email">
							<form:input path="email" class="input100" />
							<span class="focus-input100" data-placeholder="Email"></span>
						</div>

						<div class="wrap-input100 validate-input" data-validate="Password">
							<span class="btn-show-pass"> <i class="zmdi zmdi-eye"></i>
							</span>
							<form:password path="password" class="input100" />
							<span class="focus-input100" data-placeholder="Password"></span>
						</div>

						<div class="wrap-input100 validate-input" data-validate="Password">
							<span class="btn-show-pass"> <i class="zmdi zmdi-eye"></i>
							</span>
							<form:password path="password2" class="input100" />
							<span class="focus-input100" data-placeholder="Password"></span>
						</div>

						<div class="container-login100-form-btn">
							<div class="wrap-login100-form-btn">
								<div class="login100-form-bgbtn"></div>
								<form:button class="login100-form-btn">Sign Up</form:button>
							</div>
						</div>

					</form:form>



					<div class="text-center p-t-115"></div>
				</div>
			</div>
		</div>
	</div>


	<div id="dropDownSelect1"></div>

	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath }/resources/login/vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath }/resources/login/vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath }/resources/login/vendor/bootstrap/js/popper.js"></script>
	<script
		src="${pageContext.request.contextPath }/resources/login/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath }/resources/login/vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath }/resources/login/vendor/daterangepicker/moment.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/resources/login/vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath }/resources/login/vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath }/resources/login/js/main.js"></script>

</body>
</html>