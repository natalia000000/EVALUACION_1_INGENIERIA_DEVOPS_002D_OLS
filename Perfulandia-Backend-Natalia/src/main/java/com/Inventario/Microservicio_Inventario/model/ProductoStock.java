package com.Inventario.Microservicio_Inventario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class ProductoStock {

    @Id
    private Long id;
    private int stock;
    private String nombre;


    public ProductoStock() {}

    public ProductoStock(Long id,String nombre, int stock){
        this.id = id;
        this.nombre=nombre;
        this.stock=stock;
    }

    //Getter y setter
    public Long getId(){return id; }
    public void  setId (Long id) {this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

}
