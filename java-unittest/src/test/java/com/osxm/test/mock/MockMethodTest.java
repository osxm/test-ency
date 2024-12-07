/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2024-12-07
 * Author: XM
 */
package com.osxm.test.mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MockMethodTest {
    
    @Test
    public void objectMock() {
        List<String> mockedList = mock(List.class); // 创建一个List接口的mock对象
        when(mockedList.get(0)).thenReturn("first");
        mockedList.get(0);
        verify(mockedList).get(0); 
    }
}
