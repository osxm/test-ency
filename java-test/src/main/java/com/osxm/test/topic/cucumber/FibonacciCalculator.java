/**
 * Description:
 * Author: XM
 * Date: 2024-02-16
 */
package com.osxm.test.topic.cucumber;

public class FibonacciCalculator {

    public int calculate(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculate(n - 1) + calculate(n - 2);
        }
    }
}
