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
public class DepthFirstSearchPostIterative extends Iterator {

    @Override
    protected void iterate(Node node, StringBuilder out) {
        LinkedList<Node> outputStack = new LinkedList<>();
        LinkedList<Node> processingStack = new LinkedList<>();
        
        processingStack.addFirst(node);
        
        while(!processingStack.isEmpty()) {
            Node currentNode = processingStack.removeFirst();
            
            List<Node> children = currentNode.getChildren();
            for (Node child : children) {
                processingStack.addFirst(child);
            }
            
            outputStack.addFirst(currentNode);
        }
        
        while(!outputStack.isEmpty()) {
            Node currentNode = outputStack.removeFirst();
            
            out.append(currentNode.getValue()).append(',').append(' ');
        }
    }
}
