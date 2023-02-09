package org.example;

import javax.swing.*;
import java.awt.*;

class DialogoWindows implements Dialogo {

    private JFrame Main;
    private JPanel Panel;
    @Override
    public void mostrarMensaje() {
        System.out.println("Mostrando mensaje en ventana de Windows");
        render();
    }

    @Override
    public void render() {
        // Renderiza la ventana de Windows
        Main = new JFrame();
        Main.setTitle("Ventana de Windows");
        Main.setSize(500, 500);
        Main.setLocationRelativeTo(null);
        Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main.setVisible(true);

        Panel = new JPanel(new CardLayout());
        Panel.setSize(500, 500);

        IniciarPaneles();
    }

    private void IniciarPaneles(){

        //añadimos ventanita
        Ventanita ventanita = new Ventanita();
        JPanel ventanitaPanel = ventanita.getPanel();

        Panel.add(ventanitaPanel, "Ventanita");

        Main.add(Panel);
        Main.pack();
        Main.setSize(500, 500);
        Main.setResizable(false);
        Main.setVisible(true);


    }
}
