package com.osxm.test.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyJunitTest {


    @Test
    public void method(){
        int total, a=2,b=3;
        total = a+b;
        Assertions.assertEquals(5, total);
        System.out.println("Hello, 测试输出");
    }
}
