package practicedersleri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {
    public static void main(String[] args) {
        /*
        /1-Test02 isimli bir class olusturun
        //2- https://www.walmart.com/ adresine gidin
        //3- Browseri tam sayfa yapin
        //4-Sayfayi "refresh" yapin
        //5- Sayfa basliginin "Save" ifadesi icerdigini control edin
        //6-Sayfa basliginin "Walmart.com | Save Money.Live Better" a esit oldugunu control ediniz
        //7- URL in walmart.com icerdigini control edin
        //8-Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver",
                "\\Users\\esracoban\\Documents\\SeleniumDependencies\\Drivers\\chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.walmart.com/");
        browser.manage().window().maximize();
        browser.navigate().refresh();

//        By title=By.xpath("//title");
//        browser.findElement(By.xpath("//title")).getText();

        String title=browser.getTitle();
        if(title.contains("Save")){
            System.out.println("correct title");
        }else{
            System.out.println("incorrect title");
        }

     String expectedtitle="Walmart.com | Save Money.Live Better";






    }

}
