/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05colecciones;

import Servicios.PaisServicio;

/**
 *
 * @author belugallardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        ps.crearPais();
        ps.ordenarPaises();
        ps.eliminarPais();
    }
    
}
