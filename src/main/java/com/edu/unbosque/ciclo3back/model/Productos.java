package com.edu.unbosque.ciclo3back.model;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productos {
    
    @Id
    @Column(name = "codigo_producto")
    private long cod_prod;

    @Column(name = "iva_compra", nullable = false)
    private double iva_compra;

    @Column(name = "nit_proveedor", nullable = false, unique = true)
    private BigInteger nit_proveedor;

    @Column(name = "nombre_producto", nullable = false, length = 255)
    private String nombre_producto;

    @Column(name = "precio_compra", nullable = false)
    private double precio_compra;

    @Column(name = "precio_venta", nullable = false)
    private double precio_venta;
}