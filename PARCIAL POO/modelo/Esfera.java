package modelo;

public class Esfera extends FiguraGeometrica{
    private double radio;

    public Esfera(double r)
    {
        super("Esfera");
        radio = r;
        
    } 

    public double getLado() {
        return radio;
    }

    public void setLado(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        
        return (4*(Math.PI)*Math.pow(radio, 3))/3;
    }
}
