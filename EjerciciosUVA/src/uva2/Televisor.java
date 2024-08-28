package uva2;

import org.w3c.dom.ls.LSOutput;

public class Televisor {
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private Tipo Tipo;
    private Pantalla pantalla;
    private boolean esSmart;
    private boolean estaEncendido;

    public Televisor(String marca, String modelo, int añoFabricacion, Tipo tipo,Pantalla pantalla, boolean esSmart) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.Tipo = tipo;
        this.pantalla = pantalla;
        this.esSmart = esSmart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Tipo getTipo() {
        return Tipo;
    }

    public void setTipo(Tipo tipo) {
        this.Tipo = tipo;
    }

    public boolean isEsSmart() {
        return esSmart;
    }

    public void setEsSmart(boolean esSmart) {
        this.esSmart = esSmart;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public void imprimirValores() {
        System.out.println(this.marca + " " + this.modelo + " -- " + this.pantalla.getTamaño() + " pulgadas -- " + this.pantalla.getResolucion() + " -- " + (this.esSmart ? "Smart" : "No Smart"));
    }

    public void encender() {
        this.estaEncendido = true;
        System.out.println("El televisor se encendió correctamente.");
    }

    public void apagar() {
        this.estaEncendido = false;
        System.out.println("El televisor se apagó.");
    }

    public String consultarSiEstaEncendido(){
        if(this.isEstaEncendido()){
            return "El televisor se encuentra encendido.";
        } else{
            return "El televisor se encuentra apagado actualmente.";
        }
    }
}
