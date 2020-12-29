import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\java_projects\\sources\\testselenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://github.com/");

        /* Создаём объект страницы MainPage и передаём в него driver */
        MainPage mainPage = new MainPage(driver);

        // Using Page Factory Pattern
        /*
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
         */

        /* Запустим метод с MainPage */
        mainPage.registration("testingroad@gmail.com");
    }
}
