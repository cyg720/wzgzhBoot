package com.wxgzh.framework.service;

import com.wxgzh.framework.entity.IBaseEntity;

public interface IBaseService<M extends IBaseEntity> {

	//保存
	 M save(M m);
	 
	//查询单个数据
	 M findOne(String id);
}
