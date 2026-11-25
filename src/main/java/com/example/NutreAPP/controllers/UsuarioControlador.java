package com.example.NutreAPP.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.NutreAPP.models.Usuario;
import com.example.NutreAPP.services.UsuarioServicio;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio servicio;

    @PostMapping
    public ResponseEntity<Usuario> guardar(@RequestBody Usuario datos) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.servicio.guardarUsuario(datos));
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarTodos() {
        return ResponseEntity.status(HttpStatus.OK).body(this.servicio.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.servicio.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> modificar(@PathVariable UUID id, @RequestBody Usuario datos) {
        return ResponseEntity.status(HttpStatus.OK).body(this.servicio.modificarUsuario(id, datos));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> eliminar(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.servicio.eliminarUsuario(id));
    }

}
