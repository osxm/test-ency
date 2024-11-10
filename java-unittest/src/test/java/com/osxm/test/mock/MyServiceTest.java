/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2024-11-10
 * Author: XM
 */
package com.osxm.test.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MyServiceTest {

    @Mock
    private MyDependency myDependency; // 创建一个模拟对象

    @InjectMocks
    private MyService myService; // 创建一个被测试对象，并注入模拟对象

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // 初始化模拟对象
    }

    @Test
    void testMyServiceMethod() {
        // 设置模拟对象的行为
        when(myDependency.getData()).thenReturn("mocked data");
 
        // 调用被测试对象的方法
        String result = myService.myServiceMethod();
 
        // 验证结果
        assertEquals("processed mocked data", result);
 
        // 验证模拟对象的方法是否被调用
        verify(myDependency).getData();
    }
}
