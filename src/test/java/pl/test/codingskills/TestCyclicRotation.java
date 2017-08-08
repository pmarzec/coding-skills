/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.test.codingskills;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.home.codingskills.CyclicRotation;

/**
 *
 * @author pmarzec
 */
public class TestCyclicRotation {
    
    private CyclicRotation cyclicRotation;
    
    @Before
    public void setUp() {
        cyclicRotation = new CyclicRotation();
    }
    
    @Test
    public void testSolutionNullArray() {
        // given
        int[] givenArr = null;
        int count = 1;
        
        // when
        int[] actualArr = cyclicRotation.solution(givenArr, count);
        
        // then
        int[] expectedArr = null;
        Assert.assertArrayEquals(expectedArr, actualArr);
    }
        @Test
    public void testSolutionEmptyArray() {
        // given
        int[] givenArr = {};
        int count = 1;
        
        // when
        int[] actualArr = cyclicRotation.solution(givenArr, count);
        
        // then
        int[] expectedArr = {};
        Assert.assertArrayEquals(expectedArr, actualArr);
    }
    
    @Test
    public void testSolutionNoRotation() {
        // given
        int[] givenArr = {3, 8, 9, 7, 6};
        int count = 0;
        
        // when
        int[] actualArr = cyclicRotation.solution(givenArr, count);
        
        // then
        int[] expectedArr = {3, 8, 9, 7, 6};
        Assert.assertArrayEquals(expectedArr, actualArr);
    }
    
    @Test
    public void testSolutionOneRotate() {
        // given
        int[] givenArr = {3, 8, 9, 7, 6};
        int count = 1;
        
        // when
        int[] actualArr = cyclicRotation.solution(givenArr, count);
        
        // then
        int[] expectedArr = {6, 3, 8, 9, 7};
        Assert.assertArrayEquals(expectedArr, actualArr);
    }
    
    @Test
    public void testSolution() {
        // given
        int[] givenArr = {3, 8, 9, 7, 6};
        int count = 3;
        
        // when
        int[] actualArr = cyclicRotation.solution(givenArr, count);
        
        // then
        int[] expectedArr = {9, 7, 6, 3, 8};
        Assert.assertArrayEquals(expectedArr, actualArr);
    }
}
