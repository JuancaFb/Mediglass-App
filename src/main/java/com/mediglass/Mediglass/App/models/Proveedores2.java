package com.mediglass.Mediglass.App.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="fproveedores2")
public class Proveedores2 implements Serializable {

    public Proveedores2(){

    }

    @Id
    @Getter @Setter
    @Column(name="id")
    private Integer id;

    @Getter @Setter @Column(name="nombre")
    private String nombre;

}
