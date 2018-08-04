package com.ceshi.day1;

import org.testng.annotations.*;

/**
 * Created by ASUS on 2018/7/24.
 */
public class TestNGDemo1 {
    @BeforeTest
    public void beforeTest01(){
        System.out.println("这是@BeforeTest注解");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是@BeforeMethod注解");
    }
    @Test
    public void case1(){
        System.out.println("这是@Test注解，case1");
    }
    @Test
    public void case2(){
        System.out.println("这是@Test注解,case2");
    }
    @AfterTest
    public void afterTest1(){
        System.out.println("这是@AfterTest1注解");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是@AfterMethod注解");
    }
}
