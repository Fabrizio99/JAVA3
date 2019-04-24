/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class Dirigentes extends Persona{
    private String lugarProgramado;
    private String costoLugar;
    private String horaInicial;
    private String horaFinal;
    private String fechaProgramado;
    public Dirigentes(String nombre, int edad, String sexo, String nacionalidad, String dni, String fechaNacimiento,String lugarProgramado,String costoLugar,String horaInicial,String horaFinal,String fechaProgramado){
        super(nombre, edad, sexo, nacionalidad, dni, fechaNacimiento);
        this.lugarProgramado=lugarProgramado;
        this.costoLugar=costoLugar;
        this.horaInicial=horaInicial;
        this.horaFinal=horaFinal;
        this.fechaProgramado=fechaProgramado;
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Lugar programado: "+lugarProgramado);
        System.out.println("Costo del lugar: "+costoLugar);
        System.out.println("Hora Inicial programado: "+horaInicial);
        System.out.println("Hora Final programado: "+horaFinal);
    }
}
