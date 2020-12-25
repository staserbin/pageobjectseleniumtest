import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.beans.Transient;
import java.util.concurrent.TimeUnit;

public class SearchPageTest {

    private WebDriver driver;
    private SearchResultPage searchResultPage;

    /* Перед запуском каждого теста будет: */
    @Before
    public void setUp() {
        /* запускаться веб-драйвер */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SERBIN\\IdeaProjects\\pageobjectseleniumtest\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        /* открываться указанный URL */
        driver.get("https://github.com/search");
        /* открываться страница поиска */
        searchResultPage = new SearchResultPage(driver);
    }

    /* Проверка, что открылась страница результатов после выполнения поиска */
    @Test
    public void searchFromSearchPageWithoutValue() {
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.tryToSearch("any text");
        /*searchResultPage.sendSearchRequest("any text");
        * searchResultPage.clickSearchButton();*/
        WebElement expectedElement = driver.findElement(By.xpath("//h3[contains(text(),'repository results')]"));
        Assert.assertTrue(expectedElement.isDisplayed());
    }

    @Test
    public void openAdvancedSearch() {
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.advancedSearch();
        WebElement expectedElement = driver.findElement(By.xpath("//h3[contains(text(),'Advanced options')]"));
        Assert.assertTrue(expectedElement.isDisplayed());
    }

    @Test
    public void openPrefixPopUp() {
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.prefix();
        WebElement expectedElement = driver.findElement(By.xpath("//h3[contains(text(),'Search cheat sheet')]"));
        Assert.assertTrue(expectedElement.isDisplayed());
    }

    @After
    public void tearDown() { driver.close(); }

}
