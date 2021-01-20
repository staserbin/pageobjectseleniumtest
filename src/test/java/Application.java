import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Application {

    public static WebDriver appSetUp() {
        WebDriver driver = new ChromeDriver();
        /* запускаться веб-драйвер */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SERBIN\\IdeaProjects\\pageobjectseleniumtest\\drivers\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        /* открываться указанный URL */
        driver.get("https://github.com/");
        return driver;
    }
}


/* search/advanced */