package com.sysambientes.sysambientes.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "regionais")
@Data
public class Regional extends EntityBase implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "sigla")
	private String sigla;
	
	@OneToMany(mappedBy = "regional", fetch = FetchType.LAZY)
	private List<Unidade> unidades;

}
