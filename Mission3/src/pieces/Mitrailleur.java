/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pieces;

import java.util.ArrayList;
import java.util.List;
import plateau.Case;

/**
 *
 * @author remyf
 */
public class Mitrailleur implements Piece {
    
     private List<Integer> champAttaque = new ArrayList<>();
    private List<Integer> champDeplacement = new ArrayList<>();
    
    public Mitrailleur(){
        
        this.initChampAttaque();
        this.initChampDeplacement();
        
    }
    
    public void initChampDeplacement(){
        
        for(int i = 0 ; i < 9 ; i++){
            
            this.champDeplacement.add(1);
            
        }
        
    }
    
    public void initChampAttaque(){
        
        //on considère que la pièce se trouve à la ligne N
        
        //ligne N+3
        this.champAttaque.add(0);
        this.champAttaque.add(0);
        this.champAttaque.add(1);
        this.champAttaque.add(0);
        this.champAttaque.add(0);
        
        //ligne N+2
        this.champAttaque.add(0);
        this.champAttaque.add(0);
        this.champAttaque.add(1);
        this.champAttaque.add(0);
        this.champAttaque.add(0);
        
        //ligne N+1
        this.champAttaque.add(1);
        this.champAttaque.add(1);
        //position de la pièce
        this.champAttaque.add(0);
        this.champAttaque.add(1);
        this.champAttaque.add(1);
        
        //ligne N
        this.champAttaque.add(0);
        this.champAttaque.add(1);
        this.champAttaque.add(1);
        this.champAttaque.add(1);
        this.champAttaque.add(0);
        
    }
        
        

        
    @Override
    public void attaque(Case _caseAttaque){


    }

    public List<Integer> getChampDeplacement(){

        return champDeplacement;

    }
    
    public void setChampDeplacement(List<Integer> _champDeplacement){
        
        this.champDeplacement = _champDeplacement;
        
    }

    @Override
    public void deplacement(Case _caseDeplacement){



    }
    
    public List<Integer> getChampAttaque(){
        
        return champAttaque;
        
    }
    
    public void setChampAttaque(List<Integer> _champAttaque){
        
        this.champAttaque = _champAttaque;
        
    }
    
}
