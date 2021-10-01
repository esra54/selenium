package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_soru1 {
    public static void main(String[] args) {
        /*
1. Bir class oluşturun : GoogleSearchTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
A.google web sayfasına gidin. https://www.google.com/
b. Search(ara) "city bike"
c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
d. "Shopping" e tıklayın.
e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
 */
        System.setProperty("webdriver.chrome.driver",
                "/Users/esracoban/Documents/SeleniumDependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.google.com");



    }
}
