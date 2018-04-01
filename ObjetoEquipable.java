
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
public class ObjetoEquipable {
 private int mejoraTotal;
    private int caracterisitca;
    private int mejoraBase;
    private int estrellas;
  
    Random random = new Random();

    
    public ObjetoEquipable(){
     estadisticas();
 }
    private int  mejoraBase() {
        mejoraBase = random.nextInt(9)+1;
  return this.mejoraBase;
    }

    private int rango() {
        int estrellas=0;
        int rango = random.nextInt(100) + 1;
        if (rango < 20) {
            estrellas = 1;
        } else if (rango > 20 && rango <= 40) {
            estrellas = 2;
        } else if (rango > 40 && rango <= 60) {
            estrellas = 3;
        } else if (rango > 60 && rango <= 75) {
            estrellas = 4;
        } else if (rango > 75 && rango <= 85) {
            estrellas = 5;
        } else if (rango > 85 && rango <= 90) {
            estrellas = 6;
        } else if (rango > 90 && rango <= 94) {
            estrellas = 7;
        } else if (rango > 94 && rango <= 97) {
            estrellas = 8;
        } else if (rango > 97 && rango <= 99) {
            estrellas = 9;
        } else {
            estrellas = 10;
        }
        this.estrellas=estrellas;
        return estrellas
                ;
    }
public void estadisticas(){
   
    mejoraTotal=mejoraTotal(mejoraBase(),rango());
    
   
}

    private int mejoraTotal(int mejoraBase,int estrellas) {
       int mejora=mejoraBase*estrellas;
        return mejora;
    }
}
