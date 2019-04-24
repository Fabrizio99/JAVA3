/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class Jugador extends Persona{
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private double altura;
    private double peso;
    private String fechaJuego;
    private String horaJuego;
    
    public Jugador(String nombre, int edad, String sexo, String nacionalidad, String dni, String fechaNacimiento,double altura,double peso,String fecha,String hora){
        super(nombre, edad, sexo, nacionalidad, dni, fechaNacimiento);
        this.altura=altura;
        this.peso=peso;
        this.fechaJuego=fecha;
        this.horaJuego=hora;
    }
    
    public void jugarPartido(){
        System.out.println("La hora del partido es: "+fechaJuego+" a las "+horaJuego+" horas.");
    }
    
    public void mostrarDatos(){
        System.out.println("DATOS DEL JUGADOR");
        super.mostrarDatos();
        System.out.println("Altura: "+altura+" m.");
        System.out.println("Peso: "+peso+" kg.");
    }
}
