package Servicios;

import Entidades.Conversor;
import javax.swing.*;
import java.util.Scanner;

public abstract class ServicioConversor {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    protected void realizarConversion(){
        double valor = ingresarValorAConvertir();
        Conversor conversor = elegirCambio(valor);
        if (conversor != null ) { convertir(conversor, valor); }
    }

    protected double ingresarValorAConvertir(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
        //Manejo error si no ingresa double.
        return valor;
    }
    protected abstract Conversor elegirCambio(double valor);
    protected abstract void convertir(Conversor conversor, double valor);
}