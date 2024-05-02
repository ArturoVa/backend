package com.microservicios.celulares.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Id;


@Entity
@Table(name = "Celulares")
public class Celular implements Serializable{
    private static final long serialVersionID = Long.MAX_VALUE; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String name;
    private String marca;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date CreateAt;
    @Transient
    private Integer port; 
   

    public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCreateAt(Date createAt) {
        CreateAt = createAt;
    }

    public Date getCreateAt() {
        return CreateAt;
    }


} 
