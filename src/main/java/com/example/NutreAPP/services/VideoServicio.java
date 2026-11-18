package com.example.NutreAPP.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.NutreAPP.models.Video;
import com.example.NutreAPP.repositories.IVideoRepositorio;

@Service
public class VideoServicio {

    @Autowired
    private IVideoRepositorio repositorio;

    //Metodo para guardar
    public Video guardar(Video datos) {
        return this.repositorio.save(datos);
    }

    //Metodo para buscar por id
    public Video buscarPorId(UUID id) {
        Optional<Video> videoBuscado = this.repositorio.findById(id);
        if (!videoBuscado.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            return videoBuscado.get();
        }
    }

    //Metodo para buscar todos
    public List<Video> buscarTodos() {
        return this.repositorio.findAll();
    }

    //Metodo para modificar
    public Video modifcar(UUID id, Video datos) {
        Optional<Video> videoBuscado = this.repositorio.findById(id);
        if (!videoBuscado.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            //1. Precargar la info que existe actualmente en la base de datos
            Video videoEncontrado = videoBuscado.get();

            //2. Espacio para modificar solo las propiedades permitidas
            videoEncontrado.setTitulo(datos.getTitulo());

            //3. Espacio para volver a guardar el usuario que se acaba de modificar
            return this.repositorio.save(videoEncontrado);
        }
    }

    //Metodo para eliminar
    //Metodo para buscar por categoria
    //Metodo para buscar por titulo
    //Metodo para buscar por descripcion
    //Metodo para buscar por url
    //Metodo para buscar por titulo y categoria
}
