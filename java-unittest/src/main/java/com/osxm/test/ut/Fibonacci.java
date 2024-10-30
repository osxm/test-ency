/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2024-10-30
 * Author: XM
 */

package com.osxm.test.ut;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
