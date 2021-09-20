package com.edu.unbosque.ciclo3back.model;

import javax.persistence.*;

public class DetalleVentas {
	 @Id
	    @Column(name = "codigo_detalle_venta")
	    private long detalle_venta;

	    @Column(name = "cantidad_producto", nullable = false)
	    private int cantidad_producto;

	    @ManyToOne
	    @JoinColumn(name = "codigo_producto", nullable = false)
	    private Productos codigo_producto;

	    @ManyToOne
	    @JoinColumn(name = "codigo_venta", nullable = false)
	    private Productos codigo_venta;

	    @Column(name = "valor_total", nullable = false)
	    private double valor_total;

	    @Column(name = "valor_venta", nullable = false)
	    private double valor_venta;

	    @Column(name = "valoriva", nullable = false)
	    private double valoriva;


	    public long getDetalle_venta() {
	        return this.detalle_venta;
	    }

	    public void setDetalle_venta(long detalle_venta) {
	        this.detalle_venta = detalle_venta;
	    }

	    public int getCantidad_producto() {
	        return this.cantidad_producto;
	    }

	    public void setCantidad_producto(int cantidad_producto) {
	        this.cantidad_producto = cantidad_producto;
	    }

	    public Productos getCodigo_producto() {
	        return this.codigo_producto;
	    }

	    public void setCodigo_producto(Productos codigo_producto) {
	        this.codigo_producto = codigo_producto;
	    }

	    public Productos getCodigo_venta() {
	        return this.codigo_venta;
	    }

	    public void setCodigo_venta(Productos codigo_venta) {
	        this.codigo_venta = codigo_venta;
	    }

	    public double getValor_total() {
	        return this.valor_total;
	    }

	    public void setValor_total(double valor_total) {
	        this.valor_total = valor_total;
	    }

	    public double getValor_venta() {
	        return this.valor_venta;
	    }

	    public void setValor_venta(double valor_venta) {
	        this.valor_venta = valor_venta;
	    }

	    public double getValoriva() {
	        return this.valoriva;
	    }

	    public void setValor_iva(double valor_iva) {
	        this.valoriva = valor_iva;
	    }
}
