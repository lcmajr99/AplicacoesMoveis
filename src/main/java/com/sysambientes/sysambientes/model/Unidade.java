package com.sysambientes.sysambientes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "unidades")
@Data
public class Unidade extends EntityBase implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "nome_unidade")
	private String nome;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "endereco")
	private String endereco;
	
	@ManyToOne()
	@JoinColumn(name = "regional_id")
	private Regional regional;
	
//	@JsonIgnore
//	@OneToMany(mappedBy = "unidade", fetch = FetchType.LAZY)
//	private List<Bloco> blocos;
	
}
