package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        
//         options.addArguments("--no-sandbox");
//         options.addArguments("--disable-setuid-sandbox");

//         options.addArguments("--remote-debugging-port=9222");

//         options.addArguments("--disable-dev-shm-using");
//         options.addArguments("--disable-extensions");
//         options.addArguments("--disable-gpu");
//         options.addArguments("start-maximized");
//         options.addArguments("disable-infobars");
                             
//         driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


