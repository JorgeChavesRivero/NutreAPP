package com.example.NutreAPP.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NutreAPP.models.Visualizacion;
import com.example.NutreAPP.repositories.IVisualizacionRepositorio;

@Service
public class VisualizacionServicio {

    @Autowired 
    private IVisualizacionRepositorio repositorio;

    //Metodo para guardar
    public Visualizacion guardar(Visualizacion datos){
        return this.repositorio.save(datos);
    }

    //Metodo para buscar por id

    //Metodo para buscar todos

    //Metodo para modificar

    //Metodo para eliminar

    //Metodo para buscar por fecha de visualizacion
    
    //Metodo para buscar por completado true
    
    //Metodo para buscar por completado false

}
