package com.edu.unbosque.ciclo3back.model;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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


    public long getCod_prod() {
        return this.cod_prod;
    }

    public void setCod_prod(long cod_prod) {
        this.cod_prod = cod_prod;
    }

    public double getIva_compra() {
        return this.iva_compra;
    }

    public void setIva_compra(double iva_compra) {
        this.iva_compra = iva_compra;
    }

    public BigInteger getNit_proveedor() {
        return this.nit_proveedor;
    }

    public void setNit_proveedor(BigInteger nit_proveedor) {
        this.nit_proveedor = nit_proveedor;
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

    public Proveedores getProveedor() {
        return this.proveedor;
    }

    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }

    public DetalleVentas getCodigoProducto() {
        return this.codigoProducto;
    }

    public void setCodigoProducto(DetalleVentas codigoProducto) {
        this.codigoProducto = codigoProducto;
    }    

    @OneToOne
    @JoinColumn(name = "nit_proveedor")
    private Proveedores proveedor;

    @OneToOne
    @JoinColumn(name = "codigo_producto")
    private DetalleVentas codigoProducto;

}