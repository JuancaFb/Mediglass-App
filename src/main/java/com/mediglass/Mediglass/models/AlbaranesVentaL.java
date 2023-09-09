package com.mediglass.Mediglass.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="falbavtal")
public class AlbaranesVentaL implements Serializable {

    public AlbaranesVentaL(){

    }

    @Id
    @Getter
    @Setter
    @Column(name="id")
    private Integer id;

    @Getter @Setter @Column(name="estadodol")
    private String estadodol;

    @Getter @Setter @Column(name="fecreadol")
    private String fecreadol;

    @Getter @Setter @Column(name="usuariocrea")
    private String usuariocrea;

    @Getter @Setter @Column(name="femodidol")
    private String femodidol;

    @Getter @Setter @Column(name="usuariomodi")
    private String usuariomodi;

    @Getter @Setter @Column(name="tipodocdol")
    private String tipodocdol;

    @Getter @Setter @Column(name="ndocdol")
    private Integer ndocdol;

    @Getter @Setter @Column(name="fedocdol")
    private String fedocdol;

    @Getter @Setter @Column(name="ncliprovdol")
    private Integer ncliprovdol;

    @Getter @Setter @Column(name="tipoalbadol")
    private String tipoalbadol;

    @Getter @Setter @Column(name="nalbadol")
    private Integer nalbadol;

    @Getter @Setter @Column(name="falbadol")
    private String falbadol;

    @Getter @Setter @Column(name="lineadol")
    private Integer lineadol;

    @Getter @Setter @Column(name="vendedordol")
    private Integer vendedordol;

    @Getter @Setter @Column(name="canaldol")
    private String canaldol;

    @Getter @Setter @Column(name="cdgoartdol")
    private String cdgoartdol;

    @Getter @Setter @Column(name="descriartdol")
    private String descriartdol;

    @Getter @Setter @Column(name="cdgobarraartdol")
    private String cdgobarraartdol;

    @Getter @Setter @Column(name="eiptartdol")
    private String eiptartdol;

    @Getter @Setter @Column(name="familiadol")
    private String familiadol;

    @Getter @Setter @Column(name="grupodefdol")
    private String grupodefdol;

    @Getter @Setter @Column(name="ubicartdol")
    private String ubicartdol;

    @Getter @Setter @Column(name="define1artdol")
    private String definde1artdol;

    @Getter @Setter @Column(name="define2artdol")
    private String define2artdol;

    @Getter @Setter @Column(name="ivaartdol")
    private String ivaartdol;

    @Getter @Setter @Column(name="unidadesdol")
    private String unidadesdol;

    @Getter @Setter @Column(name="preciodol")
    private String preciodol;

    @Getter @Setter @Column(name="dto1dol")
    private String dto1dol;

    @Getter @Setter @Column(name="dto2dol")
    private String dto2dol;

    @Getter @Setter @Column(name="dto3dol")
    private String dto3dol;

    @Getter @Setter @Column(name="dto4dol")
    private String dto4dol;

    @Getter @Setter @Column(name="totlineadol")
    private String totlineadol;

    @Getter @Setter @Column(name="ecotasadol")
    private String ecotasadol;

    @Getter @Setter @Column(name="unservdol")
    private String unservdol;

    @Getter @Setter @Column(name="unfactdol")
    private String unfactdol;

    @Getter @Setter @Column(name="uneidescdol")
    private String uneidescdol;

    @Getter @Setter @Column(name="feiniciodol")
    private String feiniciodol;

    @Getter @Setter @Column(name="ferecogidadol")
    private String ferecogidadol;

    @Getter @Setter @Column(name="fefinaldol")
    private String fefinaldol;

    @Getter @Setter @Column(name="pnetodol")
    private String pnetodol;

    @Getter @Setter @Column(name="margendol")
    private String margendol;

    @Getter @Setter @Column(name="porcomisdol")
    private String porcomisdol;

    @Getter @Setter @Column(name="impcomisdol")
    private String impocomisdol;

    @Getter @Setter @Column(name="cantidaddol")
    private String cantidaddol;

    @Getter @Setter @Column(name="medida1dol")
    private String medida1dol;

    @Getter @Setter @Column(name="medida2dol")
    private String medida2dol;

    @Getter @Setter @Column(name="canto1dol")
    private Integer canto1dol;

    @Getter @Setter @Column(name="canto2dol")
    private Integer canto2dol;

    @Getter @Setter @Column(name="seriesndol")
    private String seriesndol;

    @Getter @Setter @Column(name="largodol")
    private String largodol;

    @Getter @Setter @Column(name="anchodol")
    private String anchodol;

    @Getter @Setter @Column(name="altodol")
    private String altodol;

    @Getter @Setter @Column(name="cadandol")
    private String cadandol;

    @Getter @Setter @Column(name="kilosdol")
    private String kilosdol;
}
