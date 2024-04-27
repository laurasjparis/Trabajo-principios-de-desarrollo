/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calendapp;

/**
 *
 * @author user
 */
public class Usuario {
    private String Nombre;
    private String Contrasena;

    public Usuario(String Nombre, String Contrasena) {
        this.Nombre = Nombre;
        this.Contrasena = Contrasena;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
}
