package com.edu.unbosque.ciclo3back.model;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ventas {
	@Id
	@Column(name = "codigo_ventas")
	private long cod_ven;
	
	@Column(name = "cedula_cliente",nullable = false, unique = true)
	private long ced_cli;
	
	@Column(name = "cedula_usuario",nullable = false, unique = true)
	private long ced_usu;
	
	@Column(name = "iva_venta",nullable = false)
	private double iva_ven;
	
	@Column(name = "total_venta",nullable = false)
	private double tot_ven;
	
	@Column(name = "valor_venta",nullable = false)
	private double val_ven;
}
