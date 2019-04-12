package br.com.FrontDWP.model;

import java.io.Serializable;


public class Folder implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private long id;
	private	String name;
	private int folder_parent_id;
	private String folderscol;
	//private UserEntity user;

	//Getters and Setters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFolder_parent_id() {
		return folder_parent_id;
	}
	public void setFolder_parent_id(int folder_parent_id) {
		this.folder_parent_id = folder_parent_id;
	}
	public String getFolderscol() {
		return folderscol;
	}
	public void setFolderscol(String folderscol) {
		this.folderscol = folderscol;
	}

}
