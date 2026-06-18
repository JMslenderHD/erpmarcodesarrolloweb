package com.example.erp.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private String nombre;
    private String contrasena;
    private Rol rol;
    private List<String> vistas;

}
