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
    private String faccionM;
    private ObjetoEquipable objetodrop;

    public Monstruo() {
        this.atk = getataque();
        this.DEF = getdefensa();
        this.SPD = getVelocidad();
        this.HP = getVida();
        this.faccionM = ElegirFaccion(facciones());
         this.objetodrop=getObjdrop();
    }
    Random random = new Random();

    public int getataque() {
        return this.atk = (int) (random.nextInt(500) + 1000);

    }

    public void setataque(int atk) {
        this.atk = atk;
    }

    public int getdefensa() {
        return this.DEF = (int) (random.nextInt(20) + 5);

    }

    public int getVida() {
        return this.HP = (int) (random.nextInt(500) + 3500);

    }

    public int getVelocidad() {
        return this.SPD = (int) (random.nextInt(90) + 10);

    }

    ArrayList<String> facciones() {
        ArrayList facciones = new ArrayList();
        facciones.add("Fuego");
        facciones.add("Agua");
        facciones.add("Tierra");
        return facciones;
    }
    
    public String ElegirFaccion(ArrayList<String> facciones) {
        faccionM = facciones.get(random.nextInt(facciones.size()));

        return this.faccionM;
    }

    public void MostrarCaracteristicasMostruo() {

        System.out.println(" Monstruo HP : " + HP + " \t Ataque : " + atk + "\t Defensa : " + DEF + "\t Velocidad " + SPD + "\t Monstruo tipo : " + faccionM);
        System.out.println("");
    }

    private void setObjdrop(ObjetoEquipable objetodrop) {
        this.objetodrop = objetodrop;
    }

    private ObjetoEquipable getObjdrop() {
        this.objetodrop = objetodrop;
        return this.objetodrop;
    }

    public void crearObjetoDropeable() {

        objetodrop = new ObjetoEquipable();
      
        System.out.println("Posible drop :");
        objetodrop.MostrarObjeto();

    }

    public static void main(String[] args) {
        Monstruo monster = new Monstruo();
        monster.MostrarCaracteristicasMostruo();
        monster.crearObjetoDropeable();

    }
}
