package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seleccione el sistema operativo: 1. Windows 2. Mac");
        int opcion = scan.nextInt();
        FabricaDialogo fabrica;
        if (opcion == 1) {
            fabrica = new FabricaDialogoWindows();
        } else {
            fabrica = new FabricaDialogoMac();
        }
        Cliente cliente = new Cliente(fabrica);
        cliente.mostrarMensaje();
    }
}
