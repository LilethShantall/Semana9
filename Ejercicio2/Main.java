/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Lileth
 */


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import Ejercicio1.Ciudad;
import Ejercicio1.Pais;
import Ejercicio1.Continente;

public class Main {
    public static void main(String[] args) {
        // Definir ciudades de los 5 continentes
        Ciudad lima = new Ciudad(1, "Lima", 8700000, "LIM");
        Ciudad buenosAires = new Ciudad(2, "Buenos Aires", 15000000, "BA");
        Ciudad newYork = new Ciudad(3, "Nueva York", 8400000, "NYC");

        Ciudad tokyo = new Ciudad(4, "Tokio", 37000000, "TYO");
        Ciudad shanghai = new Ciudad(5, "Shanghái", 26300000, "SHA");
        Ciudad nuevaDelhi = new Ciudad(6, "Nueva Delhi", 32941308, "NUVL");

        Ciudad lagos = new Ciudad(6, "Lagos", 14200000, "LOS");
        Ciudad cairo = new Ciudad(7, "El Cairo", 20400000, "CAI");

        Ciudad paris = new Ciudad(8, "París", 2148000, "PAR");
        Ciudad moscow = new Ciudad(9, "Moscú", 11920000, "MOW");

        Ciudad sydney = new Ciudad(10, "Sídney", 5300000, "SYD");
        Ciudad melbourne = new Ciudad(11, "Melbourne", 5078000, "MEL");

        // Asignar ciudades a países y continentes
        List<Ciudad> ciudadesAmerica = Arrays.asList(lima, buenosAires, newYork);
        List<Ciudad> ciudadesAsia = Arrays.asList(tokyo, shanghai);
        List<Ciudad> ciudadesAfrica = Arrays.asList(lagos, cairo);
        List<Ciudad> ciudadesEuropa = Arrays.asList(paris, moscow);
        List<Ciudad> ciudadesOceania = Arrays.asList(sydney, melbourne);

        // Crear instancias de países
        Pais peru = new Pais("PE", "Perú", "América", 1285216.0, 1, 33000000, ciudadesAmerica);
        Pais japon = new Pais("JP", "Japón", "Asia", 377975.0, 2, 125800000, ciudadesAsia);
        Pais nigeria = new Pais("NG", "Nigeria", "África", 923769.0, 3, 206100000, ciudadesAfrica);
        Pais francia = new Pais("FR", "Francia", "Europa", 551695.0, 4, 67000000, ciudadesEuropa);
        Pais australia = new Pais("AU", "Australia", "Oceanía", 7692024.0, 5, 25600000, ciudadesOceania);

        List<Pais> paises = Arrays.asList(peru, japon, nigeria, francia, australia);

        // Crear continentes y asignarles los países
        List<Continente> continentes = Arrays.asList(
            new Continente("América", paises.stream().filter(p -> p.getNombreContinente().equals("América")).collect(Collectors.toList())),
            new Continente("Asia", paises.stream().filter(p -> p.getNombreContinente().equals("Asia")).collect(Collectors.toList())),
            new Continente("África", paises.stream().filter(p -> p.getNombreContinente().equals("África")).collect(Collectors.toList())),
            new Continente("Europa", paises.stream().filter(p -> p.getNombreContinente().equals("Europa")).collect(Collectors.toList())),
            new Continente("Oceanía", paises.stream().filter(p -> p.getNombreContinente().equals("Oceanía")).collect(Collectors.toList()))
        );

        // Encontrar la ciudad más poblada de los 5 continentes
        Ciudad ciudadMasPoblada = continentes.stream()
            .flatMap(continente -> continente.getCiudadesMasPobladas().stream())
            .max(Comparator.comparingInt(Ciudad::getNroPoblacion))
            .orElse(null);

        if (ciudadMasPoblada != null) {
            System.out.println("La ciudad más poblada de todos los continentes es: " 
                + ciudadMasPoblada.getNombreCiudad() + " con una población de " 
                + ciudadMasPoblada.getNroPoblacion());
        }
    }

}



