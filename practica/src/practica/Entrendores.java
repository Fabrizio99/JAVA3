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
public class Entrendores extends Persona{
    private String lugarEnseñanza;
    private String deporteEnseñanza;
    private String horaEnseñanza;
    
    public Entrendores(String nombre, int edad, String sexo, String nacionalidad, String dni, String fechaNacimiento,String lugar, String deporte,String hora){
       super(nombre, edad, sexo, nacionalidad, dni, fechaNacimiento);
       this.deporteEnseñanza=deporte;
       this.horaEnseñanza=hora;
       this.lugarEnseñanza=lugar;
    }
    
    public void entrenarJugadores(){
        
        System.out.println("El entrenador enseñara "+deporteEnseñanza+" en el "+lugarEnseñanza+" a las "+horaEnseñanza);
    }
    
    public void mostrarDatos(){
        System.out.println("DATOS DEL ENTRENADOR");
        super.mostrarDatos();
        System.out.println("Lugar de enseñanza: "+lugarEnseñanza);
        System.out.println("Hora de enseñanza: "+horaEnseñanza);
        System.out.println("Deporte de enseñanza: "+deporteEnseñanza);
    }
}
