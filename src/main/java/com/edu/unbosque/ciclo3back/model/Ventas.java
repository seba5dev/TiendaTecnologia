package com.edu.unbosque.ciclo3back.model;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Ventas {
	@Id
	@Column(name = "codigo_ventas")
	private long cod_ven;
	@OneToOne
	@JoinColumn(name = "cedula_cliente",nullable = false)
	private Clientes cedula_cliente;
	@OneToOne
	@JoinColumn(name = "cedula_usuario",nullable = false)
	private Usuarios cedula_usuario;
	
	@Column(name = "iva_venta",nullable = false)
	private double iva_ven;
	
	@Column(name = "total_venta",nullable = false)
	private double tot_ven;
	
	@Column(name = "valor_venta",nullable = false)
	private double val_ven;
}
