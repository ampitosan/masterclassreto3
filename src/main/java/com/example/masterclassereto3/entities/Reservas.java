package com.example.masterclassereto3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reservas")
public class Reservas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;
    private String palco;
    private String cliente;
    private Date fechainicio;
    private Date fechafin;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("reservas")
    private Category category;

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer id) {
        this.idReserva = id;
    }

    public String getPalco() {
        return palco;
    }

    public void setPalco(String palco) {
        this.palco = palco;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
