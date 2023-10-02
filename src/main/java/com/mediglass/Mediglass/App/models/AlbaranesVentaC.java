package com.mediglass.Mediglass.App.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="falbavtac")
public class AlbaranesVentaC implements Serializable {

    public AlbaranesVentaC(){

    }

    @Id
    @Getter
    @Setter
    @Column(name="id")
    private Integer id;

    @Getter @Setter
    @Column(name="estadodoc")
    private String estadodoc;

    @Getter @Setter
    @Column(name="fecreadoc")
    private String fecreadoc;

    @Getter @Setter
    @Column(name="usuariocrea")
    private String usuariocrea;

    @Getter @Setter
    @Column(name="femodidoc")
    private String femodidoc;

    @Getter @Setter
    @Column(name="usuariomodi")
    private String usuariomodi;

    @Getter @Setter
    @Column(name="documentodoc")
    private String documentodoc;

    @Getter @Setter
    @Column(name="situaciondoc")
    private String situaciondoc;

    @Getter @Setter
    @Column(name="tipopresudoc")
    private String tipopresudoc;

    @Getter @Setter
    @Column(name="npresudoc")
    private Integer npresudoc;

    @Getter @Setter
    @Column(name="fepresudoc")
    private String fepresudoc;

    @Getter @Setter
    @Column(name="tipopedidoc")
    private String tipopedidoc;

    @Getter @Setter
    @Column(name="npedidoc")
    private Integer npediddoc;

    @Getter @Setter
    @Column(name="fepedidoc")
    private String fepedidoc;

    @Getter @Setter
    @Column(name="feentregadoc")
    private String feentregadoc;

    @Getter @Setter
    @Column(name="tipoalbadoc")
    private String tipoalbadoc;

    @Getter @Setter
    @Column(name="nalbadoc")
    private Integer nalbadoc;

    @Getter @Setter
    @Column(name="fealbadoc")
    private String fealbadoc;

    @Getter @Setter
    @Column(name="tipofradoc")
    private String tipofradoc;

    @Getter @Setter
    @Column(name="nfradoc")
    private Integer nfradoc;

    @Getter @Setter
    @Column(name="fefradoc")
    private String fefradoc;

    @Getter @Setter
    @Column(name="ncliprovdoc")
    private Integer ncliprovdoc;

    @Getter @Setter
    @Column(name="tomadordoc")
    private String tomadordoc;

    @Getter @Setter
    @Column(name="pedidopordoc")
    private String pedidopordoc;

    @Getter @Setter
    @Column(name="referenciadoc")
    private String referenciadoc;

    @Getter @Setter
    @Column(name="nombredoc")
    private String nombredoc;

    @Getter @Setter
    @Column(name="rsocialdoc")
    private String rsocialdoc;

    @Getter @Setter
    @Column(name="cifdoc")
    private String cifdoc;

    @Getter @Setter
    @Column(name="direcciondoc")
    private String direcciondoc;

    @Getter @Setter
    @Column(name="poblaciondoc")
    private String poblaciondoc;

    @Getter @Setter
    @Column(name="dpostaldoc")
    private String dpostaldoc;

    @Getter @Setter
    @Column(name="provinciadoc")
    private String provinciadoc;

    @Getter @Setter
    @Column(name="direnviodoc")
    private String direnviodoc;

    @Getter @Setter
    @Column(name="pobenviodoc")
    private String pobenviodoc;

    @Getter @Setter
    @Column(name="dpenviodoc")
    private String dpenviodoc;

    @Getter @Setter
    @Column(name="provenviodoc")
    private String provenviodoc;

    @Getter @Setter
    @Column(name="tlfnodoc")
    private String tlfnodoc;

    @Getter @Setter
    @Column(name="faxdoc")
    private String faxdoc;

    @Getter @Setter
    @Column(name="movil1doc")
    private String movil1doc;

    @Getter @Setter
    @Column(name="movil2doc")
    private String movil2doc;

    @Getter @Setter
    @Column(name="nbultosdoc")
    private String nbultosdoc;

    @Getter @Setter
    @Column(name="nexpedicdoc")
    private String nexpedicdoc;

    @Getter @Setter
    @Column(name="pesodoc")
    private String pesodoc;

    @Getter @Setter
    @Column(name="impresadoc")
    private String impresadoc;

    @Getter @Setter
    @Column(name="emaildoc")
    private String emaildoc;

    @Getter @Setter
    @Column(name="zonadoc")
    private String zonadoc;

    @Getter @Setter
    @Column(name="tipocliprodoc")
    private String tipocliprodoc;

    @Getter @Setter
    @Column(name="vendedordoc")
    private Integer vendedordoc;

    @Getter @Setter
    @Column(name="movilvdordoc")
    private String movilvdordoc;

    @Getter @Setter
    @Column(name="canaldoc")
    private String canaldoc;

    @Getter @Setter
    @Column(name="nagenciadoc")
    private Integer nagenciadoc;

    @Getter @Setter
    @Column(name="agenciadoc")
    private String agenciadoc;

    @Getter @Setter
    @Column(name="modoportedoc")
    private String modoportedoc;

    @Getter @Setter
    @Column(name="rutadoc")
    private Integer rutadoc;

    @Getter @Setter
    @Column(name="nombrerutadoc")
    private String nombrerutadoc;

    @Getter @Setter
    @Column(name="nfpagodoc")
    private Integer nfpagodoc;

    @Getter @Setter
    @Column(name="formapagodoc")
    private String formapagodoc;

    @Getter @Setter
    @Column(name="diapago1doc")
    private Integer diapago1doc;

    @Getter @Setter
    @Column(name="diapago2doc")
    private Integer diapago2doc;

    @Getter @Setter
    @Column(name="diapago3doc")
    private String diapago3doc;

    @Getter @Setter
    @Column(name="bancodoc")
    private String bancodoc;

    @Getter @Setter
    @Column(name="dirbancodoc")
    private String dirbancodoc;

    @Getter @Setter
    @Column(name="pobbancodoc")
    private String pobbancodoc;

    @Getter @Setter
    @Column(name="cccdoc")
    private String cccdoc;

    @Getter @Setter
    @Column(name="nobradoc")
    private Integer nobradoc;

    @Getter @Setter
    @Column(name="nombreobradoc")
    private String nombreobradoc;

    @Getter @Setter
    @Column(name="define1obradoc")
    private String define1obradoc;

    @Getter @Setter
    @Column(name="tlfnoobradoc")
    private String tlfnoobradoc;

    @Getter @Setter
    @Column(name="faxobradoc")
    private String faxobradoc;

    @Getter @Setter
    @Column(name="movilobradoc")
    private String movilobradoc;

    @Getter @Setter
    @Column(name="emailobradoc")
    private String emailobradoc;

    @Getter @Setter
    @Column(name="definecp1doc")
    private String definecp1doc;

    @Getter @Setter
    @Column(name="definecp2doc")
    private String definecp2doc;

    @Getter @Setter
    @Column(name="fechaemaildoc")
    private String fechaemaildoc;

    @Getter @Setter
    @Column(name="liquidadadoc")
    private String liquidadadoc;

    @Getter @Setter
    @Column(name="feliquidadadoc")
    private String feliquidadadoc;

    @Getter @Setter
    @Column(name="pvpaplidoc")
    private Integer pvpaplidoc;

    @Getter @Setter
    @Column(name="totbrutodoc")
    private String totbrutodoc;

    @Getter @Setter
    @Column(name="dtodoc")
    private String dtodoc;

    @Getter @Setter
    @Column(name="impdtodoc")
    private String impdtodoc;

    @Getter @Setter
    @Column(name="ppdoc")
    private String ppdoc;

    @Getter @Setter
    @Column(name="imppdoc")
    private String imppdoc;

    @Getter @Setter
    @Column(name="portesdoc")
    private String portesdoc;

    @Getter @Setter
    @Column(name="ecotasadoc")
    private String ecotasadoc;

    @Getter @Setter
    @Column(name="base1doc")
    private String base1doc;

    @Getter @Setter
    @Column(name="iva1doc")
    private String iva1doc;

    @Getter @Setter
    @Column(name="impiva1doc")
    private String impiva1doc;

    @Getter @Setter
    @Column(name="recargo1doc")
    private String recargo1doc;

    @Getter @Setter
    @Column(name="imprecar1doc")
    private String imprecar1doc;

    @Getter @Setter
    @Column(name="base2doc")
    private String base2doc;

    @Getter @Setter
    @Column(name="iva2doc")
    private String iva2doc;

    @Getter @Setter
    @Column(name="impiva2doc")
    private String impiva2doc;

    @Getter @Setter
    @Column(name="recargo2doc")
    private String recargo2doc;

    @Getter @Setter
    @Column(name="imprecar2doc")
    private String imprecar2doc;

    @Getter @Setter
    @Column(name="base3doc")
    private String base3doc;

    @Getter @Setter
    @Column(name="iva3doc")
    private String iva3doc;

    @Getter @Setter
    @Column(name="impiva3doc")
    private String impiva3doc;

    @Getter @Setter
    @Column(name="recargo3doc")
    private String recargo3doc;

    @Getter @Setter
    @Column(name="imprecar3doc")
    private String imprecar3doc;

    @Getter @Setter
    @Column(name="base4doc")
    private String base4doc;

    @Getter @Setter
    @Column(name="iva4doc")
    private String iva4doc;

    @Getter @Setter
    @Column(name="impiva4doc")
    private String impiva4doc;

    @Getter @Setter
    @Column(name="recargo4doc")
    private String recargo4doc;

    @Getter @Setter
    @Column(name="imprecar4doc")
    private String imprecar4doc;

    @Getter @Setter
    @Column(name="base5doc")
    private String base5doc;

    @Getter @Setter
    @Column(name="iva5doc")
    private String iva5doc;

    @Getter @Setter
    @Column(name="impiva5doc")
    private String impiva5doc;

    @Getter @Setter
    @Column(name="recargo5doc")
    private String recargo5doc;

    @Getter @Setter
    @Column(name="imprecar5doc")
    private String imprecar5doc;

    @Getter @Setter
    @Column(name="totaldoc")
    private String totaldoc;

    @Getter @Setter
    @Column(name="apliretendoc")
    private String apliretendoc;

    @Getter @Setter
    @Column(name="retendoc")
    private String retendoc;

    @Getter @Setter
    @Column(name="impretendoc")
    private String impretendoc;

    @Getter @Setter
    @Column(name="porcomisdoc")
    private String porcomisdoc;

    @Getter @Setter
    @Column(name="impcomisdoc")
    private String impcomisdoc;

    @Getter @Setter
    @Column(name="margendoc")
    private String margendoc;

    @Getter @Setter
    @Column(name="define1vtadoc")
    private String define1vtadoc;

    @Getter @Setter
    @Column(name="define2vtadoc")
    private String define2vtadoc;

    @Getter @Setter
    @Column(name="define3vtadoc")
    private String define3vtadoc;

    @Getter @Setter
    @Column(name="define4vtadoc")
    private String define4vtadoc;

    @Getter @Setter
    @Column(name="memo1doc")
    private String memo1doc;

    @Getter @Setter
    @Column(name="memo2doc")
    private String memo2doc;

    @Getter @Setter
    @Column(name="memo3doc")
    private String memo3doc;

    @Getter @Setter
    @Column(name="memo4doc")
    private String memo4doc;

    @Getter @Setter
    @Column(name="encontadoc")
    private String encontadoc;

    @Getter @Setter
    @Column(name="encarteradoc")
    private String encarteradoc;

    @Getter @Setter
    @Column(name="clavedocasocdoc")
    private String clavedocasocdoc;

    @Getter @Setter
    @Column(name="nombreimagendoc")
    private String nombreimagendoc;

    @Getter @Setter
    @Column(name="reccdoc")
    private String reccdoc;
}
