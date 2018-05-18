/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosEquip;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Batalla {

    private Monstruo monster;
    private InventarioLuchadores luchadors;
    private Dado dado1;
    private Dado dado2;
    private int dañoLuchadorAumentado;
    private int dañoMonstruoAumentado;
    private double dañoLuchador;
    private double dañoMonstruo;
    private double vidaRestantemonstruo;
    private double ataquemonstruo;
    private int k;

    public Batalla() {
        resta();

        this.monster = new Monstruo();
        this.luchadors = new InventarioLuchadores();
        dañoMonstruo = 1;
        this.ataquemonstruo = monster.getataque();
        this.vidaRestantemonstruo = monster.getVida();
        luchadoresIN();
         k=0;
    }

    private void luchadoresIN() {

//        int numerodeluchadores = (int)Integer.parseInt(JOptionPane.showInputDialog("Numero de luchadores"));
        for (int k = 0; k < 6; k++) {

            this.luchadors.agregarLuchadores();

        }

    }

//    public InventarioLuchadores ordenarLuchadores() {
//        InventarioLuchadores luchadoresOrdenados;
//        luchadoresOrdenados = this.luchadors;
//
//        for (int i = 0; i < luchadoresOrdenados.getLuchadores().size(); i++) {
//
//            for (int j = 0; j < luchadoresOrdenados.getLuchadores().size(); j++) {
//
//                if (luchadoresOrdenados.getLuchadores().get(i).getdefectoSPD() > luchadoresOrdenados.getLuchadores().get(j).getdefectoSPD()) {
//
//                    luchador var = luchadoresOrdenados.getLuchadores().get(i);
//                    luchadoresOrdenados.getLuchadores().set(i, luchadoresOrdenados.getLuchadores().get(j));
//                    luchadoresOrdenados.getLuchadores().set(j, var);
//                }
//            }
//        }
//        return luchadoresOrdenados;
//    }
    private int resta() {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        int a = dado1.lanza_dado(8);
        int b = dado2.lanza_dado(6);
        int resta = a - b;
        if (resta == 0) {
            resta = 1;
        }
        return resta;

    }

    private void estadisticas() {

        int resta = resta();
        if (resta > 0) {
            this.dañoLuchadorAumentado = resta;
            this.dañoMonstruoAumentado = 1;
        } else if (resta < 0) {
            this.dañoLuchadorAumentado = 1;
            this.dañoMonstruoAumentado = Math.abs(resta);

        } else {
            this.dañoLuchadorAumentado = 1;
            this.dañoMonstruoAumentado = 1;
        }

    }

    private int dañoLuchadordado() {
        return this.dañoLuchadorAumentado;
    }

    private int dañoMonstruodados() {
        return this.dañoMonstruoAumentado;
    }

    private void FaccionesDominantes(String faccion, String faccionM) {

        dañoLuchador = 1;

        if (faccion.equals("Fuego")) {
            if (faccionM.equals("Agua")) {
                dañoLuchador = (0.75);
                dañoMonstruo = (1.5);
            } else if (faccionM.equals("Tierra")) {
                dañoLuchador = (1.5);
                dañoMonstruo = (0.75);
            }
            if (faccion.equals("Agua")) {
                if (faccionM.equals("Agua")) {
                    dañoLuchador = (0.75);
                    dañoMonstruo = (1.5);
                } else if (faccionM.equals("Fuego")) {
                    dañoLuchador = (1.5);
                    dañoMonstruo = (0.75);
                }
                if (faccion.equals("Tierra")) {
                    if (faccionM.equals("Fuego")) {
                        dañoLuchador = (0.75);
                        dañoMonstruo = (1.5);
                    } else if (faccionM.equals("Agua")) {
                        dañoLuchador = (1.5);
                        dañoMonstruo = (0.75);
                    }
                }
                if (faccion.equals(faccionM)) {
                    dañoLuchador = 1;
                    dañoMonstruo = 1;
                }
            }
        }
    }

    public double getdañofaccionluchador() {
        return this.dañoLuchador = dañoLuchador;
    }

    public double getdañofaccionMonstruo() {
        return this.dañoMonstruo = dañoMonstruo;
    }

    public double daño(double daño_recibido, double defensa, double vida) {
        if ((daño_recibido - defensa) < 0) {
            return vida;
        } else {
            double vidanueva = vida - (daño_recibido - defensa);
            if (vidanueva <= 0) {
                vidanueva = 0;

            }
            return vidanueva;
        }
    }

    public void pelea(luchador luchador, double vidaluchador) {
      
        double dañoataque;
        
        resta();
        estadisticas();
        FaccionesDominantes(luchador.getfaccion(), monster.ElegirFaccion(monster.facciones()));

        while (vidaluchador > 0 && vidaRestantemonstruo>0) {
              
            if (luchador.getdefectoSPD() > monster.getVelocidad()) {
 String nombre = luchador.nombre(luchador.nombres());
                if (vidaRestantemonstruo > 0) {
                   
                    System.out.println("Turno Luchador :" + nombre);

                    dañoataque = (this.getdañofaccionluchador() * dañoLuchadordado() * luchador.getdefectoATK());
                    System.out.println("Daño ataque luchador :" + (int) dañoataque);

                    System.out.println("Vida monstruo antes del ataque :" + (int) vidaRestantemonstruo);
                    int def = monster.getdefensa();

                    System.out.println("Defensa monster :" + (int) def);
                    vidaRestantemonstruo = daño(dañoataque, def, vidaRestantemonstruo);
                    System.out.println("Vida monstruo despues del ataque " + (int) vidaRestantemonstruo);

                } else {

                    System.out.println("Monstruo Derrotado");

                }
   if (vidaRestantemonstruo>0){
       System.out.println("TURNO MONSTRUO");
                double dañoataquemonster = getdañofaccionMonstruo() * dañoMonstruodados() * ataquemonstruo;
                System.out.println("Ataque Monstruo total :" + (int) dañoataquemonster);
                System.out.println("Vida luchador  " + (int) vidaluchador);
                vidaluchador = daño(dañoataquemonster, luchador.getdefectoDEF(), vidaluchador);
                System.out.println("Vida luchador despues del ataque  " + (int) vidaluchador);
                System.out.println("Vida monstruo al terminar el turno :" + (int) vidaRestantemonstruo);
                if (vidaluchador == 0) {
                    System.out.println("Muerto :" + nombre);
                    System.out.println("");
                    System.out.println("");
                } else {
                    System.out.println("Muerto : Monstruo");
                }
   }
                
            
        }else {

                System.out.println("TURNO MONSTRUO");
                double dañoataquemonster = getdañofaccionMonstruo() * dañoMonstruodados() * ataquemonstruo;
                System.out.println("Ataque Monstruo total :" + (int) dañoataquemonster);
                System.out.println("Vida luchador :" + (int) vidaluchador);
                int defLuchad = luchador.getdefectoDEF();
                System.out.println("Defensa Luchador :" + defLuchad);
                vidaluchador = daño(dañoataquemonster, defLuchad, vidaluchador);
                System.out.println("Vida luchador despues del ataque  :" + (int) vidaluchador);
                System.out.println("Vida monstruo despues de atacar "+(int)vidaRestantemonstruo);
                if (vidaluchador > 0) {
                    String nombre = luchador.nombre(luchador.nombres());

                    System.out.println("Turno Luchador :" + nombre);
                    dañoataque = (this.getdañofaccionluchador() * dañoLuchadordado() * luchador.getdefectoATK());
                    System.out.println("Daño ataque luchador :" + (int) dañoataque);
                    
                    System.out.println("Vida monstruo antes del ataque :" + (int) vidaRestantemonstruo);
                    int def = monster.getdefensa();

                    System.out.println("Defensa monster :" + (int) def);
                    vidaRestantemonstruo = daño(dañoataque, def, vidaRestantemonstruo);
                    System.out.println("Vida monstruo despues del ataque " + (int) vidaRestantemonstruo);
                    if (vidaluchador == 0) {
                        System.out.println("Muerto : " + nombre);
                        System.out.println("");
                        System.out.println("");
                    } else {
                        System.out.println("Muerto : Monstruo");
                    }
                } else {
                    String nombre = luchador.nombre(luchador.nombres());
                    System.out.println("Muerto: " + nombre);
                    System.out.println("");
                }

            }
    }
        
        if(vidaRestantemonstruo<=0 && k==0){
            this.k=10;
            System.out.println("");
             System.out.println("");
           System.out.println("Monstruo derrotado");
       }

}

public void Peleando() {

        for (int i = 0; i < 6; i++) {
            pelea(this.luchadors.getLuchadores().get(i), this.luchadors.getLuchadores().get(i).getdefectohp());
        }
    }

    public static void main(String[] args) {
        Batalla s = new Batalla();

        s.Peleando();

    }
}
