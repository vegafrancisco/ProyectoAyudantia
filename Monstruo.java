/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosEquip;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lenovo
 */

public class Monstruo {
    private int atk;
    private int HP;
    private int SPD;
    private int DEF;
    private String faccion;
    
    public Monstruo(){
       crearMonstruo();
    }
    Random random=new Random();
    private int ataque(){
     return this.atk=(int)(random.nextInt(500)+1000);
    
    }
    private int defensa(){
     return this.DEF=(int)(random.nextInt(20)+5);
    
    }
    private int Vida(){
     return this.HP=(int)(random.nextInt(500)+3500);
    
    }
    private int Velocidad(){
     return this.SPD=(int)(random.nextInt(90)+10);
    
    }
    
    private ArrayList<String> facciones() {
        ArrayList facciones = new ArrayList();
        facciones.add("Fuego");
        facciones.add("Agua");
        facciones.add("Tierra");
        return facciones;
    }
    private String ElegirFaccion(ArrayList<String>facciones){
        faccion=facciones.get(random.nextInt(facciones.size()));
    
    return this.faccion;
    }
    public void MostrarCaracteristicasMostruo(){
        
        System.out.println(" Monstruo HP : " + HP + " \t Ataque : " + atk + "\t Defensa : " + DEF + "\t Velocidad " + SPD + "\t Monstruo tipo : " + faccion);
        System.out.println("");
    }
   private void crearMonstruo(){
        this.atk=ataque();
         this.DEF=defensa();
          this.SPD=Velocidad();
           this.HP=Vida();
           this.faccion=ElegirFaccion(facciones());
           
   }
   private void crearObjetoDropeable(){
       ObjetoEquipable objetodrop=new ObjetoEquipable();
       System.out.println("Posible drop :");
       objetodrop.MostrarObjeto();
   }
    public static void main(String[] args) {
        Monstruo monster=new Monstruo();
        monster.MostrarCaracteristicasMostruo();
        monster.crearObjetoDropeable();
    
    }
}
