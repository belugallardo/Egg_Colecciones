/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
/**
 *
 * @author belugallardo
 */
public class AlumnoServicio {

    ArrayList<Alumno> lista = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void crearAlumno() {
        boolean seguir = false;

        do {
            Alumno al = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            al.setNombre(leer.nextLine());

            ArrayList<Integer> not = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota");
                not.add(leer.nextInt());
                leer.nextLine();
            }
            al.setNotas(not);

            lista.add(al);
            System.out.println("¿Desea cargar otro alumno? S/N");
            String respuesta;

            do {
                respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("N")) {
                    seguir = respuesta.equalsIgnoreCase("S");
                } else {
                    System.out.println("Respuesta inválida. Ingrese S o N.");
                }
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));

        } while (seguir);
    }

    public void notaFinal() {

        System.out.println("De que alumno quiere calcular el promedio");
        String alumn = leer.nextLine();

        lista.forEach(alumno -> {
            if (alumno.getNombre().equalsIgnoreCase(alumn)) {
                ArrayList<Integer> notas = alumno.getNotas();
                String prom = promedio(notas);
                System.out.println("El promedio de " + alumno.getNombre() + " es: " + prom);
             
            }
        });

    }

    private String promedio(ArrayList<Integer> notas) {
        int suma = 0;

    for (Integer nota : notas) {
        suma += nota;
    }

    double promedio = (double) suma / notas.size();
    
    DecimalFormat formato = new DecimalFormat ("#.000");
    String resultado = formato.format(promedio);
    
    
    return resultado;
    }

}
