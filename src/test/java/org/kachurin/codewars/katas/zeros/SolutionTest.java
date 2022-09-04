package org.kachurin.codewars.katas.zeros;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void zerosTest() {
        Assertions.assertEquals(0, Solution.zeros(0));
        Assertions.assertEquals(0 ,Solution.zeros(4));
        Assertions.assertEquals(1, Solution.zeros(6));
        Assertions.assertEquals(2, Solution.zeros(14));
        Assertions.assertEquals(2, Solution.zeros(12));
    }
}