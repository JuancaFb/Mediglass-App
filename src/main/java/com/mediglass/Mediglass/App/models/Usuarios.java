package com.mediglass.Mediglass.App.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="fusuarios")
public class Usuarios implements Serializable {

    public Usuarios() {

    }

    @Id
    @Getter @Setter @Column(name="id")
    private Integer id;

    @Getter @Setter @Column(name="idcliente")
    private Integer idcliente;

    @Getter @Setter @Column(name="alias")
    private String alias;

    @Getter @Setter @Column(name="numuser")
    private Integer numuser;

    @Getter @Setter @Column(name="contrasena")
    private String contrasena;

    @Getter @Setter @Column(name="user")
    private String user;

}
