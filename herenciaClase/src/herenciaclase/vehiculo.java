package herenciaclase;

public class vehiculo {
    
    private String placa; 
    //el tipo protected permite que sea visible a su clase y a todos sus hijos
    private String modelo;
    private int year;
    private String color;

    public vehiculo(String placa, String modelo, int year, String color) {
        this.placa  = placa;
        this.modelo = modelo;
        this.year   = year;
        this.color  = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void ocupaEspacio(double espacio){
        System.out.println("El vehículo ocupa "+espacio+" espacios.");
    }
    
}
