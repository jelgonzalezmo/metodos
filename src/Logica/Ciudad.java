/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Ciudad {
    private ArrayList<EstacionMet> estaciones;

    public Ciudad(ArrayList<EstacionMet> estaciones) {
        this.estaciones = estaciones;
    }

    public ArrayList<EstacionMet> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<EstacionMet> estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "estaciones=" + estaciones + '}';
    }
    
    public void informacion(){
    estaciones.get(0).toString();
    }
}
