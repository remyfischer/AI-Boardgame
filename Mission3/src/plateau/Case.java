/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plateau;

/**
 *
 * @author remyf
 */
public class Case {
    
    private int posX;
    private int posY;
    private boolean isFree;
    private String value;
    
    public Case(){
        
        this.posX = -1;
        this.posY = -1;
        this.isFree = false;
        this.value = "";
        
    }
    
    public Case(int _posX, int _posY, boolean _isFree, String _value){
        
        this.posX = _posX;
        this.posY = _posY;
        this.isFree = _isFree;
        this.value = _value;
        
    }
    
    public int getPosX(){
        
        return posX;
        
    }
    
    public int getPosY(){
        
        return posY;
        
    }
    
    public boolean getIsFree(){
        
        return isFree;
        
    }
    
    public String getValue(){
        
        return value;
        
    }
    
    public void setPosX(int _posX){
        
        this.posX = _posX;
        
    }
    
    public void setPosY(int _posY){
        
        this.posY = _posY;
        
    }
    
    public void setIsFree(boolean _isFree){
        
        this.isFree = _isFree;
        
    }
    
    public void setValue(String _value){
        
        this.value = _value;
        
    }
    
}
