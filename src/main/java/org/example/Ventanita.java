package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanita {
    private JPanel ventana;
    private JButton button1;
    private JLabel texto;
    private JButton botón2Button;

    public Ventanita() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Pulsado Botón 1");
            }
        });
        botón2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pulsado Botón 2");
            }
        });
    }

    public JPanel getPanel() {
        return ventana;
    }
}
