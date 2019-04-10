package com.sf.springboot.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sf.springboot.Application;
import com.sf.springboot.mapper.CategoryDao;
import com.sf.springboot.pojo.Category;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CategoryTest {

	@Autowired
	private CategoryDao dao;

	@Before
	public void init() {
		System.out.println("before");
	}

	@Test
	public void testFindAll() {
		List<Category> findAll = dao.findAll();
		for (Category category : findAll) {
			System.out.println(category.getName());
		}
	}

	@After
	public void after() {
		System.out.println("after");
	}
}
