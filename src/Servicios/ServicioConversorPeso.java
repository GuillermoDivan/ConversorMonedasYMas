package Servicios;

import Entidades.Conversor;
import javax.swing.*;
import java.util.Scanner;
public class ServicioConversorPeso extends ServicioConversor{
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    @Override
    protected Conversor elegirCambio(double valor) {
        int proceso = 0;
        double cambio = 0;
        String[] opcionPeso = {"Kilogramo a Libra.", "Libra a Kilogramo.",
                "Gramo a Onza.", "Onza a Gramo.",
                "Volver a inicio."};

        String eleccionConversorPeso = (String) JOptionPane.showInputDialog(
                null,
                "¿Cuál es el cambio que deseas consultar?",
                "Elija entre las opciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionPeso,
                opcionPeso[0]
        );

        switch (eleccionConversorPeso) {
            case "Kilogramo a Libra.":
                proceso = 1;
                cambio = 2.205;
                break;
            case "Libra a Kilogramo.":
                proceso = 2;
                cambio = 1 / 2.205;
                break;
            case "Gramo a Onza.":
                proceso = 3;
                cambio = 1 / 28.35;
                break;
            case "Onza a Gramo.":
                proceso = 4;
                cambio = 28.35;
                break;
            case "Volver a inicio.":
                JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro programa.");
                return null;
        }
        return new Conversor(proceso, cambio);
    }
    @Override
    protected void convertir(Conversor conversor, double valor){
        double resultado = valor * conversor.getCambio();
        switch(conversor.getProceso()){

            case 1: JOptionPane.showMessageDialog(null, "Kilogramo a Libra: "+ resultado +"."); break;
            case 2: JOptionPane.showMessageDialog(null, "Libra a Kilogramo: "+ resultado +"."); break;
            case 3: JOptionPane.showMessageDialog(null, "Gramo a Onza: "+ resultado +"."); break;
            case 6: JOptionPane.showMessageDialog(null, "Onza a Gramo: "+ resultado +"."); break;
        }

    }
}

