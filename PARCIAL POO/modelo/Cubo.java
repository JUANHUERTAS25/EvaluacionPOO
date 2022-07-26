package modelo;

public class Cubo extends FiguraGeometrica{

    private double lado;

    public Cubo(double l)
    {
        super("Cubo");
        lado = l;
        
    } 

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        
        return Math.pow(lado, 3);
    }
    
}
