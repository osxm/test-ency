/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2024-11-10
 * Author: XM
 */
package com.osxm.test.mock;

public class MyService {
    private MyDependency myDependency;
 
    // 构造函数注入依赖
    MyService(MyDependency myDependency) {
        this.myDependency = myDependency;
    }
 
    // 被测试的方法
    String myServiceMethod() {
        String data = myDependency.getData();
        return "processed " + data;
    }
}
