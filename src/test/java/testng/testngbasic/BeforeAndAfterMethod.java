package testng.testngbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {

    public WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        driver = new ChromeDriver(); //Upcasting
    }

    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }

    @Test
    public void VerifyOpenAmazonUrl(){
        driver.get("https://www.amazon.in/");
    }

    @Test
    public void VerifyOpenTestNGUrl(){
        driver.get("https://testng.org/");
        driver.manage().window().maximize();
    }

    @Test
    public void VerifyOpenSeleniumUrl(){
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
    }
}
