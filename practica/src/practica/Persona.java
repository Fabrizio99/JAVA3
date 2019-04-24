/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String nacionalidad;
    private String dni;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate fechaNac;

    public Persona(String nombre, int edad, String sexo, String nacionalidad, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.dni = dni;
        this.fechaNac=LocalDate.parse(fechaNacimiento,formato);
    }
    
    public void mostrarDatos(){
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("Nacionalidad: "+nacionalidad);
        System.out.println("DNI: "+dni);
        System.out.println("Fecha de Nacimiento: "+fechaNac);
    }
}
