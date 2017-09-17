/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muc.jtm.algoarch.treetraversal.impl;

import de.muc.jtm.algoarch.treetraversal.Iterator;
import de.muc.jtm.algoarch.treetraversal.Node;

/**
 *
 * @author Jochen Morent
 */
public class DepthFirstSearchPreRecursive extends Iterator {
    
    @Override
    protected void iterate(Node node, StringBuilder out) {
        if (node == null) {
            return;
        }
        
        out.append(node.getValue()).append(',').append(' ');
        
        node.getChildren().forEach((child) -> {
            iterate(child, out);
        });
    }
}
