package com.example.NutreAPP.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.NutreAPP.models.Usuario;
import com.example.NutreAPP.repositories.IUsuarioRepositorio;

@Service
public class UsuarioServicio {

    @Autowired
    private IUsuarioRepositorio repositorio;

    //Metodo para guardar
    public Usuario guardar(Usuario datos) {
        return this.repositorio.save(datos);
    }

    //Metodo para buscar por id
    public Usuario buscarPorId(UUID id) {
        Optional<Usuario> usuarioBuscado = this.repositorio.findById(id);
        if (!usuarioBuscado.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            return usuarioBuscado.get();
        }
    }

    //Metodo para buscar todos
    public List<Usuario> buscarTodos() {
        return this.repositorio.findAll();
    }

    //Metodo para modificar
    //Metodo para eliminar
    //Metodo para buscar por departamento y rol
    //Metodo para buscar por correo
    //Metodo para buscar por rol
    //Metodo para verificar Correo
}
