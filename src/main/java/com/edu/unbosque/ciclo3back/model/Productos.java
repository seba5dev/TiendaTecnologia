package com.edu.unbosque.ciclo3back.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Productos {
    
    @Id
    @OneToOne
    @JoinColumn(name = "codigo_producto")
    private DetalleVentas codigoProducto;

    @Column(name = "iva_compra", nullable = false)
    private double iva_compra;

    @OneToOne
    @JoinColumn(name = "nit_proveedor", nullable = false, unique = true)
    private Proveedores proveedor;

    @Column(name = "nombre_producto", nullable = false, length = 255)
    private String nombre_producto;

    @Column(name = "precio_compra", nullable = false)
    private double precio_compra;

    @Column(name = "precio_venta", nullable = false)
    private double precio_venta;


    public DetalleVentas getCodigoProducto() {
        return this.codigoProducto;
    }

    public void setCodigoProducto(DetalleVentas codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getIva_compra() {
        return this.iva_compra;
    }

    public void setIva_compra(double iva_compra) {
        this.iva_compra = iva_compra;
    }

    public Proveedores getProveedor() {
        return this.proveedor;
    }

    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre_producto() {
        return this.nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio_compra() {
        return this.precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return this.precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }
}