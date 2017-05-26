/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jeisson
 */
public class Datos {

    ArrayList<Double> T = new ArrayList<>();
    ArrayList<Double> CA = new ArrayList<>();
    ArrayList<Double> NEL = new ArrayList<>();

    
    public void CargarDatos(String a) throws FileNotFoundException{
       Scanner s = new Scanner(new File("Archivo.txt"));
        System.out.println("Registro historico");
        ArrayList<Double> T = new ArrayList<>();
        ArrayList<Double> CA = new ArrayList<>();
        ArrayList<Double> NEL = new ArrayList<>();
        while (s.hasNextLine()) {
            String NombreC = s.nextLine();
            int NumEst = Integer.parseInt(s.nextLine());
            for (int i = 0; i < NumEst; i++) {
                String NE = s.nextLine();
                int NumD = Integer.parseInt(s.nextLine());
                for (int j = 0; j < NumD; j++) {
                    String u = s.nextLine();
                    System.out.println(u);
                    String datos[] = u.split("[ ]+");
                    T.add(Double.parseDouble(datos[1]));
                    CA.add(Double.parseDouble(datos[2]));
                    NEL.add(Double.parseDouble(datos[3]));
                }
            }
        }
    
    
    
    }
    
    public void AgregarAT(double a) {
        T.add(a);
    }

    public void AgregarCA(double a) {
        CA.add(a);
    }

    public void AgregarNEL(double a) {
        NEL.add(a);
    }

    public void PromedioAT() {
        double promedioT = 0;
        for (int k = 0; k < T.size(); k++) {
                promedioT += T.get(k);
            }
        promedioT = promedioT / T.size();
        System.out.println("El promedio de la temperatura en la ciudad es= "+promedioT);
    }
    public void PromedioCA() {
        double PromedioCA = 0;
            for (int k = 0; k < CA.size(); k++) {
                PromedioCA += CA.get(k);
                            }
            PromedioCA = (PromedioCA / CA.size());
            System.out.println("El promedio de la Cantidad de agua en la ciudad es= "+PromedioCA);
        
    }
    public void PromedioNEL(double a) {
        double PromedioNEL = 0;
            for (int k = 0; k < NEL.size(); k++) {
                PromedioNEL += NEL.get(k);
                            }
            PromedioNEL = (PromedioNEL / NEL.size());
            System.out.println("El promedio del nivel electrico en la ciudad es= "+PromedioNEL);
    }
}
