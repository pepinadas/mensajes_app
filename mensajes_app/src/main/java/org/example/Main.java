package org.example;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("--------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1.- Crear mensaje");
            System.out.println("2.- Listar mensajes");
            System.out.println("3.- Editar mensajes");
            System.out.println("4.- Eliminar mensajes");
            System.out.println("5.- Salir");
            //Leemos la opción del usuario
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    serviciosMensaje.crearMensaje();
                    break;
                case 2:
                    serviciosMensaje.listarMensajes();
                    break;
                case 3:
                    serviciosMensaje.editarMensaje();
                    break;
                case 4:
                    serviciosMensaje.borrarMensaje();
                    break;
                default:
                    break;
            }


        }while (opcion != 5);

    }
}