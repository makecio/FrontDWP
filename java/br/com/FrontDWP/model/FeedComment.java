package br.com.FrontDWP.model;

import java.sql.Timestamp;
import java.util.Date;

public class FeedComment{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;

	private Long idFeed;
	
	private String texto;
	
	private Long data;
	private Date dataView;
	
	private Long hora;
	private Timestamp horaView;
	
	private Long idUser;
		
	private boolean deleted;

	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdFeed() {
		return idFeed;
	}

	public void setIdFeed(Long idFeed) {
		this.idFeed = idFeed;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Long getData() {
		return data;
	}

	public void setData(Long data) {
		this.data = data;
	}

	public Date getDataView() {
		return dataView;
	}

	public void setDataView(Date dataView) {
		this.dataView = dataView;
	}

	public Long getHora() {
		return hora;
	}

	public void setHora(Long hora) {
		this.hora = hora;
	}

	public Timestamp getHoraView() {
		return horaView;
	}

	public void setHoraView(Timestamp horaView) {
		this.horaView = horaView;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public FeedComment(Long id, Long idFeed, String texto, Long data,
			Date dataView, Long hora, Timestamp horaView, Long idUser,
			boolean deleted, User user) {
		super();
		this.id = id;
		this.idFeed = idFeed;
		this.texto = texto;
		this.data = data;
		this.dataView = dataView;
		this.hora = hora;
		this.horaView = horaView;
		this.idUser = idUser;
		this.deleted = deleted;
		this.user = user;
	}

	public FeedComment() {
		super();
		// TODO Auto-generated constructor stub
	}
	





}
