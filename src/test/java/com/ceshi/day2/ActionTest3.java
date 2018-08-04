package com.ceshi.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 * Created by ASUS on 2018/7/30.
 */
public class ActionTest3 {
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
    public void testContextClick(){
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.id("su"));
        Actions builder = new Actions(webDriver);
        //builder.contextClick(element).perform();
        builder.doubleClick(element).perform();
    }
    @Test
    public void testMoveElement() throws InterruptedException {
        webDriver.get("http://www.baidu.com");
        //webDriver.get("http://www.baidu.com");
        Thread.sleep(3000);
        WebElement element = webDriver.findElement(By.className("bri"));
        Actions builder = new Actions(webDriver);
        builder.moveToElement(element).perform();
        Thread.sleep(3000);
    }
    @Test
    public void testDragAndDropBy(){
        webDriver.get("file:///F:/ceshikaifa/%E6%96%B0%E5%BB%BA%E6%96%87%E4%BB%B6%E5%A4%B9/selenium_html/dragAndDrop.html");
        WebElement drag = webDriver.findElement(By.xpath("//*[@id=\"drag\"]"));
        Actions builder = new Actions(webDriver);
        builder.dragAndDropBy(drag, 500, 500).perform();
    }
    @Test
    public void testClickAndHold(){
        webDriver.get("file:///F:/ceshikaifa/%E6%96%B0%E5%BB%BA%E6%96%87%E4%BB%B6%E5%A4%B9/selenium_html/dragAndDrop.html");
        WebElement element1 = webDriver.findElement(By.xpath("//*[@id=\"drag\"]"));
        WebElement element2 = webDriver.findElement(By.xpath("/html/body/h1"));
        Actions builder = new Actions(webDriver);
        builder.clickAndHold(element1)
                .moveToElement(element2)
                .release(element2)
                .perform();
    }
    @Test
    public void testSelects(){

        //打开ui测试主页
        webDriver.get("file:///F:/ceshikaifa/新建文件夹/selenium_html/index.html");
        Actions builder = new Actions(webDriver);
        WebElement select = webDriver.findElement(By.id("selectWithMultipleEqualsMultiple"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        Action multipleSelect = builder.keyDown(Keys.SHIFT)
                .click(options.get(0))
                .click(options.get(1))
                .build();
        multipleSelect.perform();
    }
    @Test
    public void robotDemo() throws AWTException{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        int keyS = (int)new Character('S');
        robot.keyRelease(keyS);
        robot.keyPress(KeyEvent.VK_CONTROL);
    }
}
