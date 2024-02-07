<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Trang chủ"/></title>

<!-- Bootstrap core CSS -->
<link href="template/web/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" />

<!-- Custom styles for this template -->
<link href="template/web/css/shop-homepage.css" rel="stylesheet" />

</head>
<body>
	<!-- Header -->
	<%@ include file="/common/web/header.jsp" %>
	<!-- Header -->
	
	<div class="container">
		<div class="row">
			<!-- Menu -->
			<%@ include file="/common/web/menu.jsp" %>
			<!-- Menu -->
			
			<!-- Body -->
			<dec:body/>
			<!-- Body -->
		</div>
	</div>
	
	<!-- Footer -->
	<%@ include file="/common/web/footer.jsp" %>
	<!-- Footer -->

	<!-- Bootstrap core JavaScript -->
	<script src="template/web/vendor/jquery/jquery.min.js"></script>
	<script src="template/web/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>