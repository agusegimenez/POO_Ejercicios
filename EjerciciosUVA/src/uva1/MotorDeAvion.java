package uva1;

public class MotorDeAvion {
    private String marca;
    private float caballosDeFuerza;
    private double empuje;
    private boolean encendido = false;

    public MotorDeAvion(String marca, float caballosDeFuerza, double empuje, boolean encendido) {
        this.marca = marca;
        this.caballosDeFuerza = caballosDeFuerza;
        this.empuje = empuje;
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(float caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public double getEmpuje() {
        return empuje;
    }

    public void setEmpuje(double empuje) {
        this.empuje = empuje;
    }

    public String isEncendido() {
        if(encendido){
            return "El motor se encuentra encendido. Puede iniciar controles.";
        }else{
            return "El motor se encuentra apagado. Enciendalo antes de empezar los controles.";
        }
    }

    public void encenderMotor(){
        this.encendido = true;
    }
}
