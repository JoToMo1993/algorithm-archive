/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muc.jtm.algoarch.treetraversal;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Jochen Morent
 */
public class TestDataGenerator {
    
    public static final Map<Node, Map<IteratorType, String>> getTestData() {
        Map<Node, Map<IteratorType, String>> result = new LinkedHashMap<>();

        //TestCase 1
        Map<IteratorType, String> resultsTC1 = new LinkedHashMap<>();
        for (IteratorType type : IteratorType.values()) {
            resultsTC1.put(type, "1");
        }
        result.put(createTestTree1(), resultsTC1);
        
        //TestCase 2
        Map<IteratorType, String> resultsTC2 = new LinkedHashMap<>();
        resultsTC2.put(IteratorType.BFS_ITERATIVE, "1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d");
        resultsTC2.put(IteratorType.DFS_PRE_ITERATIVE, "1, 2, 5, 6, 7, 3, 8, 9, a, 4, b, c, d");
        resultsTC2.put(IteratorType.DFS_PRE_RECURSIVE, "1, 2, 5, 6, 7, 3, 8, 9, a, 4, b, c, d");
        resultsTC2.put(IteratorType.DFS_POST_ITERATIVE, "5, 6, 7, 2, 8, 9, a, 3, b, c, d, 4, 1");
        resultsTC2.put(IteratorType.DFS_POST_RECURSIVE, "5, 6, 7, 2, 8, 9, a, 3, b, c, d, 4, 1");
        
        result.put(createTestTree2(), resultsTC2);
        
        //TestCase 3
        Map<IteratorType, String> resultsTC3 = new LinkedHashMap<>();
        resultsTC3.put(IteratorType.BFS_ITERATIVE, "1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d");
        resultsTC3.put(IteratorType.DFS_PRE_ITERATIVE, "1, 2, 5, 8, b, c, d, 9, a, 6, 7, 3, 4");
        resultsTC3.put(IteratorType.DFS_PRE_RECURSIVE, "1, 2, 5, 8, b, c, d, 9, a, 6, 7, 3, 4");
        resultsTC3.put(IteratorType.DFS_POST_ITERATIVE, "b, c, d, 8, 9, a, 5, 6, 7, 2, 3, 4, 1");
        resultsTC3.put(IteratorType.DFS_POST_RECURSIVE, "b, c, d, 8, 9, a, 5, 6, 7, 2, 3, 4, 1");
        
        result.put(createTestTree3(), resultsTC3);
        
        return result;
    }
    
    /**
     * @return a single node-tree
     */
    private static Node createTestTree1() {
        return new Node("1");
    }
    
    /**
     * @return 3 level tree, with 3 children each (numbered in top-to-bottom)
     */
    private static Node createTestTree2() {
        Node root = new Node("1");
        
        Node levelTwoChildOne   = new Node("2");
        Node levelTwoChildTwo   = new Node("3");
        Node levelTwoChildThree = new Node("4");
        
        root.addChild(levelTwoChildOne);
        root.addChild(levelTwoChildTwo);
        root.addChild(levelTwoChildThree);
        
        Node levelThreeChildOne   = new Node("5");
        Node levelThreeChildTwo   = new Node("6");
        Node levelThreeChildThree = new Node("7");
        
        levelTwoChildOne.addChild(levelThreeChildOne);
        levelTwoChildOne.addChild(levelThreeChildTwo);
        levelTwoChildOne.addChild(levelThreeChildThree);
        
        Node levelThreeChildFour  = new Node("8");
        Node levelThreeChildFive  = new Node("9");
        Node levelThreeChildSix   = new Node("a");
        
        levelTwoChildTwo.addChild(levelThreeChildFour);
        levelTwoChildTwo.addChild(levelThreeChildFive);
        levelTwoChildTwo.addChild(levelThreeChildSix);
        
        Node levelThreeChildSeven = new Node("b");
        Node levelThreeChildEight = new Node("c");
        Node levelThreeChildNine  = new Node("d");
        
        levelTwoChildThree.addChild(levelThreeChildSeven);
        levelTwoChildThree.addChild(levelThreeChildEight);
        levelTwoChildThree.addChild(levelThreeChildNine);
        
        return root;
    }
    
    /**
     * @return a degenerated tree. (numbered in top-to-bottom)
     * Each level has 3 nodes, all connected to the first node of the layer above.
     */
    private static Node createTestTree3() {
        Node root = new Node("1");
        
        Node levelTwoChildOne   = new Node("2");
        Node levelTwoChildTwo   = new Node("3");
        Node levelTwoChildThree = new Node("4");
        
        root.addChild(levelTwoChildOne);
        root.addChild(levelTwoChildTwo);
        root.addChild(levelTwoChildThree);
        
        Node levelThreeChildOne   = new Node("5");
        Node levelThreeChildTwo   = new Node("6");
        Node levelThreeChildThree = new Node("7");
        
        levelTwoChildOne.addChild(levelThreeChildOne);
        levelTwoChildOne.addChild(levelThreeChildTwo);
        levelTwoChildOne.addChild(levelThreeChildThree);
        
        Node levelFourChildOne   = new Node("8");
        Node levelFourChildTwo   = new Node("9");
        Node levelFourChildThree = new Node("a");
        
        levelThreeChildOne.addChild(levelFourChildOne);
        levelThreeChildOne.addChild(levelFourChildTwo);
        levelThreeChildOne.addChild(levelFourChildThree);
        
        Node levelFiveChildOne   = new Node("b");
        Node levelFiveChildTwo   = new Node("c");
        Node levelFiveChildThree = new Node("d");
        
        levelFourChildOne.addChild(levelFiveChildOne);
        levelFourChildOne.addChild(levelFiveChildTwo);
        levelFourChildOne.addChild(levelFiveChildThree);
        
        return root;
    }
}
