package Servicios;

import Entidades.ConversorMonedas;

import javax.swing.*;
import java.util.Scanner;

public class ServicioConversorMonedas {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void realizarConversion(){
       double valor = ingresarValorAConvertir();
       ConversorMonedas cm = elegirMoneda();
        convertirMoneda(cm, valor);
        }

    private double ingresarValorAConvertir(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
        return valor;
    }

    private ConversorMonedas elegirMoneda() {
        ConversorMonedas cm;
        int proceso;
        double cambio;
        int opcionConvertir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opción a convertir:" +
                " 1) Peso argentino a dolar. | 2) Peso argentino a euro. | 3) Peso argentino a Libra." +
                " | 4) Peso argentino a yenes. | 5) Peso argentino a won surcoreano. | 6 Dolar a peso argentino." +
                " | 7) Euro a peso argentino. | 8) Libra a peso argentino. | 9) Yenes a peso argentino." +
                " | 0) Won surcoreano a peso argentino. | Para salir, ingrese dos números cualquiera. "));
        switch (opcionConvertir) {
            case 1:
                proceso = 1;
                cambio = 1 / 263.30;
                break;
            case 2:
                proceso = 2;
                cambio = 1 / 289.40;
                break;
            case 3:
                proceso = 3;
                cambio = 1 / 339.50;
                break;
            case 4:
                proceso = 4;
                cambio = 1 / 1.87;
                break;
            case 5:
                proceso = 5;
                cambio = 1 / 0.20;
                break;
            case 6:
                proceso = 6;
                cambio = 263.30;
                break;
            case 7:
                proceso = 7;
                cambio = 289.40;
                break;
            case 8:
                proceso = 8;
                cambio = 339.50;
                break;
            case 9:
                proceso = 9;
                cambio = 1.87;
                break;
            case 0:
                proceso = 0;
                cambio = 0.20;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro programa.");
                return null;
        }
        return new ConversorMonedas(proceso, cambio);
    }

        private void convertirMoneda(ConversorMonedas cm, double valor){
            double resultado = valor * cm.getCambio();
            switch(cm.getProceso()){
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

