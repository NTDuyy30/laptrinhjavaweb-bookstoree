<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<c:if test="${not empty alert}">
									<div class="alert alert-${alert}" role="alert">
										${message}
									</div>
								</c:if>
								
								<form id="login" action="login?action=login" method="post"
									role="form" style="display: block;">
									<h2>ĐĂNG NHẬP</h2>
									<div class="form-group">
										<input type="text" name="tenDangNhap" id="username"
											tabindex="1" class="form-control" placeholder="Tên đăng nhập">
									</div>
									<div class="form-group">
										<input type="password" name="matKhau" id="password"
											tabindex="2" class="form-control" placeholder="Mật khẩu">
									</div>
									<div class="col-xs-12 form-group pull-right">
										<input type="submit" name="login-submit" id="login-submit"
											tabindex="4" class="form-control btn btn-login"
											value="Đăng nhập">
									</div>
								</form>

								<form id="register-form" action="#" method="post" role="form"
									style="display: none;">
									<h2>ĐĂNG KÝ</h2>
									<div class="form-group">
										<input type="text" name="tenDangNhap" id="username"
											tabindex="1" class="form-control" placeholder="Tên đăng nhập"
											value="">
									</div>
									<div class="form-group">
										<input type="text" name="hoTen" id="fullname" tabindex="1"
											class="form-control" placeholder="Tên đầy đủ" value="">
									</div>
									<div class="form-group">
										<input type="password" name="matKhau" id="password"
											tabindex="2" class="form-control" placeholder="Mật khẩu">
									</div>
									<div class="form-group">
										<input type="password" name="matKhauXacNhan"
											id="confirm-password" tabindex="2" class="form-control"
											placeholder="Xác nhận mật khẩu">
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit"
													id="register-submit" tabindex="4"
													class="form-control btn btn-register" value="Đăng ký ngay">
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6 tabs">
								<a href="#" class="active" id="login-form-link"><div
										class="login">ĐĂNG NHẬP</div></a>
							</div>
							<div class="col-xs-6 tabs">
								<a href="#" id="register-form-link"><div class="register">ĐĂNG
										KÝ</div></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>