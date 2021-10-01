package practicedersleri;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDeneme {
    public static void main(String[] args) throws MalformedURLException {


            DesiredCapabilities cap=new DesiredCapabilities();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.MAC);
            //benim platformum mac
            ChromeOptions co=new ChromeOptions();
            co.merge(cap);
            //cap ime merge yapip hub ile nodu bagladim
            String hubUrl="http://192.168.1.39:4444/wd/hub";
            //terminalimden clients connect to yazan yeri aldim
            WebDriver driver=new RemoteWebDriver(new URL(hubUrl),co);
            //remote driver yaziyorum cunku remote servar a baglanacam
            //exception verecek throw yapicaz

            driver.get("https://www.google.com/");
            System.out.println("Title is"+driver.getTitle());
            driver.close();


        }
    }

