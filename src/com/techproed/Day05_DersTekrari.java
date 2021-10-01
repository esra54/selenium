package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_DersTekrari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/esracoban/Documents/SeleniumDependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://amazon.com");

        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("computers");

        WebElement okButonu=driver.findElement(By.id("nav-search-submit-button"));
        okButonu.click();

        WebElement yaziElementi=driver.findElement(By.className("sg-col-inner"));
       // System.out.println(yaziElementi.getText());

        if(yaziElementi.isDisplayed()){
            System.out.println("goruyorum");
        }else{
            System.out.println("gormuyorum");

        }
        //dogrulamak icin baktigimiz metodlar:getTitle() getUrl() isDisplay()

    }

}
