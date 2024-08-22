package com.osxm.test.cov;
public class LineInstructionDiff {
    public int exampleMethod(int a,int b) {   
        int sum = a + b; 
        if (sum > 10) { 
            sum -= 1; 
        } 
        return sum;       
    }
}