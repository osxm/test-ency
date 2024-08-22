package com.osxm.test.cov;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class LineInstructionDiffTest {

    @Test 
    public void exampleMethod(){
        LineInstructionDiff lineInstructionDiff = new LineInstructionDiff();  
        int result = lineInstructionDiff.exampleMethod(5, 5); // 5 + 5 = 10, should return 10  
        assertEquals(10, result, "The sum should be 10 when a and b are both 5."); 
    }
}
