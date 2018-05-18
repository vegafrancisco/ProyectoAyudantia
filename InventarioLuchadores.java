package ObjetosEquip;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class InventarioLuchadores extends luchador{
 
    ArrayList<luchador> inventario = new ArrayList<>();

    public ArrayList<luchador> getLuchadores() {
        return inventario;
    }

    public void setLuchadores(ArrayList<luchador> inventario) {
        this.inventario = inventario;
    }
    
    private void eliminarLuchadores(int Nluchador) {
        inventario.remove(Nluchador);
    }

    public void agregarLuchadores() {
    
//      int numero = Integer.parseInt(JOptionPane.showInputDialog("numero de luchadores"));
//      for (int i = 0; i < numero; i++) {
  if(inventario.size()<25){
            inventario.add(new luchador());

//      }
  }
    }

   public  int CantidadDeLuchadores() {
        int cantidad = inventario.size();
        
     return this.inventario.size();
   }

    private void mostrar1(int numeroluchador) {

        inventario.get(numeroluchador).mostrar();

    }

   public void mostrarTODOS() {

        for (luchador corre : inventario) {
            corre.mostrar();
        }

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
        InventarioLuchadores invent = new InventarioLuchadores();
        
     
        invent.agregarLuchadores();
        invent.mostrarTODOS();
        
        System.out.println("");
    }
    

}
