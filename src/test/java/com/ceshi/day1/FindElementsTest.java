package com.ceshi.day1;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by ASUS on 2018/7/27.
 */
public class FindElementsTest {
    WebDriver webDriver;
    @BeforeMethod
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","F:\\ceshikaifa\\IDEA16.2\\worklocation\\drives\\chromedriver.exe");
        //实例化chromeDriver
        webDriver= new ChromeDriver();
    }
    /**
     * 打开百度页面
     * 定位搜索文本框
     */
    @Test
    public void byIDTest(){
        webDriver.get("https://www.baidu.com/");
        WebElement webField = webDriver.findElement(By.id("css_index"));

    }
    @AfterMethod
    public void closeBrower(){
        webDriver.quit();
    }
}
