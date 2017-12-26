package com.wxgzh.framework.models;

import java.util.HashMap;

/**
 * 接收参数
 * @author cyg
 */
public class ParamMap extends HashMap<String, Object >{

	private static final long serialVersionUID = 1L;  
	
	public ParamMap() {
		super();
	}
	

	public String getHqlWhere() {
		HashMap<String, Object > par = this;
		System.out.println(par);
		return "";
	}
	
}
