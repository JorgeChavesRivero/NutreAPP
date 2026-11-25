package com.example.NutreAPP.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NutreAPP.models.Usuario;
import com.example.NutreAPP.models.helpers.Rol;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, UUID> {

    List<Usuario> findByDepartamentoAndRol(String departamento, String rol);

    Optional<Usuario> findByCorreo(String correo);

    List<Usuario> findByRolOrderByNombreAsc(Rol rol);

    Boolean existsByCorreo(String correo);

}
