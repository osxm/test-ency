/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2024-12-07
 * Author: XM
 */
package com.osxm.test.mock.usage;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ObjectMockByAnnoTest {

    @Mock
    private List<String> mockedList;

    @Test
    public void testMockObject() {
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenReturn("second");
    }
}
