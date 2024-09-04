package testng.testngbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NeedOfTestNG {

    @Test(groups = {"sanity"})
    public void openAmazonUrl(){
        WebDriver driver = new ChromeDriver(); //Upcasting
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
		System.out.println("Hello TestNG");
    }

    @Test
    public void openTestNGUrl(){
        WebDriver driver = new ChromeDriver(); //Upcasting
        driver.get("https://testng.org/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void openSeleniumUrl(){
        WebDriver driver = new ChromeDriver(); //Upcasting
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        driver.close();
    }
}
