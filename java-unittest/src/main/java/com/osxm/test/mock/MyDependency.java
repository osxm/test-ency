/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2024-11-10
 * Author: XM
 */
package com.osxm.test.mock;

public class MyDependency {
    String getData() {
        // 真实实现，但在测试中会被模拟
        return "real data";
    }
}
