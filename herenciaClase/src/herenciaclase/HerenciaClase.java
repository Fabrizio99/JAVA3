/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaclase;

/**
 *
 * @author Usuario
 */
public class HerenciaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        automovil auto1=new automovil("abc-12324", "Chevrolet Camaro", 2018, "negro", 0);
        auto1.mostrarDatos();
        auto1.ocupaEspacio();
        System.out.println("");
        camion camion1=new camion("def-1478", "Peterbilt 379", 2015, "rojo", 100, 1000, 4);
        camion1.mostrarDatos();
        camion1.ocupaEspacio();
        System.out.println("");
        moto moto1= new moto("aws-2569", "honda XR150L", 2018, "negro");
        moto1.mostrarDatos();
        moto1.ocupaEspacio();
    }
    
}
