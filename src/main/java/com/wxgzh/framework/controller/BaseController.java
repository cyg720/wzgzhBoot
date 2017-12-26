package com.wxgzh.framework.controller;

import org.springframework.transaction.annotation.Transactional;

import com.wxgzh.framework.entity.BaseEntity;
import com.wxgzh.framework.utils.ReflectUtil;
import com.wxgzh.framework.vo.BaseVo;

@SuppressWarnings("unused")
@Transactional
public class BaseController<M extends BaseEntity,V extends BaseVo> {

	private Class<M> entityClass;
	private Class<V> valueClass;

    protected BaseController() {
        entityClass = ReflectUtil.findParameterizedType(getClass(), 0);
        valueClass = ReflectUtil.findParameterizedType(getClass(), 1);
    }
	
}
