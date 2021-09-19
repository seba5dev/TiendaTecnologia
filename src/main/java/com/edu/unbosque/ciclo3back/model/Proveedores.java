package com.edu.unbosque.ciclo3back.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedores {
    
    @Id
    @Column(name = "nitproveedor")
    private long nitproveedor;

    @Column(name = "ciudad_proveedor", nullable = false)
    private String ciudad_proveedor;

    @Column(name = "direccion_proveedor", nullable = false)
    private String direccion_proveedor;

    @Column(name = "nombre_proveedor", nullable = false, length = 255)
    private String nombre_proveedor;

    @Column(name = "telefono_proveedor", nullable = false)
    private double telefono_proveedor;

}