package herenciaclase;

public class automovil extends vehiculo{
    private double km;
    
    public automovil(String placa, String modelo, int year, String color,double km){
        //llamndo al constructor de la clase padre
        super(placa, modelo, year, color);
        this.km=km;
        
    }
    
    public void mostrarDatos(){
        System.out.println("placa: "+getPlaca());
        System.out.println("modelo: "+getModelo());
        System.out.println("año: "+getYear());
        System.out.println("color: "+getColor());
        System.out.println("kilometraje: "+km);
    }
    
    public void ocupaEspacio(){
        super.ocupaEspacio(1);
        
    }
}
