package com.example.NutreAPP.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NutreAPP.models.Video;
import com.example.NutreAPP.repositories.IVideoRepositorio;

@Service
public class VideoServicio {

    @Autowired
    private IVideoRepositorio repositorio;

    //Metodo para guardar
    public Video guardar(Video datos){
        return this.repositorio.save(datos);
    }

    //Metodo para buscar por id

    //Metodo para buscar todos

    //Metodo para modificar

    //Metodo para eliminar

    //Metodo para buscar por categoria
    
    //Metodo para buscar por titulo

    //Metodo para buscar por descripcion
    
    //Metodo para buscar por url
    
    //Metodo para buscar por titulo y categoria
    
}
