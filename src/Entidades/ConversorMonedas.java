package Entidades;

public class ConversorMonedas {
    int proceso;
    double cambio;

    public ConversorMonedas(int proceso, double cambio) {
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