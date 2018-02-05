/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plateau;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author remyf
 */
public class Plateau {
    
    private List<Case> cases;
    private int longueur;
    private int largeur;
    
    public Plateau(){
        
        this.longueur = 25;
        this.largeur = 25;
        this.cases = new ArrayList<>(this.longueur*this.largeur);
        this.initPlateau(this.cases);
        
    }
    
    public Plateau(int _longueur, int _largeur){
        
        this.longueur = _longueur;
        this.largeur = _largeur;
        this.cases = new ArrayList<>(this.longueur*this.largeur);
        this.initPlateau(this.cases);
        
    }
    
    public void initPlateau(List<Case> _cases){
        
        for(int i = 0 ; i < this.longueur ; i++){
            
            for(int j = 0 ; j < this.largeur ; j++){
                
                cases.add(new Case(i, j, false, ""));
                
            }
            
        }
        
    }
    
    public List<Case> getCases(){
        
        return cases;
        
    }
    
    public int getLongueur(){
        
        return longueur;
        
    }
    
    public int getLargeur(){
        
        return largeur;
        
    }
    
    public void setCases (List<Case> _cases){
        
        this.cases = _cases;
        
    }
    
    public void setLongueur(int _longueur){
        
        this.longueur = _longueur;
        
    }
    
    public void setLargeur(int _largeur){
        
        this.largeur = _largeur;
        
    }
    
    
    
}
