package com.mediglass.Mediglass.App.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="fobra")
public class Obras implements Serializable {

    public Obras() {

    }

    @Id
    @Getter @Setter
    @Column(name="id")
    private Integer id;

    @Getter @Setter @Column(name="estadoobra")
    private String estadoobra;

    @Getter @Setter @Column(name="fecreaobra")
    private String fecreaobra;

    @Getter @Setter @Column(name="usuariocrea")
    private String usuariocrea;

    @Getter @Setter @Column(name="femodiobra")
    private String femodiobra;

    @Getter @Setter @Column(name="usuariomodi")
    private String usuariomodi;

    @Getter @Setter @Column(name="nclienteobra")
    private Integer nclienteobra;

    @Getter @Setter @Column(name="nobra")
    private Integer nobra;

    @Getter @Setter @Column(name="nombreobra")
    private String nombreobra;

    @Getter @Setter @Column(name="direccionobra")
    private String direccionobra;

    @Getter @Setter @Column(name="poblacionobra")
    private String poblacionobra;

    @Getter @Setter @Column(name="provinciaobra")
    private String provinciaobra;

    @Getter @Setter @Column(name="dpobra")
    private String dpobra;

    @Getter @Setter @Column(name="define1obra")
    private String define1obra;

    @Getter @Setter @Column(name="tlfnoobra")
    private String tlfnoobra;

    @Getter @Setter @Column(name="faxobra")
    private String faxobra;

    @Getter @Setter @Column(name="movilobra")
    private String movilobra;

    @Getter @Setter @Column(name="emailobra")
    private String emailobra;

}
