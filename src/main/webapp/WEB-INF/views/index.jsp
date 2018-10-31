<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
				<ul class="fh5co-social">
					<li><a href="showAddNoteForm"><i class="">Add Note</i></a></li>
				</ul>
				<div class="col-lg-12 col-md-12 text-center">
					<h1 id="fh5co-logo">
						<a href="/onlinenotepad/">Online Notepad</a>
					</h1>
				</div>

			</div>

		</div>

	</header>
	<!-- END #fh5co-header -->
	<div class="container-fluid">
		<div class="row fh5co-post-entry">
			<c:forEach items="${noteList }" var="note">
				<article
					class="col-lg-3 col-md-3 col-sm-3 col-xs-6 col-xxs-12 animate-box">
					<h2 class="fh5co-article-title">
						<a href="details">${note.title }</a>
					</h2>
					<h3>
						<a href="details" style="color: #999999">${note.content }</a>
					</h3>
					<span class="fh5co-meta fh5co-date">${note.noteDate }</span>
				</article>
			</c:forEach>
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

