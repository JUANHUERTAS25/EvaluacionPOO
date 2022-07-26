package modelo;

public class Cono extends FiguraGeometrica{

    private double radio;
    private double altura;
    
    
    public Cono(double r, double h)
    {
        super("Cono");
        radio = r;
        altura = h;
        
    }

    public void setAltura(double h)
    {
        this.altura = h;
    }

    public double getAltura()
    {
        return altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
       
        return (Math.PI*(Math.pow(radio, 2)*altura))/3;
    }
    
}
