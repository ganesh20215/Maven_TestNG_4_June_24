package mavenintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOfMaven {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Upcasting
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }
}
