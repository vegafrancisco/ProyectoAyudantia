/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ObjetosEquip.*;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.event.AncestorListener;

/**
 *
 * @author Lenovo
 */
public class VentanaLuchadores extends JFrame implements ActionListener {

    luchador lucha = new luchador();
    protected JPanel Ventana1;
    protected JButton Crear;
    protected JTextArea Luchadores;
    protected JLabel Jugadores;

    public VentanaLuchadores() {
        super();
this.setLayout(new FlowLayout());
        InventarioLuchadores inv = new InventarioLuchadores();

        this.setSize(500, 500);
        this.setLocation(100, 100);
        

        Crear = new JButton();
        Crear.setBounds(200, 10, 25, 25);
        

        Luchadores = new JTextArea();
        Luchadores.setBounds(20,50,100,1054560);
        
       
        this.add(Luchadores);
        nombres();
//        
//        
//        

    }

    private void nombres() {
        Luchadores.setText("Nombre :" + lucha.nombre(lucha.nombres()) + "\n"
                + "Nombre :" + lucha.nombre(lucha.nombres()) + "\n"
                + "Nombre :" + lucha.nombre(lucha.nombres()) + "\n"
                + "Nombre :" + lucha.nombre(lucha.nombres()) + "\n"
                + "Nombre :" + lucha.nombre(lucha.nombres()) + "\n"
                + "Nombre :" + lucha.nombre(lucha.nombres()) + "\n");
 Luchadores.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Crear) {

        }
    }
}
