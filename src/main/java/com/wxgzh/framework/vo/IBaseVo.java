package com.wxgzh.framework.vo;

import java.io.Serializable;

import com.wxgzh.framework.entity.BaseEntity;

/**
 * vo 接口
 * @author cyg
 */
public interface IBaseVo extends Serializable{

	String getId();

	int getVersion();
	
	void convert(BaseEntity entity);
}
