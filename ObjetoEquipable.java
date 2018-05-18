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
public class ObjetoEquipable {

    private int mejoraTotal;
    private String Caracteristicas;
    private int mejoraBase;
    private int estrellas;
    private String NombreObj;
    private luchador Luchador;
    Random random = new Random();

    public ObjetoEquipable() {
        
       this.estrellas=rango();
       
        this.mejoraTotal = getmejoraBase()*estrellas;
        this.NombreObj = ElegirObj(NombreObjetos(), CantidadObjetos());
        this.Caracteristicas=Elegircaracteristica(Caracteristicas());

    }

    private ArrayList<String> NombreObjetos() {
        ArrayList<String> NombreObj = new ArrayList<>();
        NombreObj.add("Botas");
        NombreObj.add("Armadura");
        NombreObj.add("Escudo");
        NombreObj.add("Arma");

        return NombreObj;

    }
    public ArrayList<String>Caracteristicas (){
        ArrayList<String>caracteristicas=new ArrayList<>();
        caracteristicas.add("ATK");
        caracteristicas.add("DEF");
        caracteristicas.add("HP");
        caracteristicas.add("SPD");
        return caracteristicas;
    }
    public String Elegircaracteristica(ArrayList<String>caracteristicas){
        
        
    return Caracteristicas=caracteristicas.get(random.nextInt(3));
    
    }
    

    private int CantidadObjetos() {
        int Cantidad = NombreObjetos().size();
        return Cantidad;
    }

   private int getmejoraBase() {
        mejoraBase = random.nextInt(9) + 1;
        return this.mejoraBase;
    }
   private void setmejoraBase(int mejoraBase){
       this.mejoraBase=mejoraBase;
   }

    private int rango() {
        
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
        
        return this.estrellas;
    }
    public int getObtenerRango(){
        return this.estrellas;
    }

    public void MostrarObjeto() {
//publico para llamar el metodo en otra clase para no crear otro igual 
        System.out.println("Objeto " + NombreObj + "\t Mejora base:" + mejoraBase + "\t Rango:"+estrellas+"\t Mejora Total: ++"+mejoraTotal+" "+Caracteristicas);
    }
    public void MostrarRango(){
        System.out.println(""+NombreObj+"\tEstrellas :"+estrellas);
    }
    public void setmejoraTotal(int mejoraTotal){
        this.mejoraTotal=mejoraTotal;
    }
    public int getmejoraTotal() {
        this.mejoraTotal=mejoraTotal;
        
        return this.mejoraTotal;
    }
    

    private String ElegirObj(ArrayList<String> NombresObj, int Objetoscantidad) {

        String nombre = NombresObj.get(random.nextInt(Objetoscantidad));
        return nombre;
    }
   
    
   
    
         
     
    

}
