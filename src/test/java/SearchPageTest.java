import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.beans.Transient;
import java.util.concurrent.TimeUnit;

public class SearchPageTest extends Application {

    private WebDriver driver;

    /* Перед запуском каждого теста будет: */
    @Before
    public void setUp() {
        /* запускаться веб-драйвер и открываться указанный URL */
        driver = appSetUp();
    }

    /* Проверка, что открылась страница результатов после выполнения поиска */
    @Test
    public void searchFromSearchPageWithoutValue() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.tryToSearch("any text");
        /*searchResultPage.sendSearchRequest("any text");
        * searchResultPage.clickSearchButton();*/
        WebElement expectedElement = driver.findElement(By.xpath("//h3[contains(text(),'repository results')]"));
        Assert.assertTrue(expectedElement.isDisplayed());
    }

    @Test
    public void openAdvancedSearch() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.advancedSearch();
        WebElement expectedElement = driver.findElement(By.xpath("//h3[contains(text(),'Advanced options')]"));
        Assert.assertTrue(expectedElement.isDisplayed());
    }

    @Test
    public void openPrefixPopUp() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.prefix();
        WebElement expectedElement = driver.findElement(By.xpath("//h3[contains(text(),'Search cheat sheet')]"));
        Assert.assertTrue(expectedElement.isDisplayed());
    }

    @After
    public void tearDown() { driver.close(); }

}
