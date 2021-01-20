import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class JustForChecking {

    static WebDriver driver;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SERBIN\\IdeaProjects\\pageobjectseleniumtest\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/");

        System.out.println(driver.getCurrentUrl());
    }

}
