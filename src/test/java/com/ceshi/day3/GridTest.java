package com.ceshi.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ASUS on 2018/8/2.
 */
public class GridTest {
    @Test
    public void testChrome() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
        WebDriver webDriver = new RemoteWebDriver(new URL("http://192.168.3.2:4444/wd/hub"),desiredCapabilities);
        webDriver.get("http://www.baidu.com");
        Thread.sleep(3000);
        webDriver.quit();
    }
}
