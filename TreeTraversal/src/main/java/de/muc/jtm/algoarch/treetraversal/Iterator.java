/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muc.jtm.algoarch.treetraversal;

/**
 *
 * @author Jochen Morent
 */
public abstract class Iterator {
    protected abstract void iterate(Node node, StringBuilder out);
    
    public String iterate(Node node) {
        StringBuilder out = new StringBuilder();
        
        iterate(node, out);
        out.setLength(out.length()-2);
                
        return out.toString();
    }
}
