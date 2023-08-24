/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Peliculas;
import java.util.Comparator;

/**
 *
 * @author belugallardo
 */
public class Comparadores {
    public static Comparator <Peliculas> ordenarDuracionMayorAMenor = new Comparator <Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    
    public static Comparator <Peliculas> ordenarDuracionMenorAMayor = new Comparator <Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    public static Comparator <Peliculas> ordenarPorTitulo = new Comparator <Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };    
    
        public static Comparator <Peliculas> ordenarPorDirector = new Comparator <Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
}
