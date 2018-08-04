package com.ceshi.day2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static java.awt.SystemColor.text;

/**
 * Created by ASUS on 2018/7/28.
 */
public class ActionTest {
    WebDriver webDriver;
    @BeforeMethod
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","F:\\ceshikaifa\\IDEA16.2\\worklocation\\drives\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    /**
     * 点击百度首页的新闻连接
     * 打开新闻页面
     */
    @Test
    public void clickTest(){
        webDriver.get("http://www.baidu.com/");
        WebElement webElement = webDriver.findElement(By.name("tj_trnews"));
        webElement.click();
        String url = webDriver.getCurrentUrl();
        Assert.assertEquals(url, "http://news.baidu.com/");
    }

    /**
     * 打开百度首页
     * 输入关键字selenium
     * 点击百度一下进行搜索
     * 校验title是不是对应的值
     */
    @Test
    public void sendKeyTest() throws InterruptedException {
        webDriver.get("http://www.baidu.com/");
        WebElement key = webDriver.findElement(By.id("kw"));
        key.sendKeys("selenium");
        WebElement baiduButton = webDriver.findElement(By.id("su"));
        baiduButton.click();
        Thread.sleep(3000);
        String title = webDriver.getTitle();
        Assert.assertEquals(title, "selenium_百度搜索");
    }
    @Test
    public void clearTest() throws InterruptedException {
        webDriver.get("http://www.baidu.com/");
        WebElement key = webDriver.findElement(By.id("kw"));
        key.sendKeys("selenium");
        Thread.sleep(3000);
        key.clear();
        Thread.sleep(3000);
    }

    /**
     * 打开百度页面
     * 获取文本框的tagname
     * 校验是否为input
     */
    @Test
    public void getTegNameTest(){
        webDriver.get("http://www.baidu.com/");
        String tagName = webDriver.findElement(By.id("kw")).getTagName();
        Assert.assertEquals(tagName, "input");
    }

    /**
     * 打开百度一下
     * 判断按钮显示值是否为：百度一下
     */
    @Test
    public void getText(){
        webDriver.get("http://www.baidu.com/");
        String attributeValue = webDriver.findElement(By.id("su")).getAttribute("value");
        Assert.assertEquals(attributeValue, "百度一下");
    }

    /**
     * 打开百度页面
     * 判断是否显示百度一下按钮
     */
    @Test
    public void isDisplayedTest(){
        webDriver.get("http://www.baidu.com/");
        Boolean b = webDriver.findElement(By.id("su")).isDisplayed();
        Assert.assertTrue(b);
    }
    /**
     * 打开百度页面
     * 截图
     */
    @Test
    public void shotTest(){
        webDriver.get("http://www.baidu.com/");
        File file = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(file, new File("F:\\test1.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @AfterMethod
    public void closeChrome(){
        webDriver.quit();
    }
}
