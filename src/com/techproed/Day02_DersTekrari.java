package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DersTekrari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/esracoban/Documents/SeleniumDependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       // driver.get("https://google.com");
        driver.navigate().to("https://amazon.com");
        //getTitle() websitesindeki title almak icin
        String amazonTitle=driver.getTitle();
        System.out.println("Amazonun title is: "+amazonTitle);

        String url=driver.getCurrentUrl();
        System.out.println("amazon url is :"+url);

    }
}