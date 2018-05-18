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
public class InventarioObjetos extends ObjetoEquipable {

    ArrayList<ObjetoEquipable> Objetos = new ArrayList<>();

   
    public void AgregarObjetos() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("numero de Objetos"));
        for (int i = 0; i < numero; i++) {
            Objetos.add(new ObjetoEquipable());
        }
    }

    private void EliminarObjetos() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("numero de objeto a eliminar"));
        Objetos.remove(numero-1);
    }
     private ArrayList<ObjetoEquipable> FiltroRango(){
         
         int rango=Integer.parseInt(JOptionPane.showInputDialog("numero de estrellas a buscar"));
         String Rango=String.valueOf(rango);
         System.out.println("Estos objetos tienen "+rango+ " estrellas");
         ArrayList<ObjetoEquipable>Filtrorango=new ArrayList<>();
         for (ObjetoEquipable objeto : Objetos) {
             if(objeto.getObtenerRango()==rango){
                 Filtrorango.add(new ObjetoEquipable());
                 objeto.MostrarRango();
             }
             
         }
         return Filtrorango;
     }
    private void MostrartodosObj() {
        for (ObjetoEquipable Objeto : Objetos) {
            Objeto.MostrarObjeto();
        }
    }

    public static void main(String[] args) {
        InventarioObjetos invenObj = new InventarioObjetos();
        invenObj.AgregarObjetos();
        invenObj.MostrartodosObj();
        
    }
}
