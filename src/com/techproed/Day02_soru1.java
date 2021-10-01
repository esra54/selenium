package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_soru1 {
    public static void main(String[] args) {
    //driverı ekranı kaplıcakşekilde kullanalım
//1-ilk önce google.com'a gidelim
//2-sayfanın title'ını alalım ekrana yazdıralım
//3-daha sonra youtube.com'a gidelim
//4-sayfanın title'ını ve urlsini alıp ekrana yazdıralım
//5-google.com'a geri gelelim ve sayfanın url'sini alıp ekrana yazdıralım
//6-driverımızı kapatalım
        System.setProperty("webdriver.chrome.driver",
                "/Users/esracoban/Documents/SeleniumDependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String title=driver.getTitle();
        System.out.println("sayfanin basligi"+title);

        driver.navigate().to("https://youtoube.com");
        String title2=driver.getTitle();
        System.out.println("saysanin basligi"+title2);
        String url=driver.getCurrentUrl();
        System.out.println("sayfanin url si"+url);
        driver.navigate().back();
        String url2=driver.getCurrentUrl();
        System.out.println("gerigeldiginsayfanin urli"+url2);
        driver.quit();

    }
}
