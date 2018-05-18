/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosEquip;

/**
 *
 * @author Lenovo
 */
public class Dado {

    private int cara;
    private int numero;

    public Dado() {
        lanza_dado(cara);
    }

    public int getCara() {
        return cara;
    }

    public void setCara(int cara) {
        this.cara = cara;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int lanza_dado(int cara) {
        this.cara = cara;
        numero = (int)(Math.random()*cara);
        if (numero==1){
            return numero=numero+1;
        }else{
           return numero; 
        }
        
    }
   
}
