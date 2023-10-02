package com.mediglass.Mediglass.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="fclientes")
public class Clientes implements Serializable {

    public Clientes() {

    }

    @Id
    @Getter
    @Setter
    @Column(name="id")
    private Integer id;

    @Getter @Setter @Column(name="estadocli")
    private String estadocli;

    @Getter @Setter @Column(name="fecreacli")
    private String fecreacli;

    @Getter @Setter @Column(name="usuariocrea")
    private String usuariocrea;

    @Getter @Setter @Column(name="femodicli")
    private String femodicli;

    @Getter @Setter @Column(name="usuariomodi")
    private String usuariomodi;

    @Getter @Setter @Column(name="nclientecli")
    private Integer nclientecli;

    @Getter @Setter @Column(name="nombrecli")
    private String nombrecli;

    @Getter @Setter @Column(name="rsocialcli")
    private String rsocialcli;

    @Getter @Setter @Column(name="direccioncli")
    private String direccioncli;

    @Getter @Setter @Column(name="poblacioncli")
    private String poblacioncli;
    @Getter @Setter @Column(name="provinciacli")
    private String provinciacli;

    @Getter @Setter @Column(name="dpostalcli")
    private String dpostalcli;

    @Getter @Setter @Column(name="direnviocli")
    private String direnviocli;

    @Getter @Setter @Column(name="pobenviocli")
    private String pobenviocli;

    @Getter @Setter @Column(name="provenviocli")
    private String provenviocli;

    @Getter @Setter @Column(name="dpenviocli")
    private String dpenviocli;

    @Getter @Setter @Column(name="paiscli")
    private String paiscli;

    @Getter @Setter @Column(name="cifcli")
    private String cifcli;

    @Getter @Setter @Column(name="tlfnocli")
    private String tlfnocli;

    @Getter @Setter @Column(name="faxcli")
    private String faxcli;

    @Getter @Setter @Column(name="movil1cli")
    private String movil1cli;

    @Getter @Setter @Column(name="movil2cli")
    private String movil2cli;

    @Getter @Setter @Column(name="emailcli")
    private String emailcli;

    @Getter @Setter @Column(name="webcli")
    private String webcli;

    @Getter @Setter @Column(name="contactocli")
    private String contactocli;

    @Getter @Setter @Column(name="zonacli")
    private String zonacli;

    @Getter @Setter @Column(name="tipocli")
    private String tipocli;

    @Getter @Setter @Column(name="vendedorcli")
    private Integer vendedorcli;

    @Getter @Setter @Column(name="exentoivacli")
    private String exentoivacli;

    @Getter @Setter @Column(name="recargocli")
    private String recargocli;

    @Getter @Setter @Column(name="apliretencli")
    private String apliretencli;

    @Getter @Setter @Column(name="retencli")
    private String retencli;

    @Getter @Setter @Column(name="subctacli")
    private Integer subctacli;

    @Getter @Setter @Column(name="dtopiecli")
    private String dtopiecli;

    @Getter @Setter @Column(name="dtoppcli")
    private String dtoppcli;

    @Getter @Setter @Column(name="formapagocli")
    private Integer formapagocli;

    @Getter @Setter @Column(name="diapago1cli")
    private Integer diapago1cli;

    @Getter @Setter @Column(name="diapago2cli")
    private Integer diapago2cli;

    @Getter @Setter @Column(name="diapago3cli")
    private Integer diapago3cli;

    @Getter @Setter @Column(name="clavefracli")
    private String clavefracli;

    @Getter @Setter @Column(name="modfracli")
    private String modfracli;

    @Getter @Setter @Column(name="copiafracli")
    private Integer copiafracli;

    @Getter @Setter @Column(name="modalbacli")
    private String modalbacli;

    @Getter @Setter @Column(name="copialbacli")
    private Integer copialbacli;

    @Getter @Setter @Column(name="modpedicli")
    private String modpedicli;

    @Getter @Setter @Column(name="copiapedicli")
    private Integer copiapedicli;

    @Getter @Setter @Column(name="modpresucli")
    private String modpresucli;

    @Getter @Setter @Column(name="copiapresucli")
    private Integer copiapresucli;

    @Getter @Setter @Column(name="pvpaplicli")
    private Integer pvpaplicli;

    @Getter @Setter @Column(name="rutacli")
    private Integer rutacli;

    @Getter @Setter @Column(name="agenciacli")
    private Integer agenciacli;

    @Getter @Setter @Column(name="modoportecli")
    private String modoportecli;

    @Getter @Setter @Column(name="nobracli")
    private Integer nobracli;

    @Getter @Setter @Column(name="nombreobracli")
    private String nombreobracli;

    @Getter @Setter @Column(name="define1cli")
    private String define1cli;

    @Getter @Setter @Column(name="define2cli")
    private String define2cli;

    @Getter @Setter @Column(name="bancocli")
    private String bancocli;

    @Getter @Setter @Column(name="dirbancocli")
    private String dirbancocli;

    @Getter @Setter @Column(name="pobbancocli")
    private String pobbancocli;

    @Getter @Setter @Column(name="ccccli")
    private String ccccli;

    @Getter @Setter @Column(name="riesgocli")
    private String riesgocli;

    @Getter @Setter @Column(name="tfactu1cli")
    private String tfactu1cli;

    @Getter @Setter @Column(name="tfactu2cli")
    private String tfactu2cli;

    @Getter @Setter @Column(name="fultfracli")
    private String fultfracli;

    @Getter @Setter @Column(name="fam1cli")
    private String fam1cli;

    @Getter @Setter @Column(name="dtofam1cli")
    private String dtofam1cli;

    @Getter @Setter @Column(name="fam2cli")
    private String fam2cli;

    @Getter @Setter @Column(name="dtofam2cli")
    private String dtofam2cli;

    @Getter @Setter @Column(name="fam3cli")
    private String fam3cli;

    @Getter @Setter @Column(name="dtofam3cli")
    private String dtofam3cli;

    @Getter @Setter @Column(name="fam4cli")
    private String fam4cli;

    @Getter @Setter @Column(name="dtofam4cli")
    private String dtofam4cli;

    @Getter @Setter @Column(name="fam5cli")
    private String fam5cli;

    @Getter @Setter @Column(name="dtofam5cli")
    private String dtofam5cli;

    @Getter @Setter @Column(name="fam6cli")
    private String fam6cli;

    @Getter @Setter @Column(name="dtofam6cli")
    private String dtofam6cli;

    @Getter @Setter @Column(name="fam7cli")
    private String famcli;

    @Getter @Setter @Column(name="dtofam7cli")
    private String dtofam7cli;

    @Getter @Setter @Column(name="fam8cli")
    private String fam8cli;

    @Getter @Setter @Column(name="dtofam8cli")
    private String dtofam8cli;

    @Getter @Setter @Column(name="fam9cli")
    private String fam9cli;

    @Getter @Setter @Column(name="dtofam9cli")
    private String dtofam9cli;

    @Getter @Setter @Column(name="fam10cli")
    private String fam10cli;

    @Getter @Setter @Column(name="dtofam10cli")
    private String dtofam10cli;

    @Getter @Setter @Column(name="fam11cli")
    private String fam11cli;

    @Getter @Setter @Column(name="dtofam11cli")
    private String dtofam11cli;

    @Getter @Setter @Column(name="fam12cli")
    private String fam12cli;

    @Getter @Setter @Column(name="dtofam12cli")
    private String dtofam12cli;

    @Getter @Setter @Column(name="fam13cli")
    private String fam13cli;

    @Getter @Setter @Column(name="dtofam13cli")
    private String dtofam13cli;

    @Getter @Setter @Column(name="fam14cli")
    private String fam14cli;

    @Getter @Setter @Column(name="dtofam14cli")
    private String dtofam14cli;

    @Getter @Setter @Column(name="fam15cli")
    private String fam15cli;

    @Getter @Setter @Column(name="dtofam15cli")
    private String dtofam15cli;

    @Getter @Setter @Column(name="fam16cli")
    private String fam16cli;

    @Getter @Setter @Column(name="dtofam16cli")
    private String dtofam16cli;

    @Getter @Setter @Column(name="fam17cli")
    private String fam17cli;

    @Getter @Setter @Column(name="dtofam17cli")
    private String dtofam17cli;

    @Getter @Setter @Column(name="fam18cli")
    private String fam18cli;

    @Getter @Setter @Column(name="dtofam18cli")
    private String dtofam18cli;

    @Getter @Setter @Column(name="fam19cli")
    private String fam19cli;

    @Getter @Setter @Column(name="dtofam19cli")
    private String dtofam19cli;

    @Getter @Setter @Column(name="fam20cli")
    private String fam20cli;

    @Getter @Setter @Column(name="dtofam20cli")
    private String dtofam20cli;

    @Getter @Setter @Column(name="memo1cli")
    private String memo1cli;

    @Getter @Setter @Column(name="memo2cli")
    private String memo2cli;

    @Getter @Setter @Column(name="memo3cli")
    private String memo3cli;

    @Getter @Setter @Column(name="memo4cli")
    private String memo4cli;

    @Getter @Setter @Column(name="blkregcli")
    private Integer blkregcli;

    @Getter @Setter @Column(name="acum1cli")
    private String acum1cli;

    @Getter @Setter @Column(name="acum2cli")
    private String acum2cli;

    @Getter @Setter @Column(name="acum3cli")
    private String acum3cli;

    @Getter @Setter @Column(name="apliofertacli")
    private String apliofertacli;

    @Getter @Setter @Column(name="recccli")
    private String recccli;
}
