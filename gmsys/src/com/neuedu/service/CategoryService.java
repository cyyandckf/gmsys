package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Category;

public interface CategoryService {
	public List<Category> selectAll();
	Category selectByPrimaryKey(Integer cid);
	int updateByPrimaryKey(Category record);
}
