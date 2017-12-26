package com.wxgzh.framework.models;

import java.io.Serializable;

/**
 * 数据承载对象
 * @author cyg
 */
public class AjaxResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Boolean isLoging=false;//是否需要重新登陆
	
	private Boolean success;//是否成功
	
	private Boolean autoPrompt=false;//页面是否自动弹出消息提示。

	private String message;//提示信息
	
	private Object content;	//数据
	
	public AjaxResponse (){
	}
	
	public AjaxResponse (boolean success,String message){
		this.success=success;
		this.message=message;
	}
	
	public AjaxResponse (boolean success,String message,Boolean autoPrompt){
		this.success=success;
		this.message=message;
		this.autoPrompt=autoPrompt;
	}
	
	public AjaxResponse(boolean success,String message,boolean isLoging){
		this.success=success;
		this.message=message;
		this.isLoging=isLoging;
	}
	
	public AjaxResponse(boolean success,Object content){
		this.success=success;
		this.content=content;
	}
	
	public AjaxResponse(boolean success,String message,Object content){
		this.success=success;
		this.message=message;
		this.content=content;
	}
	public AjaxResponse(boolean success,String message,Object content,Boolean autoPrompt){
		this.success=success;
		this.message=message;
		this.content=content;
		this.autoPrompt=autoPrompt;
	}
	
	public Boolean getIsLoging() {
		return isLoging;
	}

	public void setIsLoging(Boolean isLoging) {
		this.isLoging = isLoging;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public Boolean getAutoPrompt() {
		return autoPrompt;
	}

	public void setAutoPrompt(Boolean autoPrompt) {
		this.autoPrompt = autoPrompt;
	}
}
