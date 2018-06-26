package com.neuedu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.mapper.CategoryMapper;
import com.neuedu.model.Category;
import com.neuedu.service.CategoryService;

@Service     //注解service的实现类
@Transactional  //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class CategoryServiceImpl implements CategoryService{


	@Resource  //注解注入
	private CategoryMapper mapper;
	
	
	@Override//重新接口中定义的方
	public List<Category> selectAll() {
		// TODO 自动生成的方法存根
		return mapper.selectAll();
	}


	@Override
	public Category selectByPrimaryKey(Integer cid) {
		// TODO 自动生成的方法存根
		return mapper.selectByPrimaryKey(cid);
	}


	@Override
	public int updateByPrimaryKey(Category record) {
		// TODO 自动生成的方法存根
		return mapper.updateByPrimaryKey(record);
	}
}
