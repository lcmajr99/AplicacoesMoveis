package com.sysambientes.sysambientes.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "embarcados")
@Data
public class Embarcado extends EntityBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "capacidade")
    private String capacidade;

    @Column(name = "descricao_embarcado")
    private String descricaoEmbarcado;

    @Column(name = "ip_embarcado")
    private String ipEmbarcado;

    @Column(name = "ip_gateway")
    private String ipGateway;

    @Column(name = "mac")
    private String mac;

    @Column(name = "masc")
    private String mascara;

    @Column(name = "password_wifi")
    private String passwordWifi;

    @Column(name = "ssid")
    private String ssid;

    @Column(name = "status")
    private String status;

    @Column(name = "tipo_rede")
    private String tipoRede;

    @Column(name = "ambiente_id")
    private String ambienteId;

    @OneToMany
    @JoinColumn(name = "ambiente_id")
    private List<Ambiente> ambienteList = new ArrayList<Ambiente>();


//________________________________

// RELACIONAMENTOS

//	@OneToMany
//	@JoinColumn(name = "usuario_id")
//	private List<Acesso> acessos = new ArrayList<Acesso>();

//	@ManyToMany
//	@JoinTable(name = "perfis_usuarios")
//	private List<Perfil> perfis = new ArrayList<Perfil>();

}