package com.edu.unbosque.ciclo3back.dao;

import com.edu.unbosque.ciclo3back.model.Ventas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentasDAO extends JpaRepository<Ventas, Long> {

}
