package com.ttcn.controller.web;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ttcn.model.UserModel;
import com.ttcn.service.IUserService;
import com.ttcn.utils.FormUtil;
import com.ttcn.utils.SessionUtil;

@WebServlet(urlPatterns = {"/home", "/login", "/logout"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private IUserService userService;
	ResourceBundle resourcebundle = ResourceBundle.getBundle("message");
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			String alert = request.getParameter("alert");
			String message = request.getParameter("message");
			if (alert != null && message != null) {
				request.setAttribute("alert", alert);
				request.setAttribute("message", resourcebundle.getString(message));
			}
			request.getRequestDispatcher("/views/login.jsp").forward(request, response);
		} else if (action != null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(request, "USERMODEL");
			response.sendRedirect(request.getContextPath()+"/home");
		} else {
			request.getRequestDispatcher("/views/web/home.jsp").forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			UserModel model = FormUtil.toModel(UserModel.class, request);
			model = this.userService.findByUsernameAndPassword(model.getTenDangNhap(), model.getMatKhau());
			if (model != null) {
				SessionUtil.getInstance().putValue(request, "USERMODEL", model);
				if (model.getChucVu().equals("USER")) {
					response.sendRedirect(request.getContextPath()+ "/home");
				} else if (model.getChucVu().equals("ADMIN")) {
					response.sendRedirect(request.getContextPath()+ "/admin-home");
				}
			} else {
				response.sendRedirect(request.getContextPath()+ "/login?action=login&alert=danger&message=username_password_invalid");
			}
		} 
	}

}
