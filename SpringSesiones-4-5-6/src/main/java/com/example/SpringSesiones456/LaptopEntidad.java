package com.example.SpringSesiones456;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class LaptopEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String color;
    private Double precio;
    private Boolean online;

    public LaptopEntidad() {
    }

    public LaptopEntidad(Long id, String marca, String color, Double precio, Boolean online) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.online = online;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

}
