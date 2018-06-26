package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.model.Category;
import com.neuedu.service.CategoryService;


//����mvc�Ŀ�������
@Controller
@RequestMapping("category")
public class CategoryController {

	// ��mvc�Ŀ��Ʋ�����service�����
	@Autowired
	private CategoryService categoryservice;

	//�������ͨ��URL�����������
	@RequestMapping("findAll")
	public String findAll( HttpServletRequest request ) {
		
		List<Category> category = categoryservice.selectAll();
		
		request.setAttribute("listCategory", category);
		
		return "zcflxinxi";		
	}//end 
	
	@RequestMapping("findById")
	public String findById( Integer cid, HttpServletRequest request ) {
		Category category = categoryservice.selectByPrimaryKey(cid);
		request.setAttribute("category", category);
		return "updatezcfl";		
	}
	
	@RequestMapping("findByIdchakan")
	public String findByIdchakan( Integer cid, HttpServletRequest request ) {
		Category category = categoryservice.selectByPrimaryKey(cid);
		request.setAttribute("category", category);
		return "zcfldetails";		
	}
	
	@RequestMapping("update")
	public String update( Integer cid, String cname, HttpServletRequest request ) {
		Category category = categoryservice.selectByPrimaryKey(cid);
		category.setCid(cid);
		category.setCname(cname);
		request.setAttribute("category", category);
		categoryservice.updateByPrimaryKey(category);
		return "updatezcfl";		
	}
	
	@RequestMapping("delete")
	public String delete() {
		
		return null;		
	}
	
}
