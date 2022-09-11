package com.qascript;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
// 	@Test
// 	public void testing() {
// 	WebDriver driver;
// 	WebDriverManager.chromedriver().setup();
	
//         ChromeOptions options = new ChromeOptions();
// 	options.addArguments("--no-sandbox");
//         options.addArguments("--headless");
// 	options.addArguments("--remote-debugging-port=922");
//         options.addArguments("--disable-setuid-sandbox");
//         options.addArguments("--disable-infobars");
//         options.addArguments("--disable-dev-shm-usage");
//         options.addArguments("--enable-automation");
		
		
//         driver = new ChromeDriver(options);
	
//         driver.get("https://www.google.com");
//         System.out.println("Title of the page is: " + driver.getTitle());
//         Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
		
// 	driver.quit();
// 	}
	
	  @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
	options.setBinary("/usr/bin/google-chrome");
//         options.addArguments("--headless");
	options.setHeadless(true);
	options.addArguments("--no-sandbox");
	options.addArguments("disable-infobars"); // disabling infobars
	options.addArguments("--disable-extensions"); // disabling extensions
	options.addArguments("--disable-dev-shm-usage"); // overcome limited
	options.addArguments("--remote-debugging-port=9222"); // fixing DevToolsFiles not exist
        driver = new ChromeDriver(options);
// 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
	driver.quit();
    }

}


