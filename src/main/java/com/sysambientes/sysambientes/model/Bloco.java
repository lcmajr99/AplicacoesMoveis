package com.sysambientes.sysambientes.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "blocos")
@Data
public class Bloco extends EntityBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "andar_bloco")
    private String andarBloco;

    @Column(name = "nome_bloco")
    private String nomeBloco;

    @Column(name = "unidade_id")
    private String unidadeId;



//________________________________

// RELACIONAMENTOS

//	@OneToMany
//	@JoinColumn(name = "usuario_id")
//	private List<Acesso> acessos = new ArrayList<Acesso>();

//	@ManyToMany
//	@JoinTable(name = "perfis_usuarios")
//	private List<Perfil> perfis = new ArrayList<Perfil>();

}