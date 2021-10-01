package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver",
                    "\\Users\\esracoban\\Documents\\SeleniumDependencies\\Drivers\\chromedriver");
            // "/Users/esracoban/Documents/SeleniumDependencies/Drivers/chromedriver"
            //windows kullananlar sonuna .exe ilave ediyor
            WebDriver driver = new ChromeDriver();
            //driverımıza google.com'a gitmesini söyledik
            driver.get("http://google.com");
            //driver.get("http://amazon.com");

            //driverımızda açık olan sayfayı kapar
            //driver.close();

            //driverımızı bütün sekmeleriyle tamamen kapatır
            driver.quit();
        }
    }

