package modelo;

public abstract class FiguraGeometrica
{
    public abstract double calcularArea();
    protected String nombre;

    

    public FiguraGeometrica (String n)
    {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String toString()
    {
        return nombre + " "+ "Area = " + calcularArea();
    }
}