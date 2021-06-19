package com.sysambientes.sysambientes.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ambientes")
@Data
public class Ambiente extends EntityBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "capacidade")
    private String capacidade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "ip_camera")
    private String ipCamera;

    @Column(name = "nome_ambiente")
    private String nomeAmbiente;

    @Column(name = "tipo_ambiente")
    private String tipoAmbiente;

    @Column(name = "bloco_id")
    private String blocoId;



//________________________________

// RELACIONAMENTOS

//	@OneToMany
//	@JoinColumn(name = "usuario_id")
//	private List<Acesso> acessos = new ArrayList<Acesso>();

//	@ManyToMany
//	@JoinTable(name = "perfis_usuarios")
//	private List<Perfil> perfis = new ArrayList<Perfil>();

}