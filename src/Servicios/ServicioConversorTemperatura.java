package Servicios;

import Entidades.Conversor;
import javax.swing.*;
import java.util.Scanner;
public class ServicioConversorTemperatura extends ServicioConversor{
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    @Override
    protected Conversor elegirCambio(double valor) {
        int proceso = 0;
        double cambio = 0;
        String[] opcionTemperatura = {"Grados Celcius a Kelvin.", "Grados Celcius a Fahrenheit.",
                "Grados Kelvin a Celcius.", "Grados Kelvin a Fahrenheit.",
                "Grados Fahrenheit a Celcius.", "Grados Fahrenheit a Kelvin.",
                 "Volver a inicio."};

        String eleccionConversorTemperatura = (String) JOptionPane.showInputDialog(
                null,
                "¿Cuál es el cambio que deseas consultar?",
                "Elija entre las opciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionTemperatura,
                opcionTemperatura[0]
        );

        switch (eleccionConversorTemperatura) {
            case "Grados Celcius a Kelvin.":
                proceso = 1;
                cambio = valor + 273.15;
                break;
            case "Grados Celcius a Fahrenheit.":
                proceso = 2;
                cambio = valor * 1.8 + 32;
                break;
            case "Grados Kelvin a Celcius.":
                proceso = 3;
                cambio = valor - 273.15;
                break;
            case "Grados Kelvin a Fahrenheit.":
                proceso = 4;
                cambio = (1.8) * (valor - 273.15) + 32;
                break;
            case "Grados Fahrenheit a Celcius.":
                proceso = 5;
                cambio = (valor -32) / 1.8;
                break;
            case "Grados Fahrenheit a Kelvin.":
                proceso = 6;
                cambio = (5/9) * (valor - 32) + 273.15;
                break;
            case "Volver a inicio.":
                JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro programa.");
                return null;
        }
        return new Conversor(proceso, cambio);
    }
    @Override
    protected void convertir(Conversor conversor, double valor){
        double resultado = conversor.getCambio();
        switch(conversor.getProceso()){

            case 1: JOptionPane.showMessageDialog(null, "Celcius a Kelvin: "+ resultado +"."); break;
            case 2: JOptionPane.showMessageDialog(null, "Celcius a Fahrenheit: "+ resultado +"."); break;
            case 3: JOptionPane.showMessageDialog(null, "Kelvin a Celcius: "+ resultado +"."); break;
            case 4: JOptionPane.showMessageDialog(null, "Kelvin a Fahrenheit: "+ resultado +"."); break;
            case 5: JOptionPane.showMessageDialog(null, "Fahrenheit a Celcius: "+ resultado +"."); break;
            case 6: JOptionPane.showMessageDialog(null, "Fahrenheit a Kelvin: "+ resultado +"."); break;
        }

    }
}

