package uva2;

public class Pantalla{
    private double tamaño;
    private String resolucion;

    public Pantalla(double tamaño, String resolucion) {
        this.tamaño = tamaño;
        this.resolucion = resolucion;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}
