/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Lileth
 */


import Ejercicio1.Genero;
import Ejercicio1.Director;
import Ejercicio1.Pelicula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
  
        Genero drama = new Genero(1, "Drama");
        Genero comedia = new Genero(2, "Comedia");
        Genero romantica = new Genero(3, "Romantica");

        // Crear directores
        Director director1 = new Director(1, "Director Uno", Arrays.asList("Premio A", "Premio B"));
        Director director2 = new Director(2, "Director Dos", Arrays.asList("Premio C"));

        // Crear algunas películas
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula(1, "Robot salvaje", 2020, "7.5", Arrays.asList(drama), Arrays.asList(director1)));
        peliculas.add(new Pelicula(2, "Damas en guerra", 2021, "8.0", Arrays.asList(comedia), Arrays.asList(director1)));
        peliculas.add(new Pelicula(3, "Bads Boys", 2022, "6.5", Arrays.asList(drama, comedia), Arrays.asList(director2)));
        peliculas.add(new Pelicula(4, "Mil besos", 2023, "9.0", Arrays.asList(romantica), Arrays.asList(director2)));

        // Filtrar las películas que tienen solo "Drama" y "Comedia"
        List<Pelicula> peliculasDramaComedia = peliculas.stream()
            .filter(pelicula -> {
                List<String> nombresGeneros = pelicula.getGeneros().stream()
                    .map(Genero::getNombreGenero)
                    .collect(Collectors.toList());
                return nombresGeneros.contains("Drama") && nombresGeneros.contains("Comedia") &&
                       nombresGeneros.size() == 2;
            })
            .collect(Collectors.toList());

        System.out.println("Películas con géneros Drama y Comedia:");
        peliculasDramaComedia.forEach(pelicula -> 
            System.out.println("-" + pelicula.getTituloPelicula()));
    }
}




