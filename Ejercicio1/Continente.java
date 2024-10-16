/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author Lileth
 */

public class Continente {
    private String nombreContinente;
    private List<Pais> paises;

    public Continente(String nombreContinente, List<Pais> paises) {
        this.nombreContinente = nombreContinente;
        this.paises = paises;
    }

    public String getNombreContinente() {
        return nombreContinente;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setNombreContinente(String nombreContinente) {
        this.nombreContinente = nombreContinente;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }


    public List<Ciudad> getCiudadesMasPobladas() {
        return paises.stream()
            .flatMap(pais -> pais.getCiudades().stream())
            .collect(Collectors.toList());
    }
}

