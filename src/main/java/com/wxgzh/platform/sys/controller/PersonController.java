package com.wxgzh.platform.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wxgzh.framework.controller.AbstractController;
import com.wxgzh.platform.sys.enyity.Person;
import com.wxgzh.platform.sys.service.PersonService;
import com.wxgzh.platform.sys.vo.PersonVo;

@RestController
public class PersonController extends AbstractController<Person, PersonVo> {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/save")
	public String save() {
		Person p = new Person();
		p.setName("张三");
		Person pd = personService.save(p);
		return pd.getId();
	}
	
}
