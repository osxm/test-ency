/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2024-10-30
 * Author: XM
 */

package com.osxm.test.ut;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci_bound() {
        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testFibonacci() {
        assertEquals(1, Fibonacci.fibonacci(2));  
        assertEquals(2, Fibonacci.fibonacci(3));  
        assertEquals(3, Fibonacci.fibonacci(4));  
        assertEquals(5, Fibonacci.fibonacci(5));  
        assertEquals(8, Fibonacci.fibonacci(6));  
        assertEquals(13, Fibonacci.fibonacci(7));  
    }
}
