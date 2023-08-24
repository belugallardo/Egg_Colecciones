/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author belugallardo
 */
public class Perros {
    private String raza;

    public Perros(String raza) {
        this.raza = raza;
    }

    public Perros() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perros{" + "raza=" + raza + '}';
    }
    
    
}
