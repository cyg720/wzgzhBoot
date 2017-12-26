package com.wxgzh.platform.sys.enyity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.wxgzh.framework.entity.BaseEntity;

@Entity
@Table(name="sys_person")
public class Person extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(columnDefinition="int(3)")
	private Integer age;
	
	@Column(columnDefinition="varchar(32)")
	private String name;

	@Column(columnDefinition="varchar(15)")
	private String phone;
	
	@Column(columnDefinition="varchar(100)")
	private String address;
	
	@Column(columnDefinition="varchar(32)")
	private String email;
	
	@Column(columnDefinition="varchar(120)")
	private String password; 
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
