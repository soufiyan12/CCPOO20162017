/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author soufiyan
 */
public class Article {
    protected static int code=1;
    protected String nom;
    protected  int ref;
    protected double prixHT;

    public Article(String nom, double prixHT) {
        this.nom = nom;
        this.prixHT = prixHT;
        ref=code;
        code++;
    }
    public double prixTransport(){
        return prixHT*0.05;
    }
    public String toString(){
        return this.code+" "+this.nom ;
    }

    public int getRef() {
        return ref;
    }
    
   /*
    public boolean equals(Object obj)
    {
        if(obj instanceof Article) return ((Article) obj).reff==this.reff;
        return false;
    }
*/
}
