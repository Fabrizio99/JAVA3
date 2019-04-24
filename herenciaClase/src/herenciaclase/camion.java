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
public class camion extends vehiculo{
    private double km;
    private double capacidad;
    private int eje;
    
    public camion(String placa, String modelo, int year, String color,double km,double capacidad,int eje){
        super(placa, modelo, year, color);
        this.km=km;
        this.capacidad=capacidad;
        this.eje=eje;
    }
    
    public void mostrarDatos(){
        System.out.println("placa: "+getPlaca());
        System.out.println("modelo: "+getModelo());
        System.out.println("año: "+getYear());
        System.out.println("color: "+getColor());
        System.out.println("kilometraje: "+km);
        System.out.println("capacidad: "+capacidad);
        System.out.println("eje: "+eje);
        
    }
    
    public void ocupaEspacio(){
        super.ocupaEspacio(eje);
    }
}
