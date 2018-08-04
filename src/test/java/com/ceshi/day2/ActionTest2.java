package com.ceshi.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by ASUS on 2018/7/30.
 */
public class ActionTest2 {
    WebDriver webDriver;
    @AfterMethod
    public void closeBrower() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.quit();
    }
    @BeforeMethod
    public void beforeBrower(){
        System.setProperty("webdriver.chrome.driver","F:\\ceshikaifa\\IDEA16.2\\worklocation\\drives\\chromedriver.exe");
        //实例化chromeDriver
        webDriver= new ChromeDriver();
   }
    @Test
    public void alertTest() throws InterruptedException {
        //打开ui测试主页
        webDriver.get("file:///F:/ceshikaifa/新建文件夹/selenium_html/index.html");
        //点击alert按钮
        webDriver.findElement(By.xpath("//*[@id=\"prompt\"]/input")).click();
        //Thread.sleep(3000);
        //选取alert弹窗
        Alert prompt = webDriver.switchTo().alert();
        //输出弹窗内容
        prompt.sendKeys("输入值...");
        Thread.sleep(3000);
        //点击警告框的确定按钮
        prompt.accept();
        //alert.dismiss();
    }
    @Test
    public void iframeTest(){
        //打开ui测试主页
        webDriver.get("file:///F:/ceshikaifa/新建文件夹/selenium_html/index.html");
        //用id或者name定位iframe，并将控制权交给iframe
        webDriver.switchTo().frame("aa");
        //操作iframe里的元素
        webDriver.findElement(By.id("user")).sendKeys("能否输入。。");
        //控制权交回顶部的frame
        webDriver.switchTo().defaultContent();
    }
    @Test
    public void selectTest() throws InterruptedException{
        webDriver.get("file:///F:/ceshikaifa/新建文件夹/selenium_html/index.html");
        WebElement element = webDriver.findElement(By.name("select"));
        Select select = new Select(element);
        select.selectByIndex(2);
        Thread.sleep(5000);
        select.selectByValue("huawei");
        Thread.sleep(5000);
        select.selectByVisibleText("xiaomi");
    }
    @Test
    public void winTest() throws InterruptedException {
        webDriver.get("file:///F:/ceshikaifa/新建文件夹/selenium_html/index.html");
        webDriver.findElement(By.xpath("//*[@id=\"open\"]/a")).click();
        Thread.sleep(3000);
        String handle = webDriver.getWindowHandle();
        for(String handles : webDriver.getWindowHandles()){
            if (handles.equals(handle)){
                continue;
            }else {
                webDriver.switchTo().window(handle);

            }
        }
        Thread.sleep(3000);
        webDriver.findElement(By.id("user")).sendKeys("test1");
        Thread.sleep(3000);

        //webDriver.findElement(By.className("baidu")).click();
        //webDriver.close();
        webDriver.switchTo().window(handle);
        Thread.sleep(3000);
        webDriver.findElement(By.id("user")).sendKeys("test2");
    }
}
