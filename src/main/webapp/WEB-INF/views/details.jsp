<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>BLOG</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="description" />
<meta name="keywords" content="searching keywords" />
<meta name="author" content="Tutku Ince" />

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link rel="shortcut icon" href="favicon.ico">
<!-- Google Fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Playfair+Display:400,700,400italic|Roboto:400,300,700'
	rel='stylesheet' type='text/css'>
<!-- Animate -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/animate.css">
<!-- Icomoon -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/bootstrap.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/style.css">


<!-- Modernizr JS -->
<script
	src="${pageContext.request.contextPath }/resources/js/modernizr-2.6.2.min.js"></script>

</head>
<body>
	<div id="fh5co-offcanvas">
		<a href="#" class="fh5co-close-offcanvas js-fh5co-close-offcanvas"><span><i
				class="icon-cross3"></i> <span>Close</span></span></a>
		<div class="fh5co-bio">
			<figure>
				<img
					src="${pageContext.request.contextPath }/resources/images/person1.jpg"
					alt="Free HTML5 Bootstrap Template" class="img-responsive">
			</figure>
			<h3 class="heading">About Me</h3>
			<h2>Tutku Ince</h2>
			<p>Hi! I am Tutku. I am a computer engineer and working as a java
				developer.</p>
			<ul class="fh5co-social">
				<li><a href="#"><i class="icon-twitter"></i></a></li>
				<li><a href="#"><i class="icon-facebook"></i></a></li>
				<li><a href="#"><i class="icon-instagram"></i></a></li>
			</ul>
		</div>

	</div>

	<!-- END #fh5co-offcanvas -->
	<header id="fh5co-header">

		<div class="container-fluid">

			<div class="row">
				<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
				<div class="col-lg-12 col-md-12 text-center">
					<h1 id="fh5co-logo">
						<a href="index.html">Oneline Notepad</a>
					</h1>
				</div>

			</div>

		</div>

	</header>
	<!-- END #fh5co-header -->
	<div class="container-fluid">
		<div class="row fh5co-post-entry single-entry">
			<article
				class="col-lg-8 col-lg-offset-2 col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2 col-xs-12 col-xs-offset-0">

				<form:form action="updateNote" method="POST" modelAttribute="note">
					<h2 class="fh5co-article-title animate-box">
						<form:input path="title" placeholder="${note.title }" />
					</h2>
					<span class="fh5co-meta fh5co-date animate-box">${note.noteDate }</span>
					<form:hidden path="id" />
					<div
						class="col-lg-12 col-lg-offset-0 col-md-12 col-md-offset-0 col-sm-12 col-sm-offset-0 col-xs-12 col-xs-offset-0 text-left content-article">
						<div class="row">
							<div class="col-lg-8 cp-r animate-box">
								<form:textarea path="content" class="form form-control"
									style="width: 100%; height: 500px;" />
							</div>
							<div class="col-lg-4 animate-box">
								<div class="fh5co-highlight right">
									<form:button class="btn btn-success" style="width: 100%;">Update</form:button>
								</div>
							</div>
						</div>
					</div>
				</form:form>
				<div class="col-lg-4 animate-box">
					<div class="fh5co-highlight right">
						<a href="deleteNote?noteId=${note.id }">
							<button class="btn btn-danger" style="width: 100%;"
								onclick="if (!(confirm('Are you sure you want to delete this note?'))) return false">Delete</button>
						</a>
					</div>
				</div>
			</article>
		</div>
	</div>

	<footer id="fh5co-footer">
		<p>
			<small>&copy; 2018.</small>
		</p>
	</footer>
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath }/resources/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script
		src="${pageContext.request.contextPath }/resources/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script
		src="${pageContext.request.contextPath }/resources/js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script
		src="${pageContext.request.contextPath }/resources/js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="${pageContext.request.contextPath }/resources/js/main.js"></script>

</body>
</html>

