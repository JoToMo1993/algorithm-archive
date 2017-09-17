/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muc.jtm.algoarch.treetraversal.impl;

import de.muc.jtm.algoarch.treetraversal.Iterator;
import de.muc.jtm.algoarch.treetraversal.Node;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jochen Morent
 */
public class DepthFirstSearchPreIterative extends Iterator {

    @Override
    protected void iterate(Node node, StringBuilder out) {
        LinkedList<Node> stack = new LinkedList<>();
        
        stack.addFirst(node);
        
        while(!stack.isEmpty()) {
            Node currentNode = stack.removeFirst();
            
            out.append(currentNode.getValue()).append(',').append(' ');
            
            //Add children in reverse order, so that the first child is on top of the stack.
            List<Node> children = currentNode.getChildren();
            for (int i = children.size()-1; i >= 0; i--) {
                Node child = children.get(i);
                stack.addFirst(child);
            }
        }
    }
}
