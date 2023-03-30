package ico.fesAragon;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int opcion_menu = -1;
        String[] botones = { "1. Ver gatos", "2. Ver favoritos" , "3. Salir" };

        do {
            //Menu principal
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos Java", "Menu principal", JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);


            //Validamos que opción selecciona el usuario
            for (int i = 0; i < botones.length; i++) {
                if(opcion.equals(botones[i])) {
                    opcion_menu = i;
                }
            }

            switch (opcion_menu){
                case 0:
                    try {
                        GatosService.verGatos();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 1:
                    Gatos gato = new Gatos();
                    GatosService.verFavoritos(gato.apiKey);
                default:
                    break;
            }
        } while (opcion_menu != 1);
    }
}