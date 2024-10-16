/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.List;

/**
 *
 * @author Lileth
 */

public class Director {
    private int idDirector;
    private String nombreDirector;
    private List<String> premios;

    public Director(int idDirector, String nombreDirector, List<String> premios) {
        this.idDirector = idDirector;
        this.nombreDirector = nombreDirector;
        this.premios = premios;
    }

    public int getIdDirector() {
        return idDirector;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public List<String> getPremios() {
        return premios;
    }

    public void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public void setPremios(List<String> premios) {
        this.premios = premios;
    }
}


