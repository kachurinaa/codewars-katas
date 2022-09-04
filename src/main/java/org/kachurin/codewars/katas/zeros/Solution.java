package org.kachurin.codewars.katas.zeros;

/**
 * https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java
 *
 * https://mathworld.wolfram.com/Factorial.html
 */
public class Solution {
    public static int zeros(int n) {
        if (n < 5) {
            return 0;
        }
        int kmax = (int) Math.floor(Math.log(n) / Math.log(5));
        int zerosAmount = 0;
        for (int k = 1; k <= kmax; k++) {
            zerosAmount += n / Math.pow(5, k);
        }
        return zerosAmount;
    }
}
