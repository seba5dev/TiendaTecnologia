package com.edu.unbosque.ciclo3back.services;

import java.util.Optional;

import com.edu.unbosque.ciclo3back.model.Ventas;

public interface VentasService {
    public Iterable<Ventas> findAll();
    public Optional<Ventas> findById(Long id);
    public Ventas save(Ventas cliente);
    public void delete(Long id);
}
