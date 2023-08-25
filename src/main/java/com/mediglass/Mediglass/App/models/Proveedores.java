package com.mediglass.Mediglass.App.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="fproveedores")
public class Proveedores implements Serializable {

    public Proveedores(){

    }

    @Id
    @Getter
    @Setter
    @Column(name="id")
    private Integer id;

    @Getter
    @Setter
    @Column(name="estadopro")
    private String estadopro;

    @Getter
    @Setter
    @Column(name="fecreapro")
    private String fecreapro;

    @Getter
    @Setter
    @Column(name="usuariocrea")
    private String usuariocrea;

    @Getter
    @Setter
    @Column(name="femodipro")
    private String femodipro;

    @Getter
    @Setter
    @Column(name="usuariomodi")
    private String usuariomodi;

    @Getter
    @Setter
    @Column(name="nproveedpro")
    private Integer nproveedpro;


    @Getter
    @Setter
    @Column(name="nombrepro")
    private String nombrepro;

    @Getter
    @Setter
    @Column(name="rsocialpro")
    private String rsocialpro;

    @Getter
    @Setter
    @Column(name="direccionpro")
    private String direccionpro;

    @Getter
    @Setter
    @Column(name="poblacionpro")
    private String poblacionpro;

    @Getter
    @Setter
    @Column(name="provinciapro")
    private String provinciapro;

    @Getter
    @Setter
    @Column(name="dpostalpro")
    private String dpostalpro;

    @Getter
    @Setter
    @Column(name="direnviopro")
    private String direnviopro;

    @Getter
    @Setter
    @Column(name="pobenviopro")
    private String pobenviopro;

    @Getter
    @Setter
    @Column(name="provenviopro")
    private String provenviopro;

    @Getter
    @Setter
    @Column(name="dpenviopro")
    private String dpenviopro;

    @Getter
    @Setter
    @Column(name="paispro")
    private String paispro;

    @Getter
    @Setter
    @Column(name="cifpro")
    private String cifpro;

    @Getter
    @Setter
    @Column(name="tlfnopro")
    private String tlfnopro;

    @Getter
    @Setter
    @Column(name="faxpro")
    private String faxpro;

    @Getter
    @Setter
    @Column(name="movil1pro")
    private String movil1pro;

    @Getter
    @Setter
    @Column(name="movil2pro")
    private String movil2pro;

    @Getter
    @Setter
    @Column(name="emailpro")
    private String emailpro;

    @Getter
    @Setter
    @Column(name="webpro")
    private String webpro;

    @Getter
    @Setter
    @Column(name="contactopro")
    private String contactopro;

    @Getter
    @Setter
    @Column(name="zonapro")
    private String zonapro;

    @Getter
    @Setter
    @Column(name="tipopro")
    private String tipopro;

    @Getter
    @Setter
    @Column(name="vendedorpro")
    private Integer vendedorpro;

    @Getter
    @Setter
    @Column(name="exentoivapro")
    private String exentoivapro;

    @Getter
    @Setter
    @Column(name="recargopro")
    private String recargopro;

    @Getter
    @Setter
    @Column(name="apliretenpro")
    private String apliretenpro;

    @Getter
    @Setter
    @Column(name="retenpro")
    private String retenpro;

    @Getter
    @Setter
    @Column(name="subctapro")
    private Double subctapro;

    @Getter
    @Setter
    @Column(name="dtopiepro")
    private String dtopiepro;

    @Getter
    @Setter
    @Column(name="dtopppro")
    private String dtopppro;

    @Getter
    @Setter
    @Column(name="formapagopro")
    private Integer formapagopro;

    @Getter
    @Setter
    @Column(name="diapago1pro")
    private Integer diapago1pro;

    @Getter
    @Setter
    @Column(name="diapago2pro")
    private Integer diapago2pro;

    @Getter
    @Setter
    @Column(name="diapago3pro")
    private Integer diapago3pro;

    @Getter
    @Setter
    @Column(name="clavefrapro")
    private String clavefrapro;

    @Getter
    @Setter
    @Column(name="modfrapro")
    private String modfrapro;

    @Getter
    @Setter
    @Column(name="copiafrapro")
    private Integer copiafrapro;

    @Getter
    @Setter
    @Column(name="modalbapro")
    private String modalbapro;

    @Getter
    @Setter
    @Column(name="copialbapro")
    private Integer copialbapro;

    @Getter
    @Setter
    @Column(name="modpedipro")
    private String modpedipro;

    @Getter
    @Setter
    @Column(name="copiapedipro")
    private Integer copiapedipro;

    @Getter
    @Setter
    @Column(name="modpresupro")
    private String modpresupro;

    @Getter
    @Setter
    @Column(name="copiapresupro")
    private Integer copiapresupro;

    @Getter
    @Setter
    @Column(name="pvpaplipro")
    private String pvpaplipro;

    @Getter
    @Setter
    @Column(name="rutapro")
    private Integer rutapro;

    @Getter
    @Setter
    @Column(name="agenciapro")
    private Integer agenciapro;

    @Getter
    @Setter
    @Column(name="modoportepro")
    private String modoportepro;

    @Getter
    @Setter
    @Column(name="nobrapro")
    private Integer nobrapro;

    @Getter
    @Setter
    @Column(name="nombreobrapro")
    private String nombreobrapro;

    @Getter
    @Setter
    @Column(name="define1pro")
    private String define1pro;

    @Getter
    @Setter
    @Column(name="define2pro")
    private String define2pro;

    @Getter
    @Setter
    @Column(name="bancopro")
    private String bancopro;

    @Getter
    @Setter
    @Column(name="dirbancopro")
    private String dirbancopro;

    @Getter
    @Setter
    @Column(name="pobbancopro")
    private String pobbancopro;

    @Getter
    @Setter
    @Column(name="cccpro")
    private String cccpro;

    @Getter
    @Setter
    @Column(name="riesgopro")
    private String riesgopro;

    @Getter
    @Setter
    @Column(name="tfactu1pro")
    private String tfactu1pro;

    @Getter
    @Setter
    @Column(name="tfactu2pro")
    private String tfactu2pro;

    @Getter
    @Setter
    @Column(name="fultfrapro")
    private String fultfrapro;

    @Getter
    @Setter
    @Column(name="fam1pro")
    private String fam1pro;

    @Getter
    @Setter
    @Column(name="dtofam1pro")
    private String dtofam1pro;

    @Getter
    @Setter
    @Column(name="fam2pro")
    private String fam2pro;

    @Getter
    @Setter
    @Column(name="dtofam2pro")
    private String dtofam2pro;

    @Getter
    @Setter
    @Column(name="fam3pro")
    private String fam3pro;

    @Getter
    @Setter
    @Column(name="dtofam3pro")
    private String dtofam3pro;

    @Getter
    @Setter
    @Column(name="fam4pro")
    private String fam4pro;

    @Getter
    @Setter
    @Column(name="dtofam4pro")
    private String dtofam4pro;

    @Getter
    @Setter
    @Column(name="fam5pro")
    private String fam5pro;

    @Getter
    @Setter
    @Column(name="dtofam5pro")
    private String dtofam5pro;

    @Getter
    @Setter
    @Column(name="fam6pro")
    private String fam6pro;

    @Getter
    @Setter
    @Column(name="dtofam6pro")
    private String dtofam6pro;

    @Getter
    @Setter
    @Column(name="fam7pro")
    private String fam7pro;

    @Getter
    @Setter
    @Column(name="dtofam7pro")
    private String dtofam7pro;

    @Getter
    @Setter
    @Column(name="fam8pro")
    private String fam8pro;

    @Getter
    @Setter
    @Column(name="dtofam8pro")
    private String dtofam8pro;

    @Getter
    @Setter
    @Column(name="fam9pro")
    private String fam9pro;

    @Getter
    @Setter
    @Column(name="dtofam9pro")
    private String dtofam9pro;

    @Getter
    @Setter
    @Column(name="fam10pro")
    private String fam10pro;

    @Getter
    @Setter
    @Column(name="dtofam10pro")
    private String dtofam10pro;

    @Getter
    @Setter
    @Column(name="fam11pro")
    private String fam11pro;

    @Getter
    @Setter
    @Column(name="dtofam11pro")
    private String dtofam11pro;

    @Getter
    @Setter
    @Column(name="fam12pro")
    private String fam12pro;

    @Getter
    @Setter
    @Column(name="dtofam12pro")
    private String dtofam12pro;

    @Getter
    @Setter
    @Column(name="fam13pro")
    private String fam13pro;

    @Getter
    @Setter
    @Column(name="dtofam13pro")
    private String dtofam13pro;

    @Getter
    @Setter
    @Column(name="fam14pro")
    private String fam14pro;

    @Getter
    @Setter
    @Column(name="dtofam14pro")
    private String dtofam14pro;

    @Getter
    @Setter
    @Column(name="fam15pro")
    private String fam15pro;

    @Getter
    @Setter
    @Column(name="dtofam15pro")
    private String dtofam15pro;

    @Getter
    @Setter
    @Column(name="fam16pro")
    private String fam16pro;

    @Getter
    @Setter
    @Column(name="dtofam16pro")
    private String dtofam16pro;

    @Getter
    @Setter
    @Column(name="fam17pro")
    private String fam17pro;

    @Getter
    @Setter
    @Column(name="dtofam17pro")
    private String dtofam17pro;

    @Getter
    @Setter
    @Column(name="fam18pro")
    private String fam18pro;

    @Getter
    @Setter
    @Column(name="dtofam18pro")
    private String dtofam18pro;

    @Getter
    @Setter
    @Column(name="fam19pro")
    private String fam19pro;

    @Getter
    @Setter
    @Column(name="dtofam19pro")
    private String dtofam19pro;

    @Getter
    @Setter
    @Column(name="fam20pro")
    private String fam20pro;

    @Getter
    @Setter
    @Column(name="dtofam20pro")
    private String dtofam20pro;

    @Getter
    @Setter
    @Column(name="memo1pro")
    private String memo1pro;

    @Getter
    @Setter
    @Column(name="memo2pro")
    private String memo2pro;

    @Getter
    @Setter
    @Column(name="memo3pro")
    private String memo3pro;

    @Getter
    @Setter
    @Column(name="memo4pro")
    private String memo4pro;

    @Getter
    @Setter
    @Column(name="blkregpro")
    private Integer blkregpro;

    @Getter
    @Setter
    @Column(name="acum1pro")
    private String acum1pro;

    @Getter
    @Setter
    @Column(name="acum2pro")
    private String acum2pro;

    @Getter
    @Setter
    @Column(name="acum3pro")
    private String acum3pro;

    @Getter
    @Setter
    @Column(name="apliofertapro")
    private String apliofertapro;

    @Getter
    @Setter
    @Column(name="reccpro")
    private String reccpro;
}
