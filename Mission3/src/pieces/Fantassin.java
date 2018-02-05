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
public class Fantassin implements Piece {
    
    private List<Integer> champAttaque = new ArrayList<>();
    private List<Integer> champDeplacement = new ArrayList<>();
    
    public Fantassin(){
        
        this.initChampAttaque();
        this.initChampDeplacement();
        
    }
    
    public void initChampDeplacement(){
        
        //on considère que la pièce se trouve à la ligne N
        
        //ligne N+2
        this.champDeplacement.add(1);
        this.champDeplacement.add(0);
        this.champDeplacement.add(1);
        this.champDeplacement.add(0);
        this.champDeplacement.add(1);
        
        //ligne N+1
        this.champDeplacement.add(0);
        this.champDeplacement.add(1);
        this.champDeplacement.add(1);
        this.champDeplacement.add(1);
        this.champDeplacement.add(0);
        
        //ligne N
        this.champDeplacement.add(1);
        this.champDeplacement.add(1);
        //position de la pièce
        this.champDeplacement.add(0);
        this.champDeplacement.add(1);
        this.champDeplacement.add(1);
        
        //ligne N-1
        this.champDeplacement.add(0);
        this.champDeplacement.add(1);
        this.champDeplacement.add(1);
        this.champDeplacement.add(1);
        this.champDeplacement.add(0);
        
        //ligne N-2
        this.champDeplacement.add(1);
        this.champDeplacement.add(0);
        this.champDeplacement.add(1);
        this.champDeplacement.add(0);
        this.champDeplacement.add(1);
        
    }
    
    public void initChampAttaque(){
        
        //on considère que la pièce se trouve à la ligne N
        
        //ligne N+1
        this.champAttaque.add(0);
        this.champAttaque.add(1);
        this.champAttaque.add(0);

        //ligne N
        this.champAttaque.add(1);
        //position de la pièce
        this.champAttaque.add(0);
        this.champAttaque.add(1);
        
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
