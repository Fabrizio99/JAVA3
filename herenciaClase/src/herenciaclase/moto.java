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
public class moto extends vehiculo{
    public moto(String placa, String modelo, int year, String color){
        super(placa, modelo, year, color);
    }
    public void mostrarDatos(){
        System.out.println("placa: "+getPlaca());
        System.out.println("modelo: "+getModelo());
        System.out.println("año: "+getYear());
        System.out.println("color: "+getColor());
    }
    
    public void ocupaEspacio(){
        super.ocupaEspacio(0.5);
    }
}
