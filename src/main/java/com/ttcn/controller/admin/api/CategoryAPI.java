package com.ttcn.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ttcn.model.CategoryModel;
import com.ttcn.model.UserModel;
import com.ttcn.service.ICategoryService;
import com.ttcn.utils.HttpUtil;
import com.ttcn.utils.SessionUtil;

@WebServlet(urlPatterns = {"/api-admin-category"})
public class CategoryAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private ICategoryService categoryService;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ObjectMapper mapper = new ObjectMapper();
		CategoryModel categoryModel =  HttpUtil.of(request.getReader()).toModel(CategoryModel.class);
		categoryModel.setNguoiTao(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getHoTen());
		categoryModel = this.categoryService.insert(categoryModel);
		mapper.writeValue(response.getOutputStream(), categoryModel);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ObjectMapper mapper = new ObjectMapper();
		CategoryModel categoryModel =  HttpUtil.of(request.getReader()).toModel(CategoryModel.class);
		categoryModel.setNguoiSua(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getHoTen());
		categoryModel = this.categoryService.update(categoryModel);
		mapper.writeValue(response.getOutputStream(), categoryModel);
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ObjectMapper mapper = new ObjectMapper();
		CategoryModel categoryModel =  HttpUtil.of(request.getReader()).toModel(CategoryModel.class);
		this.categoryService.delete(categoryModel.getIds());
		mapper.writeValue(response.getOutputStream(), "{}");
	}

}
