/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muc.jtm.algoarch.treetraversal.impl;

import de.muc.jtm.algoarch.treetraversal.Iterator;
import de.muc.jtm.algoarch.treetraversal.Node;
import java.util.LinkedList;

/**
 *
 * @author Jochen Morent
 */
public class BreadthFirstSearchIterative extends Iterator {

    @Override
    protected void iterate(Node node, StringBuilder out) {
        LinkedList<Node> stack = new LinkedList<>();
        
        stack.addLast(node);
        
        while(!stack.isEmpty()) {
            Node currentNode = stack.removeFirst();
            
            stack.addAll(currentNode.getChildren());
            
            out.append(currentNode.getValue()).append(',').append(' ');
        }
    }
}
