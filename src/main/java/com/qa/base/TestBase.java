package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public static FileInputStream fis;
    public static String browser;

    public TestBase() {

        try {
            fis = new FileInputStream(".\\src\\main\\java\\com\\qa\\config\\config.properties");
            prop = new Properties();
            prop.load(fis);
            browser = prop.getProperty("browser");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initializeBrowser(String browser){

        if(browser.equalsIgnoreCase("chrome")){
//          System.setProperty("webdriver.chrome.driver",".\\chromeDriver\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        if(browser.equalsIgnoreCase("IE")){
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }
}

