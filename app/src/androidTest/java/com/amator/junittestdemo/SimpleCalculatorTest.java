package com.amator.junittestdemo;

import android.os.SystemClock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by AmatorLee on 2017/10/26.
 */
public class SimpleCalculatorTest {

    private SimpleCalculator mSimpleCalculator;

    @Before
    public void setUp() throws Exception {
        System.out.print("init");
        mSimpleCalculator = new SimpleCalculator();
    }

    @Test
    public void abs() throws Exception {
        int aks = mSimpleCalculator.abs(-4);
        System.out.print("abs=" + aks);
        Assert.assertEquals(4,aks);
    }

    @Test
    public void sum() throws Exception {
        int aks = mSimpleCalculator.sum(4,6);
        System.out.print("sum=" + aks);
        Assert.assertEquals(10,aks);
    }

    @Test
    public void sub() throws Exception {
        int aks = mSimpleCalculator.sub(4,2);
        System.out.print("sub=" + aks);
        Assert.assertEquals(2,aks);
    }

    @Test
    public void divide() throws Exception {
        int aks = mSimpleCalculator.divide(4,2);
        System.out.print("divide=" + aks);
        Assert.assertEquals(2,aks);
    }

    @Test
    public void mul() throws Exception{
        int aks = mSimpleCalculator.mul(4,2);
        System.out.print("mul=" + aks);
        Assert.assertEquals(8,aks);
    }

}