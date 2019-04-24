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
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador jugador1=new Jugador("Luis",19,"Masculino","Peruano","11111111","30/01/1999",1.98,23.56,"01/12/2019","23:00");
        jugador1.mostrarDatos();
        jugador1.jugarPartido();
        System.out.println("");
        Entrendores entrenador1=new Entrendores("Gareca", 59, "Masculino", "Argentino", "12345678", "12/04/1978", "Estadio Nacional", "Futbol", "17:00");
        entrenador1.mostrarDatos();
        entrenador1.entrenarJugadores();
        
    }
    
}
