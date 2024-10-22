/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;
import Ejercicio1.Ciudad;
import Ejercicio1.Pais;
import Ejercicio1.Continente;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
/**
 *
 * @author Lileth
 */
public class Main {
   public static void main(String[] args) {
        // Definir ciudades
        Ciudad lima = new Ciudad(1, "Lima", 8700000, "LIM");
        Ciudad buenosAires = new Ciudad(2, "Buenos Aires", 15000000, "BA");
        Ciudad newYork = new Ciudad(3, "Nueva York", 8400000, "NYC");
        Ciudad tokyo = new Ciudad(4, "Tokio", 37000000, "TYO");
        Ciudad shanghai = new Ciudad(5, "Shanghái", 26300000, "SHA");
        Ciudad lagos = new Ciudad(6, "Lagos", 14200000, "LOS");
        Ciudad cairo = new Ciudad(7, "El Cairo", 20400000, "CAI");
        Ciudad paris = new Ciudad(8, "París", 2148000, "PAR");
        Ciudad sydney = new Ciudad(9, "Sídney", 5300000, "SYD");

        // Asignar ciudades a países
        List<Ciudad> ciudadesAmerica = Arrays.asList(lima, buenosAires, newYork);
        List<Ciudad> ciudadesAsia = Arrays.asList(tokyo, shanghai);
        List<Ciudad> ciudadesAfrica = Arrays.asList(lagos, cairo);
        List<Ciudad> ciudadesEuropa = Arrays.asList(paris);
        List<Ciudad> ciudadesOceania = Arrays.asList(sydney);

        // Crear instancias de países
        Pais peru = new Pais("PE", "Perú", "América", 1285216.0, 1, 33000000, ciudadesAmerica);
        Pais japon = new Pais("JP", "Japón", "Asia", 377975.0, 2, 125800000, ciudadesAsia);
        Pais nigeria = new Pais("NG", "Nigeria", "África", 923769.0, 3, 206100000, ciudadesAfrica);
        Pais francia = new Pais("FR", "Francia", "Europa", 551695.0, 4, 67000000, ciudadesEuropa);
        Pais australia = new Pais("AU", "Australia", "Oceanía", 7692024.0, 5, 25600000, ciudadesOceania);

        List<Pais> paises = Arrays.asList(peru, japon, nigeria, francia, australia);

        // Ordenar los países por número de población en orden ascendente
        List<Pais> paisesOrdenadosPorPoblacion = paises.stream()
            .sorted(Comparator.comparingInt(Pais::getNroPoblacion))
            .collect(Collectors.toList());

        System.out.println("Países ordenados por población (ascendente):");
        paisesOrdenadosPorPoblacion.forEach(pais -> 
            System.out.println("- " + pais.getNombrePais() + ": " + pais.getNroPoblacion() + " habitantes"));
    }
}



