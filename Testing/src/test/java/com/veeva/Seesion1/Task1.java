package com.veeva.Seesion1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Task1 {
//    public static void main(String[] args) {
static void main() throws InterruptedException {
       WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://maya.adityauniversity.in/");
    new Thread();
    sleep(3000);
        webDriver.manage().window().fullscreen();
        webDriver.quit();
    }
}
