/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2024-12-07
 * Author: XM
 */
package com.osxm.test.mock.usage;

import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ObjectMockTest {
    
    @Test
    public void testMockObject(){
        List<String> mockedList = mock(List.class);
    }
}
