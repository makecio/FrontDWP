package br.com.FrontDWP.model;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String name;
	
	private String surname;
	
	private int active;
	
	private Date created;
	
	private Date modified;
	
	private Date deleted;
	
	private String token;
	
	private Date token_expire_date;

	private Long cliente;

	private String email;
	
	private String password;
	
	public User(){}


	

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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




	public String getSurname() {
		return surname;
	}




	public void setSurname(String surname) {
		this.surname = surname;
	}




	public int getActive() {
		return active;
	}




	public void setActive(int active) {
		this.active = active;
	}




	public Date getCreated() {
		return created;
	}




	public void setCreated(Date created) {
		this.created = created;
	}




	public Date getModified() {
		return modified;
	}




	public void setModified(Date modified) {
		this.modified = modified;
	}




	public Date getDeleted() {
		return deleted;
	}




	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}




	public String getToken() {
		return token;
	}




	public void setToken(String token) {
		this.token = token;
	}




	public Date getToken_expire_date() {
		return token_expire_date;
	}




	public void setToken_expire_date(Date token_expire_date) {
		this.token_expire_date = token_expire_date;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public Long getCliente() {
		return cliente;
	}

	
	
	


	





	
	
	

}
