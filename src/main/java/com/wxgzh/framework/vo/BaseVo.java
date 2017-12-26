package com.wxgzh.framework.vo;

/**
 * vo 数据显示 抽象类
 * @author cyg
 */
public abstract class  BaseVo implements IBaseVo {
	
	private static final long serialVersionUID = 1L;

	private String id;
	
	private int version; 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
