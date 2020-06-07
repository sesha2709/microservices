package com.dinesh.restful.webservices.restful.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	
	public String name;
	
	@Id
	@GeneratedValue
	public Integer id;
	
	public Date birthday;
	
	
	public User() {
	
	}

	public User(String name, Integer id, Date birthday) {
		super();
		this.name = name;
		this.id = id;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	
	
	

}
