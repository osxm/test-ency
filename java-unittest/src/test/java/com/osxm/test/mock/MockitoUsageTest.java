/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2024-12-01
 * Author: XM
 */
package com.osxm.test.mock;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockitoUsageTest {

    @Mock
    private List<String> mockedList;

    @Test
    public void objectMock() {
        when(mockedList.get(0)).thenReturn("first");
        mockedList.get(0);
        verify(mockedList).get(0); 
    }
}
