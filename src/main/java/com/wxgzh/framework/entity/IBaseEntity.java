package com.wxgzh.framework.entity;

import java.io.Serializable;

public interface IBaseEntity extends Serializable{

	Serializable getId();
	
	int getVersion();
}
