package com.neuedu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.mapper.CategoryMapper;
import com.neuedu.model.Category;
import com.neuedu.service.CategoryService;

@Service     //ע��service��ʵ����
@Transactional  //�˴����ٽ��д���SqlSession���ύ���񣬶��ѽ���springȥ�����ˡ�
public class CategoryServiceImpl implements CategoryService{


	@Resource  //ע��ע��
	private CategoryMapper mapper;
	
	
	@Override//���½ӿ��ж���ķ�
	public List<Category> selectAll() {
		// TODO �Զ����ɵķ������
		return mapper.selectAll();
	}


	@Override
	public Category selectByPrimaryKey(Integer cid) {
		// TODO �Զ����ɵķ������
		return mapper.selectByPrimaryKey(cid);
	}


	@Override
	public int updateByPrimaryKey(Category record) {
		// TODO �Զ����ɵķ������
		return mapper.updateByPrimaryKey(record);
	}
}
