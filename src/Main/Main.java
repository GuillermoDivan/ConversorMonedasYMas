/*crear un conversor de divisas utilizando el lenguaje Java. Las características solicitadas
 por nuestro cliente son las siguientes:
 Menú interactivo donde seleccione qué quiere convertir / salir, cuánta cantidad y de qué a qué.
 A. Convertir el peso nacional a dólares, euros, libras, yenes, won sul-coreano y viceversa.
 B. Conversor de temperatura: Grados centígrados a farhenheit y viceversa.
 C. Conversor de distancia: sistema métrico a imperial.
 D. Conversor de peso: sistema de kilaje a libras.

 Para ayudarte a realizar esta actividad te recomendamos leer la documentación oficial de la
 clase JOptionPane, aquí puedes ver diferentes ejemplos de uso de métodos incluyendo
 showMessageDialog.
* */

package Main;

import Servicios.ServicioConversorMonedas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ServicioConversorMonedas scm = new ServicioConversorMonedas();
        int opcion1;
        do {
            opcion1 = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea convertir? " +
                    "1) Moneda | 2) Temperatura. | 3) Distancia. | 4) Peso. | 5) Salir. "));
            switch (opcion1) {
                case 1:
                    scm.realizarConversion();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Que tengas un buen día."); break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Ingrese otro número.");
            }
        } while(opcion1 != 5) ;
    }
}
