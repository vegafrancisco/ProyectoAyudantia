
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sun.applet.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class InventarioLuchadores {

    ArrayList<luchador> inventario = new ArrayList<>();

    private void eliminarLuchadores(int Nluchador) {
        inventario.remove(Nluchador);
    }

    private void agregarLuchadores() {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("numero de luchadores"));
        for (int i = 0; i < numero; i++) {
            inventario.add(new luchador());

        }

    }

    private void CantidadDeLuchadores() {
        int cantidad = inventario.size();
        System.out.println("Actualmente tenemos a " + (cantidad) + " luchadores listos para combatir");
    }

    private void mostrar1(int numeroluchador) {

        inventario.get(numeroluchador).mostrar();

    }

    private void mostrarTODOS() {
        System.out.println("");
        for (luchador corre : inventario) {
            corre.mostrar();
        }

        System.out.println("");

    }

    private ArrayList<luchador> filtroFaccion() {

        String faccion = JOptionPane.showInputDialog("Facción a filtrar : .... ej: Agua");
        ArrayList<luchador> filtrofaccion = new ArrayList();
        for (luchador corre : inventario) {
            if (corre.getfaccion().equals(faccion)) {
                filtrofaccion.add(new luchador());
                corre.MostrarFiltro();
            }

        }

        return filtrofaccion;
    }

    private ArrayList<luchador> filtroRango() {

        int rango = Integer.parseInt(JOptionPane.showInputDialog("Numero de estrellas"));
        ArrayList<luchador> filtroRango = new ArrayList();
        for (luchador corre : inventario) {

            if (corre.star() == rango) {
                filtroRango.add(new luchador());
                corre.MostrarFiltro2();
            }

        }

        return filtroRango;
    }

//    private void mostrarfiltro(ArrayList<luchador> filtrofaccion) {
//        for (luchador object : filtrofaccion) {
//            object.mostrar();
//        }
//    }
    public static void main(String[] args) {
        InventarioLuchadores invent=new InventarioLuchadores();
        ObjetoEquipable ob=new ObjetoEquipable();
      
    }

}
