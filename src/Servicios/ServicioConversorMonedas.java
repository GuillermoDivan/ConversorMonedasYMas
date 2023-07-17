package Servicios;

import Entidades.Conversor;
import javax.swing.*;
import java.util.Scanner;

public class ServicioConversorMonedas extends ServicioConversor{
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    @Override
    protected Conversor elegirCambio(double valor) {
        int proceso = 0;
        double cambio = 0;
        String[] opcionMonedas = {"Peso argentino a Dolar.", "Peso argentino a Euro.", "Peso argentino a Libra.",
                "Peso argentino a Yenes.", "Peso argentino a Won surcoreano", "Dolar a Peso argentino.",
                "Euro a Peso argentino.", "Libra a Peso argentino.", "Yenes a Peso argentino.",
                "Won surcoreano a peso argentino.", "Volver a inicio."};

        String eleccionConversorMonedas = (String) JOptionPane.showInputDialog(
                null,
                "¿Cuál es el cambio que deseas consultar?",
                "Elija entre las opciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionMonedas,
                opcionMonedas[0]
        );

       switch (eleccionConversorMonedas) {
            case "Peso argentino a Dolar.":
                proceso = 1;
                cambio = 1 / 263.30;
                break;
            case "Peso argentino a Euro.":
                proceso = 2;
                cambio = 1 / 289.40;
                break;
            case "Peso argentino a Libra.":
                proceso = 3;
                cambio = 1 / 339.50;
                break;
            case "Peso argentino a Yenes.":
                proceso = 4;
                cambio = 1 / 1.87;
                break;
            case "Peso argentino a Won surcoreano":
                proceso = 5;
                cambio = 1 / 0.20;
                break;
            case "Dolar a Peso argentino.":
                proceso = 6;
                cambio = 263.30;
                break;
            case "Euro a Peso argentino.":
                proceso = 7;
                cambio = 289.40;
                break;
            case "Libra a Peso argentino.":
                proceso = 8;
                cambio = 339.50;
                break;
            case "Yenes a Peso argentino.":
                proceso = 9;
                cambio = 1.87;
                break;
            case "Won surcoreano a peso argentino.":
                proceso = 0;
                cambio = 0.20;
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
                case 1: JOptionPane.showMessageDialog(null, "Peso a Dolar: "+ resultado +"."); break;
                case 2: JOptionPane.showMessageDialog(null, "Peso a Euro: "+ resultado +"."); break;
                case 3: JOptionPane.showMessageDialog(null, "Peso a Libra: "+ resultado +"."); break;
                case 4: JOptionPane.showMessageDialog(null, "Peso a Yen: "+ resultado +"."); break;
                case 5: JOptionPane.showMessageDialog(null, "Peso a Won surcoreano: "+ resultado +"."); break;
                case 6: JOptionPane.showMessageDialog(null, "Dolar a Peso: "+ resultado +"."); break;
                case 7: JOptionPane.showMessageDialog(null, "Euro a Peso: "+ resultado +"."); break;
                case 8: JOptionPane.showMessageDialog(null, "Libra a Peso: "+ resultado +"."); break;
                case 9: JOptionPane.showMessageDialog(null, "Yen a Peso: "+ resultado +"."); break;
                case 0: JOptionPane.showMessageDialog(null, "Won surcoreano a Peso: "+ resultado +"."); break;
            }

        }
}

