package com.example.NutreAPP.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.NutreAPP.models.Visualizacion;
import com.example.NutreAPP.repositories.IVisualizacionRepositorio;

@Service
public class VisualizacionServicio {

    @Autowired
    private IVisualizacionRepositorio repositorio;

    //Metodo para guardar
    public Visualizacion guardar(Visualizacion datos) {
        return this.repositorio.save(datos);
    }

    //Metodo para buscar por id
    public Visualizacion buscarPorId(UUID id) {
        Optional<Visualizacion> visualizacionBuscado = this.repositorio.findById(id);
        if (!visualizacionBuscado.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            return visualizacionBuscado.get();
        }
    }

    //Metodo para buscar todos
    public List<Visualizacion> buscarTodos() {
        return this.repositorio.findAll();
    }

    //Metodo para modificar
    //Metodo para eliminar
    //Metodo para buscar por fecha de visualizacion
    //Metodo para buscar por completado true
    //Metodo para buscar por completado false
}
