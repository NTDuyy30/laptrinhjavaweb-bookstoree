package com.ttcn.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ttcn.constant.SystemConstant;
import com.ttcn.model.CategoryModel;
import com.ttcn.paging.PageRequest;
import com.ttcn.paging.Pageble;
import com.ttcn.service.ICategoryService;
import com.ttcn.sort.Sorter;
import com.ttcn.utils.FormUtil;

@WebServlet(urlPatterns = {"/admin-category"})
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private ICategoryService categoryService;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryModel model = FormUtil.toModel(CategoryModel.class, request);
		
		Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItems(), new Sorter(model.getSortName(), model.getSortBy()));
		model.setListResult(this.categoryService.findAll(pageble));
		model.setTotalItem(categoryService.getTotalItem());
		model.setTotalPages((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItems()));
		
		request.setAttribute(SystemConstant.MODEL, model);
		request.getRequestDispatcher("/views/admin/category/list.jsp").forward(request, response);
	}
}

