package com.example.NutreAPP.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NutreAPP.models.Usuario;
import com.example.NutreAPP.repositories.IUsuarioRepositorio;

@Service
public class UsuarioServicio {

    @Autowired
    private IUsuarioRepositorio repositorio;

    //Metodo para guardar
    public Usuario guardar(Usuario datos){
        return this.repositorio.save(datos);
    }

    //Metodo para buscar por id

    //Metodo para buscar todos

    //Metodo para modificar

    //Metodo para eliminar

    //Metodo para buscar por departamento y rol

    //Metodo para buscar por correo

    //Metodo para buscar por rol

    //Metodo para verificar Correo

}
