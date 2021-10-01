package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/esracoban/Documents/SeleniumDependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        List<WebElement> elementler=driver.findElements(By.tagName("a"));
        for(WebElement w:elementler){
            System.out.println(w.getText());
        }
//        for(i=0;i<elementler.size();i++){
//            System.out.println(elementler.get(i).getText());
//        }
        //yada
//        WebElement elemanlarim=elementler.get(i);
//        System.out.println(elemanlarim.getText());

    }
}
