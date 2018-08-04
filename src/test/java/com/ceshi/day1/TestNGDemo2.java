package com.ceshi.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ASUS on 2018/7/25.
 */
public class TestNGDemo2 {
    @Test
    public void assertEqualTest(){
        String a = "qwe";
        String b = "qwe1";
        Assert.assertEquals(a, b);
    }
    @Test
    public void assertNotEqualTest(){
        int a = 1;
        int b = 2;
        Assert.assertNotEquals(a, b, "不相等");
    }
    @Test
    public void assertNotNullTest(){
        String c = "xbc";
        Assert.assertNotNull(c);
    }
    @Test
    public void assertNullTest(){
        String c = null;
        Assert.assertNull(c);
    }
}
