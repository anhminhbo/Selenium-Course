package com.qascript;
package io.github.bonigarcia.wdm.test.headless;

import static java.lang.invoke.MethodHandles.lookup;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	
    WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void test() {
//         String sutUrl = "https://bonigarcia.dev/selenium-webdriver-java/";
//         driver.get(sutUrl);
//         String title = driver.getTitle();
//         log.debug("The title of {} is {}", sutUrl, title);
//         assertThat(driver.getTitle()).contains("Selenium WebDriver");
	driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
//         Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
	assertThat(driver.getTitle()).contains("Google");
    }



//     @Test
//     public void OpenBrowser()  {
// //         WebDriver driver;
// //         System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
// //         ChromeOptions options = new ChromeOptions();
        
// //         options.addArguments("--no-sandbox");
// //         options.addArguments("--disable-setuid-sandbox");

// //         options.addArguments("--remote-debugging-port=9222");

// //         options.addArguments("--disable-dev-shm-using");
// //         options.addArguments("--disable-extensions");
// //         options.addArguments("--disable-gpu");
// //         options.addArguments("start-maximized");
// //         options.addArguments("disable-infobars");
                             
// //         driver = new ChromeDriver(options);
// //         driver = new ChromeDriver();
        
//         ChromeOptions chromeOptions = new ChromeOptions();
// 		WebDriverManager.chromedriver().setup();
// 		WebDriver driver = new ChromeDriver(chromeOptions);
        
//         driver.get("https://www.google.com");
//         System.out.println("Title of the page is: " + driver.getTitle());
//         Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
//     }


}


