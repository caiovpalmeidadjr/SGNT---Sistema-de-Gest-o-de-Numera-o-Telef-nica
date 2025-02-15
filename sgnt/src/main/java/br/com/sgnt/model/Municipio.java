package br.com.sgnt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MUNICIPIO")
public class Municipio {

	@Id
	@GeneratedValue
	@Column(name = "ID_MUNI")
	private Integer idMunicipio;

	@Column(name = "SIGL_MUNI")
	private String siglaMunicipio;

	@Column(name = "NOME_MUNI")
	private String nomeMunicipio;

	//Lazy Loading, o Eager Loading carrega os dados mesmo que você não vá utilizá-los, mas é óbvio que você só 
	//utilizará esta técnica se de fato você for precisar com muita frequência dos dados carregados.
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_ARLC", insertable = true, updatable = true, referencedColumnName = "ID_ARLC")
	private AreaLocal areaLocal;

	public Integer getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getSiglaMunicipio() {
		return siglaMunicipio;
	}

	public void setSiglaMunicipio(String siglaMunicipio) {
		this.siglaMunicipio = siglaMunicipio;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public AreaLocal getAreaLocal() {
		return areaLocal;
	}

	public void setAreaLocal(AreaLocal areaLocal) {
		this.areaLocal = areaLocal;
	}

}
