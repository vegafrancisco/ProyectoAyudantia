package ObjetosEquip;

import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class luchador {

    private int mejorabase;
    private String nombres;
    private String faccion;
    private int hp;
    private int hp1;
    private int ATK;
    private int DEF;
    private int SPD;
    private int estrella;
    Random random = new Random();

    luchador() {
        estadistica();
    }

    private ArrayList<String> nombres() {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("zel");
        nombres.add("pol");
        nombres.add("huub");
        nombres.add("Mangunm");
        nombres.add("Brand");
        nombres.add("xxx0");
        nombres.add("troll");
        nombres.add("Hul");
        nombres.add("Girlx");
        nombres.add("Stuck");
        nombres.add("fin");
        nombres.add("drake");
        nombres.add("zolivan");
        nombres.add("fringa");
        nombres.add("hack");
        return nombres;
    }

    private String nombre(ArrayList<String> nombres) {
        String nombre = nombres.get(random.nextInt(15));

        return nombre;
    }

    private int defectohp() {

        int defecto = (int) (random.nextInt(300) + 200);
        return defecto;
    }

    private int defectoATK() {

        int defecto = (int) (random.nextInt(50) + 20);
        return defecto;
    }

    private int defectoDEF() {

        int defecto = (int) ((random.nextInt(21) + 5));
        return defecto;
    }

    private int defectoSPD() {

        int defecto = (int) (random.nextInt(91) + 10);
        return defecto;
    }

    private int defectoXestrellas(int defecto, int estrella) {
        int total = defecto * this.estrella;
        return total;
    }

    public void estadistica() {
        estrella = star();
        this.hp = defectoXestrellas(defectohp(), estrella);

        this.ATK = defectoXestrellas(defectoATK(), estrella);
        this.DEF = defectoXestrellas(defectoDEF(), estrella);
        this.SPD = defectoXestrellas(defectoSPD(), estrella);
        nombres = nombre(nombres());
        faccion = faccion1(faccion());

    }

    private ArrayList<String> faccion() {
        ArrayList faccion = new ArrayList();
        faccion.add("Fuego");
        faccion.add("Agua");
        faccion.add("Tierra");
        return faccion;
    }

    public String getfaccion() {

        return this.faccion;
    }

    private String faccion1(ArrayList<String> faccion) {
        String faccion1 = faccion.get(random.nextInt(faccion.size()));
        return faccion1;
    }

    public int star() {

        int numeroStar = (int) random.nextInt(100) + 1;

        if (numeroStar > 0 && numeroStar <= 40) {
            estrella = 1;
        } else if ((numeroStar > 40) && (numeroStar <= 70)) {
            estrella = 2;
        } else if (numeroStar > 70 && numeroStar <= 85) {
            estrella = 3;

        } else if (numeroStar > 85 && numeroStar <= 95) {
            estrella = 4;
        } else {
            estrella = 5;
        }
        return this.estrella; // con this o no me toma el numero de la estrella de forma correcta 
    }

    public void MostrarFiltro() {
        System.out.println("" + nombres + " FACCION :" + faccion);
    }

    public void MostrarFiltro2() {
        System.out.println(estrella + " Estrellas  " + nombres);
    }

    public void mostrar() {
        System.out.println(" luchador :" + nombres + "  \t HP : " + hp + " \t Ataque : " + ATK + "\t Defensa : " + DEF + "\t Velocidad " + SPD + "\t Faccion : " + faccion);

    }

}
