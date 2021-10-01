package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calisma01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "\\Users\\esracoban\\Documents\\SeleniumDependencies\\Drivers\\chromedriver");
        WebDriver driver = new ChromeDriver();
    }
}
