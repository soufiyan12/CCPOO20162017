/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
/**
 *
 * @author soufiyan
 */
public class Magasin {
    /*
    relation entre magasin et article::
    */
    private String nom;
    private int nbMaxArticle;
    static ArrayList<Article> lesArticles=new ArrayList<>();
 public static void main(String args[]){
    //dans quelle classe ajouter ces attributs
    
    
  /*  lesArticles.add(new Article("lg",7000.00));
    lesArticles.add(new Article("samsung",7000.00));
    */
    Magasin m=new Magasin();
    m.ajouterArticle(new Article("lg",7000.00));
     m.ajouterArticle(new Article("samsung",7000.00));
    System.out.println(m.Contains(1));
  //afficher tous les articles existants dans le magasin avec la methodes tostring 
  

    //lesArticles.Contains(1);
      /* if(lesArticles.contains(1))
       {
           System.out.println("exist");
       }
       else
       {
           System.out.println("no exist");
       }*/
  
}

 public void ajouterArticle(Article a){
     lesArticles.add(a);
 }
 
 
 public boolean Contains(int ref){
     for(Article A : lesArticles){
            if (A.getRef()==ref)
                return true;
     }
     
        return false;
              
 }
 
}
