package com.edu.unbosque.ciclo3back.services;

import java.util.Optional;

import com.edu.unbosque.ciclo3back.dao.VentasDAO;
import com.edu.unbosque.ciclo3back.model.Ventas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentasServiceImpl implements VentasService {
    @Autowired
    private VentasDAO ventasDAO;

    @Override
    public Iterable<Ventas> findAll() {
        return ventasDAO.findAll();
    }

    @Override
    public Optional<Ventas> findById(Long id) {
        return ventasDAO.findById(id);
    }

    @Override
    public Ventas save(Ventas venta) {
        return ventasDAO.save(venta);
    }

    @Override
    public void delete(Long id) {
        ventasDAO.deleteById(id);
    }
    
}
