/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muc.jtm.algoarch.treetraversal;

import de.muc.jtm.algoarch.treetraversal.impl.BreadthFirstSearchIterative;
import de.muc.jtm.algoarch.treetraversal.impl.DepthFirstSearchPostIterative;
import de.muc.jtm.algoarch.treetraversal.impl.DepthFirstSearchPostRecursive;
import de.muc.jtm.algoarch.treetraversal.impl.DepthFirstSearchPreIterative;
import de.muc.jtm.algoarch.treetraversal.impl.DepthFirstSearchPreRecursive;

/**
 *
 * @author Jochen Morent
 */
public class IteratorFactory {
    public static Iterator createIterator(IteratorType type) {
        switch (type) {
            case BFS_ITERATIVE:
                return new BreadthFirstSearchIterative();
            case DFS_PRE_ITERATIVE:
                return new DepthFirstSearchPreIterative();
            case DFS_PRE_RECURSIVE:
                return new DepthFirstSearchPreRecursive();
            case DFS_POST_ITERATIVE:
                return new DepthFirstSearchPostIterative();
            case DFS_POST_RECURSIVE:
                return new DepthFirstSearchPostRecursive();
        }
        
        return null;
    }
}
