package com.ceshi.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

/**
 * Created by ASUS on 2018/8/1.
 */
public class DownLoadTest {
    @Test
    public void testFirefoxDown() throws InterruptedException {
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("browser.download.folderList", "2");
        firefoxProfile.setPreference("browser.download.air", "F:\\");
        firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                "application/octet-stream, application/vnd.ms-excel, " +
                        "text/csv, application/zip,application/xml");
        WebDriver webDriver = new FirefoxDriver(firefoxProfile);
        webDriver.get("http://dl.pconline.com.cn/html_2/1/117/id=10699&pn=0.html");
        webDriver.findElement(By.xpath(".//*[@id='ad436521']/img")).click();
        Thread.sleep(5000);
        webDriver.quit();
    }
}
