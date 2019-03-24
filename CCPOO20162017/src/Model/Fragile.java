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
public class Fragile extends Article{
    protected String emballage;
    
    public Fragile(String nom, double prixHT) {
        super(nom, prixHT);
    }

    public Fragile(String emballage, String nom, double prixHT) {
        super(nom, prixHT);
        this.emballage = emballage;
    }

    @Override
    public double prixTransport() {
        return (super.prixTransport())*2; //To change body of generated methods, choose Tools | Templates.
    }

}
