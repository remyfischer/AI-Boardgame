/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pieces;

import plateau.Case;

/**
 *
 * @author remyf
 */
public interface Piece {
    
    public void deplacement(Case _caseDeplacement);
    
    public void attaque(Case _caseAttaque);
    
}
