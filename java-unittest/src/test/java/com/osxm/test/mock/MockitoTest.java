/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2024-12-01
 * Author: XM
 */
package com.osxm.test.mock;

import static org.mockito.Mockito.*; // 导入Mockito的静态方法

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MockitoTest {

    @Test
    public void mockitoDemo() {

        // 创建mock对象
        List mockedList = mock(List.class); // 创建一个List接口的mock对象
        // 或者在Mockito 4.10.0及以上版本中，使用更简洁的方式
        // List mockedList = mock();

        // 使用mock对象，它不会抛出任何“意外交互”异常
        mockedList.add("one");
        mockedList.clear();

        // 选择性、明确且高度可读的验证
        verify(mockedList).add("one"); // 验证mock对象调用了add方法并传入了"one"
        verify(mockedList).clear(); // 验证mock对象调用了clear方法

    }

    @Test
    public void mockMethodCall(){
        // 不仅可以模拟接口，还可以模拟具体类
        LinkedList mockedList = mock(LinkedList.class); // 创建一个LinkedList类的mock对象
        // 或者在Mockito 4.10.0及以上版本中，使用更简洁的方式
        // LinkedList mockedList = mock();

        // 在实际执行之前进行模拟（stubbing）
        when(mockedList.get(0)).thenReturn("first"); // 当调用mockedList的get(0)方法时，返回"first"

        // 以下打印输出为"first"
        System.out.println(mockedList.get(0));

        // 以下打印输出为"null"，因为get(999)方法没有被模拟
        System.out.println(mockedList.get(999));
    }

}
