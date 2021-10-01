package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {
        /*
         Main method oluşturun ve aşağıdaki görevi tamamlayın.
1. http://a.testaddressbook.com/sign_in adresine gidiniz.
2. email textbox,password textbox, and signin button elementlerini locate ediniz..
3. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
4. Username : testtechproed@gmail.com
5. Password : Test1234!
6. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
         */
        System.setProperty("webdriver.chrome.driver",
                "/Users/esracoban/Documents/SeleniumDependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); // sayfa yüklenene kadar en fazla 5 saniye bekletir. öncesinde yüklenirse beklemez
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        // sign in linkini id attribute'ü ile bulur
        WebElement signInLinki = driver.findElement(By.id("sign-in"));

        // signInLink'ini tıklar
        signInLinki.click();

        //email kutusunu id attribute'ü ile bulur
        WebElement emailKutusu = driver.findElement(By.id("session_email"));

        //email kutusununiçine yazı gönderir
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //password kutusunu id attribute'ü ile bulur
        WebElement passwordKutusu = driver.findElement(By.id("session_password"));

        //password kutusuna yazı gönderir
        passwordKutusu.sendKeys("Test1234!");

        // sign in butonunu name attribute'ü ile bulur
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        // doğru sayfada olup olmadığımızı onaylattık
        String sayfaTitle = driver.getTitle();
        if(sayfaTitle.toLowerCase().contains("address")){
            System.out.println("doğru sayfadasınız");
        }else{
            System.out.println("yanlış sayfaya geldiniz");
        }
        driver.quit();
        /*

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://twitter.com/?lang=tr");
        driver.findElement(By.xpath("//a[@data-testid='loginButton']/div/span/span")).click();
         */
    }
}