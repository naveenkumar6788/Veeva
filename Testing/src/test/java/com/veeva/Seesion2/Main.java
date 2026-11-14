package com.veeva.Seesion2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Main {
        static void main() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://maya.adityauniversity.in/");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[.='Login']")).click(); //sendKeys("23a91a0511");
            Thread.sleep(4000);
//            JavascriptExecutor raju=(JavascriptExecutor) driver;
//            raju.executeScript("window.scrollBy(0,200)");
            Thread.sleep(2000);
            driver.findElement(By.name("roll_no")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc#321");

        }
    }

