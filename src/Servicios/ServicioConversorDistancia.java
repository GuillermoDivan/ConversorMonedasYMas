package Servicios;

import Entidades.Conversor;
import javax.swing.*;
import java.util.Scanner;
public class ServicioConversorDistancia extends ServicioConversor{
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    @Override
    protected Conversor elegirCambio(double valor) {
        int proceso = 0;
        double cambio = 0;
        String[] opcionDistancia = {"Metros a Pies.", "Pies a Metros.",
                "Centímetros a Pulgadas.", "Pulgadas a Centímetros.",
                "Kilómetros a Millas.", "Millas a Kilómetros.",
                "Volver a inicio."};

        String eleccionConversorDistancia = (String) JOptionPane.showInputDialog(
                null,
                "¿Cuál es el cambio que deseas consultar?",
                "Elija entre las opciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionDistancia,
                opcionDistancia[0]
        );

        switch (eleccionConversorDistancia) {
            case "Metros a Pies.":
                proceso = 1;
                cambio = 3.281;
                break;
            case "Pies a Metros.":
                proceso = 2;
                cambio = 1 / 3.281;
                break;
            case "Centímetros a Pulgadas.":
                proceso = 3;
                cambio = 1 / 2.54;
                break;
            case "Pulgadas a Centímetros.":
                proceso = 4;
                cambio = 2.54;
                break;
            case "Kilómetros a Millas.":
                proceso = 5;
                cambio = 1 / 1.609;
                break;
            case "Millas a Kilómetros.":
                proceso = 6;
                cambio = 1.609;
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

            case 1: JOptionPane.showMessageDialog(null, "Metros a Pies: "+ resultado +"."); break;
            case 2: JOptionPane.showMessageDialog(null, "Pies a Metros: "+ resultado +"."); break;
            case 3: JOptionPane.showMessageDialog(null, "Centímetros a Pulgadas: "+ resultado +"."); break;
            case 4: JOptionPane.showMessageDialog(null, "Pulgadas a Centímetros: "+ resultado +"."); break;
            case 5: JOptionPane.showMessageDialog(null, "Kilómetros a Millas: "+ resultado +"."); break;
            case 6: JOptionPane.showMessageDialog(null, "Millas a Kilómetros: "+ resultado +"."); break;
        }

    }
}

