package uva1;

import java.util.List;

public class Avion {
    private MotorDeAvion motor;
    private int cantidadDeAlas;
    private List<Ala> alas;
    private SistemaDeControlDeVuelo sistemaDeControlDeVuelo;
    private int cantidadAsientos;
    private boolean sistemaDeEntretenimiento = false;

    public Avion(MotorDeAvion motor, List<Ala> alas, SistemaDeControlDeVuelo sistemaDeControlDeVuelo, int cantidadAsientos, boolean sistemaDeEntretenimiento) {
        this.motor = motor;
        this.cantidadDeAlas = cantidadAsientos;
        this.alas = alas;
        this.sistemaDeControlDeVuelo = sistemaDeControlDeVuelo;
        this.cantidadAsientos = cantidadAsientos;
        this.sistemaDeEntretenimiento = sistemaDeEntretenimiento;
    }
}
