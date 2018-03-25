/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class luchador_vegaFrancisco {

    String nombre;
    String faccion;
    private int hp;
    int ATK;
    int DEF;
    int SPD;
    int estrellas;
    int ramdom = (int) Math.random();

 
    
  public int defectohp(){
      
      int defecto = (ramdom * 301 + 200);
      return defecto;
  }
  public int defectoATK(){
      
      int defecto = ramdom * 51+20;
      return defecto;
  }
  public int defectoDEF(){
      
      int defecto =  ramdom * 21+5;
      return defecto;
  }
  public int defectoSPD(){
      
      int defecto =  ramdom * 91+10;
      return defecto;
  }
   
  public int defectoXestrellas(int defecto,int estrella){
      int total=defecto*estrella;
      return total;
  }
    public void estadistica(){
        hp= defectoXestrellas(defectohp(),star());
        ATK=defectoXestrellas(defectoATK(), star());
        DEF=defectoXestrellas(defectoDEF(), star());
        SPD=defectoXestrellas(defectoSPD(), star());
    }

    public int star() {
        int estrella;
        int numeroStar = ramdom * 101;
        if (numeroStar > 0 && numeroStar <= 40) {
            estrella = 1;
        } else {
            if (numeroStar > 40 && numeroStar <= 70) {
                estrella = 2;
            } else {
                if (numeroStar > 70 && numeroStar <= 85) {
                    estrella = 3;

                } else {
                    if (numeroStar > 85 && numeroStar <= 95) {
                        estrella = 4;
                    } else {
                        estrella = 5;
                    }
                }
            }
        }
   return estrella; }
    
    
public void mostrar() {
        System.out.println("luchador:" + nombre + " hp:" + hp+"ataque"+ATK+"defensa"+DEF+"Faccion :"+ faccion);
    }
    
    
    
}
