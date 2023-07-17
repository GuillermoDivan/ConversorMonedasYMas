package Entidades;

public class Conversor {
    int proceso;
    double cambio;

    public Conversor(int proceso, double cambio) {
        this.proceso = proceso;
        this.cambio = cambio;
    }

    public int getProceso() {
        return proceso;
    }

    public double getCambio() {
        return cambio;
    }
}
