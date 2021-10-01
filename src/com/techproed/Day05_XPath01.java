package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_XPath01 {
    public static void main(String[] args) {
      //xpath webelementi bulmaya yarayan locatordir,adrestir
      //herzaman ilk once id sonra name sonra xpath,css selector,...
        //Relative xpath: //div[@class='heading']
     //tagName[@attribute='value']
        /*
        http://a.testaddressbook.com/sign_in adresine gittik emaili inceledik
        (//input[@class='form-control'])[2] eger ayni attribute nameler varsa butun ifadeyi parantez
        icine aliriz sonra ayriyetten koseli parantez acariz 2 dersek ikinciye 1 dersek 1. ye gider.

        //tagName[@attribute1='value1' and @attribute2='value2']  and de 2 sartida saglamali
        //tagName[@attribute1='value1' or @attribute2='value2'] or da en az 1 sarti saglamali
           */
        System.setProperty("webdriver.chrome.driver",
                "/Users/esracoban/Documents/SeleniumDependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
        /*
Username : testtechproed@gmail.com
Password : Test1234!
*/
//<input type="email" class="form-control" placeholder="Email"
// data-test="email" name="session[email]" id="session_email">
//  //tagName[@attribute='value'];

        WebElement emailKutusu=driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("Test1234!");
        WebElement signInBtn =  driver.findElement(By.xpath("//input[@type='submit']"));
        signInBtn.click();


    }
}
