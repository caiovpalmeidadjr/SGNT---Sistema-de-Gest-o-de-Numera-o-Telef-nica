package br.com.sgnt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue
	@Column(name = "ID_CLIE")
	private Integer idCliente;

	@Column(name = "NOME_CLIE")
	private String nomeClie;

	@Column(name = "LOGR_CLIE")
	private String logradouroClie;

	@Column(name = "MUNI_CLIE")
	private String municipioClie;

	@Column(name = "CEP_CLIE")
	private String cepClie;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeClie() {
		return nomeClie;
	}

	public void setNomeClie(String nomeClie) {
		this.nomeClie = nomeClie;
	}

	public String getLogradouroClie() {
		return logradouroClie;
	}

	public void setLogradouroClie(String logradouroClie) {
		this.logradouroClie = logradouroClie;
	}

	public String getMunicipioClie() {
		return municipioClie;
	}

	public void setMunicipioClie(String municipioClie) {
		this.municipioClie = municipioClie;
	}

	public String getCepClie() {
		return cepClie;
	}

	public void setCepClie(String cepClie) {
		this.cepClie = cepClie;
	}

}
