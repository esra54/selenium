package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DersCalisma01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/esracoban/Documents/SeleniumDependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://kozmetik.avon.com.tr/");
        driver.manage().window().maximize();
        // Step-1; Click on 'Customer Login / Registration' button
        //driver.findElement(By.xpath("//span[@style='background-color: #7f28c4;color: #FFF;padding-left: 8px;padding-right: 8px;padding-bottom: 3px;padding-top: 3px;border-radius: 5px;font-weight: bold;']")).click();
        driver.findElement(By.xpath("//*[.='Müşteri Girişi']")).click();
        if (driver.getCurrentUrl().contains("oturum-ac")) {
            System.out.println("Step 1 Pass");
            System.out.println("Customer Login page appears.");
        } else {
            System.out.println("Step 1 Fail");
            System.out.println("Customer Login page not appears.");
        }
        System.out.println();
        // Step-2; Click 'Create an account' button.
        driver.findElement(By.linkText("ŞİMDİ ÜYE OL")).click(); // veya Xpath yöntemi ile //span[.='ŞİMDİ ÜYE OL']
        if (driver.findElement(By.xpath("//section[@id='Registration']")).isDisplayed()) {
            System.out.println("Step 2 Pass");
            System.out.println("Create an account form appears");
        } else {
            System.out.println("Step 2 Fail");
            System.out.println("Create an account form not appears");
        }
        System.out.println();
        // Step 3 Type an invalid e-mail address in 'Email Address*' field (for example'123gmail.com'.)
        WebElement eMail = driver.findElement(By.id("RegistrationEmail"));
        eMail.sendKeys("123gmail.com");
        WebElement eMailError = driver.findElement(By.xpath("//Form/div[1]/div[1]/div[1]/div/div[2]/span/span"));
        if (eMailError.isDisplayed()) {
            System.out.println("Step 3 Pass");
            System.out.println("Error message displayed: "+eMailError.getText());
        } else {
            System.out.println("Step 3 Fail");
            System.out.println("Error message not displayed: "+eMailError.getText());
        }
        System.out.println();
        // Step 4 Type a valid e-mail in 'Email Address*' edit box.
        eMail.clear();
        eMail.sendKeys("tester@gmail.com");
        if (eMailError.isDisplayed()) {
            System.out.println("Step 4= Fail");
            System.out.println("Error message not disappeared");
        }else {
            System.out.println("Step 4= Pass");
            System.out.println("Error message disappeared");
        }
        System.out.println();
        // Step 5 //Type a less than 6 character password in 'Password' field.
        WebElement password = driver.findElement(By.id("RegistrationPassword"));
    //    password.sendKeys("1234");
        WebElement passwordError = driver.findElement(By.xpath("//Form/div[1]/div[1]/div[2]/div/div/span/span"));
        WebDriverWait wait=  new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated((By) passwordError));
        // WebElement passwordError = driver.findElement(By.xpath("//Form/div[1]/div[1]/div[2]/div/div/span/span"));
     //   WebElement passwordError=driver.findElement(By.xpath("//body/div[@id='MainContentWrapper']/main[1]/article[1]/section[1]/section[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));
//
//        if (passwordError.isDisplayed()) {
//            System.out.println("Step 5 Pass");
//            System.out.println("Error message displayed: "+passwordError.getText());
//        } else {
//            System.out.println("Step 5 Fail");
//            System.out.println("Error message not displayed: "+passwordError.isDisplayed());
//        }
  //      System.out.println();
//        // Step 6 Type a more than 5 character password in 'Password*' field
//        password.clear();
        password.sendKeys("Pass12");
//
        //tryctarch yaparsak

//        if (passwordError.isEnabled()) {
//            System.out.println("Step 6 Fail");
//            System.out.println("Error message not disappeared");
//        } else {
//            System.out.println("Step 6 Pass");
//            System.out.println("Error message disappeared");
//        }
//        password.clear();
//        password.sendKeys("Pass12");
//        try {
//            if (passwordError.isDisplayed()) {
//                System.out.println("Step 6 Fail");
//                System.out.println("Error message not disappeared");
//            }
//        } catch (StaleElementReferenceException e) {
//            System.out.println("Step 6 Pass");
//            System.out.println("Error message disappeared");
//        }

//        System.out.println();
//        // Step 7 Type a wrong password in 'Confirm Password*' field.
//        WebElement confirmpassword = driver.findElement(By.id("RegistrationConfirmPassword"));
//        confirmpassword.sendKeys("12345");
//        WebElement confirmpasswordError = driver.findElement(By.xpath("//div[@ng-messages='RegistrationForm.RegistrationConfirmPassword.$error']"));
//        if (confirmpasswordError.isDisplayed()) {
//            System.out.println("Step 7 Pass");
//            System.out.println("Error message displayed: "+confirmpasswordError.getText());
//        } else {
//            System.out.println("Step 7 Fail");
//            System.out.println("Error message not displayed: "+confirmpasswordError.isDisplayed());
//        }
//        System.out.println();
//        // Step 8 Type the good password in 'Confirm Password*' field
//        confirmpassword.clear();
//        confirmpassword.sendKeys("Pass12");
//        /*
//        if (confirmpasswordError.isDisplayed()) {
//            System.out.println("Step 8 Fail");
//            System.out.println("Error message not disappeared");
//        } else {
//            System.out.println("Step 8 Pass");
//            System.out.println("Error message disappeared");
//        }
//        */
//        System.out.println();
//        // Step 9 Type a name which contains not only the appropriate language's ABC letters in 'First Name*' field
//        WebElement name = driver.findElement(By.id("RegistrationFirstName"));
//        name.sendKeys("!");
//        WebElement errorName = driver.findElement(By.xpath("//Form/div[1]/div[2]/div[1]/div/div/span/span"));
//        if (errorName.isDisplayed()) {
//            System.out.println("Step 9 Pass");
//            System.out.println("Error message displayed: "+errorName.getText());
//        } else {
//            System.out.println("Step 9 Fail");
//            System.out.println("Error message not displayed: "+errorName.isDisplayed());
//        }
//        System.out.println();
//        //Step 10 Type a name which contains only the appropriate language's ABC letters in 'First Name*' field
//        name.clear();
//        name.sendKeys("Tester");
//        if (errorName.isDisplayed()) {
//            System.out.println("Step 10 Fail");
//            System.out.println("Error message not disappeared");
//        } else {
//            System.out.println("Step 10 Pass");
//            System.out.println("Error message disappeared");
//        }
//        System.out.println();
//        // Step 11 Type a name which contains not only the appropriate language's ABC letters in 'Last Name*' field
//        WebElement lastname = driver.findElement(By.id("RegistrationLastName"));
//        lastname.sendKeys("!");
//        WebElement errorLastname = driver.findElement(By.xpath("//Form/div[1]/div[2]/div[2]/div/div/span/span"));
//        if (errorLastname.isDisplayed()) {
//            System.out.println("Step 11 Pass");
//            System.out.println("Error message displayed: "+errorLastname.getText());
//        } else {
//            System.out.println("Step 11 Fail");
//            System.out.println("Error message not displayed: "+errorLastname.isDisplayed());
//        }
//        System.out.println();
//        //Step 12 Type a name which contains only the appropriate language's ABC letters in 'Last Name*' field
//        lastname.clear();
//        lastname.sendKeys("Faster");
//        if (errorLastname.isDisplayed()) {
//            System.out.println("Step 12 Fail");
//            System.out.println("Error message not disappeared");
//        } else {
//            System.out.println("Step 12 Pass");
//            System.out.println("Error message disappeared");
//        }
//        System.out.println();
//        // Step 13 Type an address in 'Address' field
//        WebElement address = driver.findElement(By.id("ShippingAddress1"));
//        address.sendKeys("Tech Sok. No:22");
//        WebElement erroraddress = driver.findElement(By.xpath("//Form/div[1]/div[2]/async-block/div[1]/div/div/span/span"));
//        if (erroraddress.isDisplayed()) {
//            System.out.println("Step 13 Fail");
//            System.out.println("Error message displayed");
//        } else {
//            System.out.println("Step 13 Pass");
//            System.out.println("Error message not displayed");
//        }
//        System.out.println();
//        // Step 14 Select a city in 'City *' field.
//        driver.findElement(By.xpath("//*[@id='ShippingProvinceDropDown']/a/span[1]")).click();
//        driver.findElement(By.xpath("")).click();
//
//


}
}
