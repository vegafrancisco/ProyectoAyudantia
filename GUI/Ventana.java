/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JFrame;
import ObjetosEquip.*;
import java.awt.FlowLayout;

import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class Ventana extends JFrame implements ActionListener {

    protected JButton VerPersonajes;
    protected JPanel Ventana1;
    protected JTextArea Luchadores;
    private InventarioLuchadores luchadores;
    VentanaLuchadores ventanaluchadores;

    public Ventana(String Title) {

        this.setLayout(new FlowLayout());
        VerPersonajes = new JButton("Ver Luchadores");
        Ventana1 = new JPanel();
        ventanaluchadores = new VentanaLuchadores();
//        Dados.addActionListener(this);
        Ventana1.add(VerPersonajes);
        VerPersonajes.addActionListener(this);
        this.add(VerPersonajes);
        this.add(Ventana1);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VerPersonajes) {

            ventanaluchadores.setVisible(true);

        }
    }

}
