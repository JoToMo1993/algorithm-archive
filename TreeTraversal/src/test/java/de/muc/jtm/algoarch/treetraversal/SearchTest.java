/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muc.jtm.algoarch.treetraversal;

import java.util.Map;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Jochen Morent
 */
public class SearchTest {
    
    @Test
    public void testSearchOrder() {
        Map<Node, Map<IteratorType, String>> testCases = TestDataGenerator.getTestData();
        
        for (Map.Entry<Node, Map<IteratorType, String>> testCase : testCases.entrySet()) {
            Node tree = testCase.getKey();
            System.out.println("----------------------------------------");
            System.out.println("Testing tree:\n" + tree);
            
            Map<IteratorType, String> types = testCase.getValue();
            
            for (Map.Entry<IteratorType, String> testCaseType : types.entrySet()) {
                IteratorType type = testCaseType.getKey();
                System.out.println("  Type:      " + type);
                String expectedResult = testCaseType.getValue();
                System.out.println("  Traversal: " + expectedResult);
                
                Iterator iter = IteratorFactory.createIterator(type);
                
                String result = iter.iterate(tree);
                
                assertEquals(expectedResult, result);
            }
        }
    }
}
