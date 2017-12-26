package com.wxgzh.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.wxgzh.framework.entity.BaseEntity;
import com.wxgzh.framework.models.AjaxResponse;
import com.wxgzh.framework.service.BaseService;
import com.wxgzh.framework.vo.BaseVo;

public abstract class AbstractController<M extends BaseEntity,V extends BaseVo> extends BaseController<M, V>{

	@Autowired
    private BaseService<M,V> baseService;
	
	/**
	 * 保存
	 * @param m
	 * @param result
	 * @return
	 */
	@GetMapping("/findOne")
	public AjaxResponse findOne(String id) {
		return new AjaxResponse(true, baseService.findOne(id));
	}
	
}
