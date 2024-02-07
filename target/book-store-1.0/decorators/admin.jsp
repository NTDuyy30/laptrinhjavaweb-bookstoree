<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Trang quản trị" /></title>

<!-- Custom fonts for this template-->
<!-- Icon -->
<link href="template/admin/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<!-- Font -->
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="template/admin/css/sb-admin-2.min.css" rel="stylesheet">

<style>
#pagination li {
	margin: 10px;
}
</style>

</head>
<body id="page-top">
	<div id="wrapper">
		<!-- Menu -->
		<%@ include file="/common/admin/menu.jsp"%>
		<!-- Menu -->

		<div id="content-wrapper">
			<div id="content">
				<!-- Header -->
				<%@ include file="/common/admin/header.jsp"%>
				<!-- Header -->

				<!-- Body -->
				<dec:body />
				<!-- Body -->
			</div>
			<!-- Footer -->
			<%@ include file="/common/admin/footer.jsp"%>
			<!-- Footer -->
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="template/admin/vendor/jquery/jquery.min.js"></script>
	<script
		src="template/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="template/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="template/admin/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="template/admin/vendor/chart.js/Chart.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="template/admin/js/demo/chart-area-demo.js"></script>
	<script src="template/admin/js/demo/chart-pie-demo.js"></script>

	<!-- Jquery Pagination -->
	<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="template/paging/jq-paginator.js"></script>
	<script type="text/javascript">
		var totalPages = ${model.totalPages};
		var limit = 2;
		var currentPage = ${model.page};
		$.jqPaginator('#pagination', {
			totalPages : totalPages,
			visiblePages : 5,
			currentPage : currentPage,
			onPageChange: function (num) {
				$('#p1').text('Trang hiện tại：' + num);
				if (currentPage != num) {
					$('#page').val(num);
					$('#maxPageItems').val(limit);
					$('#sortName').val('tenDanhMuc');
					$('#sortBy').val('desc');
					$('#formSubmit').submit();
				}
        	}
		});
	</script>
</body>
</html>