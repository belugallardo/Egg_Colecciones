/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Peliculas;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/
/**
 *
 * @author belugallardo
 */
public class PeliculasServicio {
    
    ArrayList <Peliculas> lista = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public void crearPelicula(){
        boolean seguir = false;
        
        do{
        Peliculas pelicula = new Peliculas();
        
        System.out.println("Ingrese el titulo de la pelicula");
        pelicula.setTitulo(leer.nextLine());
        
        System.out.println("Ingrese el director de la pelicula");
        pelicula.setDirector(leer.nextLine());
        
        System.out.println("Ingrese la duracion en horas de la pelicula");
        pelicula.setDuracion(leer.nextDouble());
        leer.nextLine();
        
        lista.add(pelicula);
        
         System.out.println("¿Desea cargar otra pelicula? S/N");
            String respuesta;

            do {
                respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("N")) {
                    seguir = respuesta.equalsIgnoreCase("S");
                } else {
                    System.out.println("Respuesta inválida. Ingrese S o N.");
                }
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
            
        }while(seguir);
        
        mostrarListaPelicula();
    }
    
    private void mostrarListaPelicula(){
        System.out.println("Lista de peliculas");
        lista.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("");
    }
    
    public void mostrarPeliculasMayorDuracion(){
        System.out.println("Lista de peliculas de mas de 1 hora de duracion");
        lista.forEach((pelicula) -> {
            if(pelicula.getDuracion()>=1){
                System.out.println(pelicula);
            }
        });
        System.out.println("");
                
    }
    
    public void ordenarDuracionMayorAMenor(){
        System.out.println("Peliculas ordenadas de Mayor a menor duracion");
        Collections.sort(lista, Comparadores.ordenarDuracionMayorAMenor);
        lista.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("");
    }
    
    public void ordenarDuracionMenorAMayor(){
        System.out.println("Peliculas ordenadas de menor a mayor duracion");
        Collections.sort(lista, Comparadores.ordenarDuracionMenorAMayor);
        lista.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("");
    }    
    public void ordenarTitulo(){
        System.out.println("Peliculas ordenadas alfabeticamente por Titulo");
        Collections.sort(lista, Comparadores.ordenarPorTitulo);
        lista.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("");
    }        
        public void ordenarDirector(){
        System.out.println("Peliculas ordenadas alfabeticamente por Director");
        Collections.sort(lista, Comparadores.ordenarPorDirector);
        lista.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("");
    }    
}
