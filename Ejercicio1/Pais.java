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
public class Pais {
    private String codigo;
    private String nombrePais;
    private String nombreContinente;
    private double areaPoblacion;
    private int capital;
    private int nroPoblacion;
    private List<Ciudad> ciudades;

    public Pais(String codigo, String nombrePais, String nombreContinente, double areaPoblacion, int capital, int nroPoblacion, List<Ciudad> ciudades) {
        this.codigo = codigo;
        this.nombrePais = nombrePais;
        this.nombreContinente = nombreContinente;
        this.areaPoblacion = areaPoblacion;
        this.capital = capital;
        this.nroPoblacion = nroPoblacion;
        this.ciudades = ciudades;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public String getNombreContinente() {
        return nombreContinente;
    }

    public double getAreaPoblacion() {
        return areaPoblacion;
    }

    public int getCapital() {
        return capital;
    }

    public int getNroPoblacion() {
        return nroPoblacion;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public void setNombreContinente(String nombreContinente) {
        this.nombreContinente = nombreContinente;
    }

    public void setAreaPoblacion(double areaPoblacion) {
        this.areaPoblacion = areaPoblacion;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public void setNroPoblacion(int nroPoblacion) {
        this.nroPoblacion = nroPoblacion;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
