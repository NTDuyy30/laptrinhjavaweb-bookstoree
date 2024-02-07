package com.ttcn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ttcn.constant.SystemConstant;
import com.ttcn.model.UserModel;
import com.ttcn.utils.SessionUtil;

public class AuthorizationFilter implements Filter{
	private ServletContext context;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.context = filterConfig.getServletContext();
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String url = request.getServletPath();
		if (url.startsWith("/admin")) {
			UserModel model = (UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL");
			if (model != null) {
				if (model.getChucVu().equals(SystemConstant.ADMIN)) {
					chain.doFilter(servletRequest, servletResponse);
				} else if (model.getChucVu().equals(SystemConstant.USER)) {
					response.sendRedirect(request.getContextPath()+ "/login?action=login&alert=danger&message=not_permission");
				}
			} else {
				response.sendRedirect(request.getContextPath()+ "/login?action=login&alert=danger&message=not_login");
			}
		} else {
			chain.doFilter(servletRequest, servletResponse);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
