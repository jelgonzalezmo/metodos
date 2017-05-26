/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiante
 */
public class EstacionMet {private String NombreE;
private String Ubicacion;
private String FechaIn;
private Sensor[] sensores;

    public EstacionMet(String NombreE, String Ubicacion, String FechaIn, Sensor[] sensores) {
        this.NombreE = NombreE;
        this.Ubicacion = Ubicacion;
        this.FechaIn = FechaIn;
        this.sensores = sensores;
    }

    public Sensor[] getSensores() {
        return sensores;
    }

    public void setSensores(Sensor[] sensores) {
        this.sensores = sensores;
    }

    

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getFechaIn() {
        return FechaIn;
    }

    public void setFechaIn(String FechaIn) {
        this.FechaIn = FechaIn;
    }

    @Override
    public String toString() {
        return "EstacionMet{" + "NombreE=" + NombreE + ", Ubicacion=" + Ubicacion + ", FechaIn=" + FechaIn + ", sensores=" + sensores + '}';
    }
    
    public void informacion(){
       sensores[0].toString();
       sensores[1].toString();
       sensores[2].toString();
        }

}
