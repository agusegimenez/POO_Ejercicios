package uva1;

public class SistemaDeControlDeVuelo {
    private String fabricante;
    private int numeroDeModos;
    private TipoSistema tipoSistema;

    public SistemaDeControlDeVuelo(String fabricante, int numeroDeModos, TipoSistema tipoSistema) {
        this.fabricante = fabricante;
        this.numeroDeModos = numeroDeModos;
        this.tipoSistema = tipoSistema;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getNumeroDeModos() {
        return numeroDeModos;
    }

    public void setNumeroDeModos(int numeroDeModos) {
        this.numeroDeModos = numeroDeModos;
    }

    public TipoSistema getTipoSistema() {
        return tipoSistema;
    }

    public void cambiarTipoSistema(TipoSistema tipoSistema) {
        this.tipoSistema = tipoSistema;
    }


}
