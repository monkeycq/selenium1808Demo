package com.ceshi.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

/**
 * Created by ASUS on 2018/7/25.
 */
public class OpenBrowerTest {
    @Test
    public void openFireFox(){
        WebDriver webDriver = new FirefoxDriver();
    }
    @Test
    public void openFF(){
        System.setProperty("webdriver.gecko.driver","F:\\ceshikaifa\\IDEA16.2\\worklocation\\drives\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
    }
    @Test
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","F:\\ceshikaifa\\IDEA16.2\\worklocation\\drives\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
    }
    @Test
    public void openIE(){
        System.setProperty("webdriver.ie.driver","F:\\ceshikaifa\\IDEA16.2\\worklocation\\drivES\\IEDriverServer.exe");
        WebDriver webDriver = new InternetExplorerDriver();
    }
    @Test
    public void openEdge(){
        System.setProperty("webdriver.edge.driver","F:\\ceshikaifa\\IDEA16.2\\worklocation\\drivES\\MicrosoftWebDriver.exe");
        WebDriver webDriver = new EdgeDriver();
    }

}
