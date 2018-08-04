package com.ceshi.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by ASUS on 2018/7/26.
 */
public class CloseBrowerTest {
    @Test
    public void closeChrome() throws InterruptedException {
        //设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","F:\\ceshikaifa\\IDEA16.2\\worklocation\\drives\\chromedriver.exe");
        //实例化chromeDriver
        WebDriver webDriver = new ChromeDriver();
        //等待5s
        Thread.sleep(5000);
        //关闭浏览器
        webDriver.quit();
    }
}
