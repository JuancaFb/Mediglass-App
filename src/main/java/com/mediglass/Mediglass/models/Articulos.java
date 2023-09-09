package com.mediglass.Mediglass.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="farticulos")
public class Articulos implements Serializable {

    public Articulos() {

    }

    @Id
    @Getter @Setter
    @Column(name="id")
    private Integer id;

    @Getter @Setter @Column(name="estadoart")
    private String estadoart;

    @Getter @Setter @Column(name="fecreaart")
    private String fecreaart;

    @Getter @Setter @Column(name="usuariocrea")
    private String usuariocrea;

    @Getter @Setter @Column(name="femodiart")
    private String femodiart;

    @Getter @Setter @Column(name="usuariomodi")
    private String usuariomodi;

    @Getter @Setter @Column(name="eiptart")
    private String eiptart;

    @Getter @Setter @Column(name="codigoart")
    private String codigoart;

    @Getter @Setter @Column(name="familiaart")
    private String familiaart;

    @Getter @Setter @Column(name="codigobarraart")
    private String codigobarraart;

    @Getter @Setter @Column(name="descriart")
    private String descriart;

    @Getter @Setter @Column(name="infoadicart")
    private String infoadicart;

    @Getter @Setter @Column(name="grupodefart")
    private String grupodefart;

    @Getter @Setter @Column(name="ubicart")
    private String ubicart;

    @Getter @Setter @Column(name="define1art")
    private String define1art;

    @Getter @Setter @Column(name="define2art")
    private String define2art;

    @Getter @Setter @Column(name="imagenart")
    private String imagenart;

    @Getter @Setter @Column(name="pvp1art")
    private String pvp1art;

    @Getter @Setter @Column(name="pvp2art")
    private String pvp2art;
    @Getter @Setter @Column(name="pvp3art")
    private String pvp3art;

    @Getter @Setter @Column(name="pvpofertart")
    private String pvpofertart;

    @Getter @Setter @Column(name="dtoofertart")
    private String dtoofertart;

    @Getter @Setter @Column(name="limitofertart")
    private String limitofertart;

    @Getter @Setter @Column(name="pmvart")
    private String pmvart;

    @Getter @Setter @Column(name="ivaart")
    private String ivaart;

    @Getter @Setter @Column(name="ecotasaart")
    private String ecotasaart;

    @Getter @Setter @Column(name="tipodtoart")
    private Integer tipodtoart;

    @Getter @Setter @Column(name="provhabart")
    private Integer provhabart;

    @Getter @Setter @Column(name="saldoiniart")
    private String saldoiniart;
    @Getter @Setter @Column(name="entradart")
    private String entradart;

    @Getter @Setter @Column(name="salidart")
    private String salidart;

    @Getter @Setter @Column(name="stockart")
    private String stockart;

    @Getter @Setter @Column(name="miniart")
    private String miniart;

    @Getter @Setter @Column(name="maxiart")
    private String maxiart;

    @Getter @Setter @Column(name="pcostoart")
    private String pcostoart;

    @Getter @Setter @Column(name="pmcart")
    private String pmcart;

    @Getter @Setter @Column(name="feultcomprart")
    private String feultcomprart;

    @Getter @Setter @Column(name="feultventart")
    private String feultventart;

    @Getter @Setter @Column(name="fetarifart")
    private String fetarifart;

    @Getter @Setter @Column(name="serieart")
    private String serieart;

    @Getter @Setter @Column(name="mesesgaranart")
    private Integer mesesgaranart;

    @Getter @Setter @Column(name="usomedidart")
    private String usomedidart;

    @Getter @Setter @Column(name="largoart")
    private String largoart;

    @Getter @Setter @Column(name="anchoart")
    private String anchoart;

    @Getter @Setter @Column(name="altoart")
    private String altoart;

    @Getter @Setter @Column(name="cadanart")
    private Integer cadanart;

    @Getter @Setter @Column(name="kilosart")
    private String kilosart;

    @Getter @Setter @Column(name="memo1art")
    private String memo1art;

    @Getter @Setter @Column(name="memo2art")
    private String memo2art;

    @Getter @Setter @Column(name="memo3art")
    private String memo3art;

    @Getter @Setter @Column(name="memo4art")
    private String memo4art;

    @Getter @Setter @Column(name="blkregart")
    private Integer blkregart;

    @Getter @Setter @Column(name="regularizart")
    private Integer regularizart;

    @Getter @Setter @Column(name="acum1art")
    private String acum1art;

    @Getter @Setter @Column(name="acum2art")
    private String acum2art;

    @Getter @Setter @Column(name="acum3art")
    private String acum3art;

    @Getter @Setter @Column(name="acum4art")
    private String acum4art;

    @Getter @Setter @Column(name="loteart")
    private String loteart;

















}
