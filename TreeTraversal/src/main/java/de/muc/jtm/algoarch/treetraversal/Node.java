/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muc.jtm.algoarch.treetraversal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jochen Morent
 */
public class Node {
    private final String value;
    private final List<Node> children = new ArrayList<>();
    
    public Node(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    public void addChild(Node child) {
        children.add(child);
    }
    
    public void removeChild(Node child) {
        children.remove(child);
    }
    
    public List<Node> getChildren() {
        return children;
    }
    
    @Override
    public String toString() {
        if (children.isEmpty()) {
            return '[' + value + ']';
        }
        return '[' + value + " -> " + children + ']';
    }
}
