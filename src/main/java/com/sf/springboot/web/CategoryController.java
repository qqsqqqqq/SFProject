package com.sf.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sf.springboot.mapper.CategoryDao;
import com.sf.springboot.pojo.Category;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryDao categoryMapper;

	@RequestMapping("/listCategory")
	public String ListCategory(Model m) throws Exception {
		List<Category> cs = categoryMapper.findAll();

		m.addAttribute("cs", cs);

		return "listCategory";
	}
}
