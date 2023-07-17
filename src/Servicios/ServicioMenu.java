package Servicios;
import javax.swing.*;

public class ServicioMenu {
    public static void inicializarMenu() {
        String eleccionMenu = "";
        do {
            String[] opcionMenu = {"Moneda.", "Temperatura.", "Distancia.", "Peso.", "Salir."};

            Object opcionSeleccionada =
                    JOptionPane.showInputDialog(
                    null,
                    "¿Qué tipo de cambio desea consultar?",
                    "Elija entre las opciones",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcionMenu,
                    opcionMenu[0]
            );

            if (opcionSeleccionada != null){ eleccionMenu = (String) opcionSeleccionada; }
            else { eleccionMenu = "Salir."; }

            switch (eleccionMenu) {
                case "Moneda.":
                    ServicioConversorMonedas scm = new ServicioConversorMonedas();
                    scm.realizarConversion();
                    break;
                 case "Temperatura.":
                     ServicioConversorTemperatura sct = new ServicioConversorTemperatura();
                     sct.realizarConversion();
                     break;
                     case "Distancia.":
            ServicioConversorDistancia scd = new ServicioConversorDistancia();
            scd.realizarConversion();
            break;
        case "Peso.":
            ServicioConversorPeso scp = new ServicioConversorPeso();
            scp.realizarConversion();
            break;
                case "Salir.":
                    JOptionPane.showMessageDialog(null, "Que tengas un buen día.");
                    break;
            }
        } while (!eleccionMenu.equals("Salir."));
    }
}

