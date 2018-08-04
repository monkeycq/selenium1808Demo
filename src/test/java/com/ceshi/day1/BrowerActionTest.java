package com.ceshi.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**
 * Created by ASUS on 2018/7/26.
 */
public class BrowerActionTest {
    WebDriver webDriver;
   /**
    * Created by ASUS on 2018/7/26.
    * 打开chrome浏览器
 `   * 打开百度首页
    * 等待5秒
    * 关闭浏览器
    */
    @Test
    public void getTest() throws InterruptedException {
        //打开百度首页
        webDriver.get("https://www.baidu.com");
        //等待5s
        Thread.sleep(5000);
        //关闭浏览器
        webDriver.quit();
    }
    /**
     * Created by ASUS on 2018/7/26.
     * 打开chrome浏览器
     * 打开百度首页
     * 等待5秒
     * 后退
     * 等待3秒
     * 关闭浏览器
     */
    @Test
    public void backTest() throws InterruptedException {
        //打开百度首页
        webDriver.get("https://www.baidu.com");
        //等待5s
        Thread.sleep(5000);
        //后退
        webDriver.navigate().back();
        //等待3秒
        Thread.sleep(3000);
        //关闭浏览器
        webDriver.quit();
    }

    /**
     * Created by ASUS on 2018/7/26.
     * 打开chrome浏览器
     * 打开google页
     * 等待5秒
     * 刷新
     * 等待3秒
     * 前进
     * 等待3秒
     * 关闭浏览器
     */
    @Test
    public void rfreshTest() throws InterruptedException {
        //打开百度首页
        webDriver.get("https://www.google.com.hk/");
        //等待5s
        Thread.sleep(5000);
        //后退
        webDriver.navigate().refresh();
        //等待3秒
        Thread.sleep(3000);
        //前进
        //webDriver.navigate().forward();
        //等待3秒
        //Thread.sleep(3000);
        //关闭浏览器
        webDriver.quit();
    }
    /**
     * Created by ASUS on 2018/7/26.
     * 打开chrome浏览器
     * 打开百度首页
     * 等待5秒
     * 后退
     * 等待3秒
     * 前进
     * 等待3秒
     * 关闭浏览器
     */
    @Test
    public void forwardTest() throws InterruptedException {
        //打开百度首页
        webDriver.get("https://www.baidu.com");
        //等待5s
        Thread.sleep(5000);
        //后退
        webDriver.navigate().back();
        //等待3秒
        Thread.sleep(3000);
        //前进
        webDriver.navigate().forward();
        //等待3秒
        Thread.sleep(3000);
        //关闭浏览器
        webDriver.quit();
    }
    /**
     * 打开chrome浏览器
     * 设置窗口大小 500*500
     * 等待3s
     * 最大化窗口
     * 等待3s
     * 关闭
     */
    @Test
    public void winTest() throws InterruptedException {
        Dimension dimension = new Dimension(500,500);
        webDriver.manage().window().setSize(dimension);
        Thread.sleep(3000);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);
        webDriver.quit();
    }
    /**
     * 打开chrome浏览器
     * 打开百度首页
     * 等待3秒
     * 获取当前页面的RUL
     * 校验当前RUL是不是百度地址
     * 关闭浏览器
     */
    @Test
    public void getURLTest(){
        webDriver.get("https://www.baidu.com");
        String url = webDriver.getCurrentUrl();
        System.out.println("获取到的url是："+url);
        Assert.assertEquals(url,"https://www.baidu.com/" );
        webDriver.quit();
    }
    @AfterMethod
    public void closeBrower(){
        webDriver.quit();
    }
    @BeforeMethod
    public void beforeBrower(){
        System.setProperty("webdriver.chrome.driver","F:\\ceshikaifa\\IDEA16.2\\worklocation\\drives\\chromedriver.exe");
        //实例化chromeDriver
        webDriver= new ChromeDriver();
    }
}
