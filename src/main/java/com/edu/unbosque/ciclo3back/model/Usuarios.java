package com.edu.unbosque.ciclo3back.model;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios {
	@Id
	@Column(name = "cedula_cliente",unique = true)
	private long ced_cli;
	
	@Column(name = "direccion_cliente",nullable = false)
	private String dir_cli;
	
	@Column(name = "email_cliente",nullable = false, unique = true)
	private String ema_cli;
	
	@Column(name = "nombre_cliente",nullable = false)
	private String nom_cli;
	
	@Column(name = "telefono_cliente",nullable = false, unique = true)
	private double tel_cli;
	
}
