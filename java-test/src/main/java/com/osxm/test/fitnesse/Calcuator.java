package com.osxm.test.fitnesse;

public class Calcuator {

    private int iFirst, iSecond;

    public void setIFirst(int iFirst) {
        this.iFirst = iFirst;
    }

    public void setISecond(int iSecond) {
        this.iSecond = iSecond;
    }

    public int addition() {
        return iFirst + iSecond;
    }

    public int multiply() {
        return iFirst * iSecond;
    }
}
