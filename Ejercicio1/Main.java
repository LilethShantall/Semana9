/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author Lileth
 */
public class Main {
    public static void main(String[] args) {
        // Definir ciudades de los 5 continentes
        Ciudad lima = new Ciudad(1, "Lima", 8700000, "LIM");
        Ciudad buenosAires = new Ciudad(2, "Buenos Aires", 15000000, "BA");
        Ciudad newYork = new Ciudad(3, "Nueva York", 8400000, "NY");
        
        Ciudad tokyo = new Ciudad(4, "Tokio", 37000000, "TOK");
        Ciudad shanghai = new Ciudad(5, "Shanghái", 29210808, "SHA");
        Ciudad nuevaDelhi = new Ciudad(6, "Nueva Delhi", 32941308, "NUVL");
        
        
        Ciudad lagos = new Ciudad(6, "Lagos", 14200000, "LAG");
        Ciudad cairo = new Ciudad(7, "El Cairo", 20400000, "CAI");
        
        Ciudad paris = new Ciudad(8, "París", 2148000, "PAR");
        Ciudad moscow = new Ciudad(9, "Moscú", 11920000, "MOS");
        
        Ciudad sydney = new Ciudad(10, "Sídney", 5300000, "SDY");
        Ciudad melbourne = new Ciudad(11, "Melbourne", 5078000, "MEL");

        // Asignar ciudades a países y continentes
        List<Ciudad> ciudadesAmerica = new ArrayList<>(Arrays.asList(lima, buenosAires, newYork));
        List<Ciudad> ciudadesAsia = new ArrayList<>(Arrays.asList(tokyo, shanghai));
        List<Ciudad> ciudadesAfrica = new ArrayList<>(Arrays.asList(lagos, cairo));
        List<Ciudad> ciudadesEuropa = new ArrayList<>(Arrays.asList(paris, moscow));
        List<Ciudad> ciudadesOceania = new ArrayList<>(Arrays.asList(sydney, melbourne));

        // Crear instancias de países
        Pais peru = new Pais("PE", "Perú", "América", 1285216.0, 1, 33000000, ciudadesAmerica);
        Pais japon = new Pais("JP", "Japón", "Asia", 377975.0, 2, 125800000, ciudadesAsia);
        Pais nigeria = new Pais("NG", "Nigeria", "África", 923769.0, 3, 206100000, ciudadesAfrica);
        Pais francia = new Pais("FR", "Francia", "Europa", 551695.0, 4, 67000000, ciudadesEuropa);
        Pais australia = new Pais("AU", "Australia", "Oceanía", 7692024.0, 5, 25600000, ciudadesOceania);

        // Crear las listas de países y continentes
        List<Pais> paises = new ArrayList<>(Arrays.asList(peru, japon, nigeria, francia, australia));
        
        // Crear continentes y asignación de los países correspondientes
        Continente america = new Continente("América", paises.stream().filter(p -> p.getNombreContinente().equals("América")).collect(Collectors.toList()));
        Continente asia = new Continente("Asia", paises.stream().filter(p -> p.getNombreContinente().equals("Asia")).collect(Collectors.toList()));
        Continente africa = new Continente("África", paises.stream().filter(p -> p.getNombreContinente().equals("África")).collect(Collectors.toList()));
        Continente europa = new Continente("Europa", paises.stream().filter(p -> p.getNombreContinente().equals("Europa")).collect(Collectors.toList()));
        Continente oceania = new Continente("Oceanía", paises.stream().filter(p -> p.getNombreContinente().equals("Oceanía")).collect(Collectors.toList()));
        
        List<Continente> continentes = Arrays.asList(america, asia, africa, europa, oceania);

        // Definir umbral de la población
        int umbralPoblacion = 10000000;

        // Encontrar las ciudades más pobladas de cada continente
        System.out.println("Ciudades más pobladas de cada continente:");
        continentes.forEach(continente -> {
            Ciudad ciudadMasPoblada = continente.getCiudadesMasPobladas().stream()
                .filter(c -> c.getNroPoblacion() > umbralPoblacion)
                .max((c1, c2) -> Integer.compare(c1.getNroPoblacion(), c2.getNroPoblacion()))
                .orElse(null);

            if (ciudadMasPoblada != null) {
                System.out.println(continente.getNombreContinente() + ": " + ciudadMasPoblada);
            } else {
                System.out.println(continente.getNombreContinente() + ": No hay ciudades que cumplan el criterio.");
            }
        });
    }
}
// Ejercicio 1: Buscar las ciudades más pobladas de los continentes, condicion nosotros ponemos el dada poner los rangos para las ciudades mas pobladas.
// Ejercicio 2: La ciudad más poblada de todos los continentes.
// Ejercicio 3: Encontrar las listas de peliculas que contengan los generos de drama y comedia.