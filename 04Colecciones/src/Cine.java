
import Servicio.PeliculasServicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author belugallardo
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PeliculasServicio ps = new PeliculasServicio();
        ps.crearPelicula();
        ps.mostrarPeliculasMayorDuracion();
        ps.ordenarDuracionMayorAMenor();
        ps.ordenarDuracionMenorAMayor();
        ps.ordenarTitulo();
        ps.ordenarDirector();
    }
    
}
