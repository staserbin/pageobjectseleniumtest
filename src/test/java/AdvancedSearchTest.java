import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AdvancedSearchTest {

    private WebDriver driver;
    private AdvancedSearchPage advancedSearchPage;

    /* Перед запуском каждого теста будет: */
    @Before
    public void setUp() {
        /* запускаться веб-драйвер */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SERBIN\\IdeaProjects\\pageobjectseleniumtest\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        /* открываться указанный URL */
        driver.get("https://github.com/search/advanced");
        /* открываться страница поиска */
        advancedSearchPage = new AdvancedSearchPage(driver);
    }

    /* Search field validation */
    @Test
    public void searchFromAdvancedSearchField() {
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.searchFromAdvanced("java");
        WebElement expectedElement = driver.findElement(By.xpath("//h3[contains(text(),'Java')]"));
        Assert.assertTrue(expectedElement.isDisplayed());
    }

    /* Advanced Options section validation */
    @Test
    public void checkAdvancedSearchWithAO() {
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.checkAdvancedOptions("alex", "testrepo", "2020-12-24", "Java");
        String output = driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Assert.assertEquals("user:alex repo:testrepo created:2020-12-24 language:Java", output);
    }

    /* Repositories Options section validation */
    @Test
    public void checkAdvancedSearchWithRO() {
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.checkRepositoriesOptions("100", "200", "150", "2020-12-24", "0bsd", "true");
        String output = driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Assert.assertEquals("stars:100 forks:200 size:150 pushed:2020-12-24 license:0bsd fork:true", output);
    }

    /* Code Options section validation */
    @Test
    public void checkAdvancedSearchWithCO() {
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.checkCodeOptions("jpg", "2000", "/test/path", "test.name", "true");
        String output = driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Assert.assertEquals("extension:jpg size:2000 path:/test/path filename:test.name fork:true", output);
    }

    /* Issues Options section validation */
    @Test
    public void checkAdvancedSearchWithIO() {
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.checkIssueOptions("open", "100", "bug", "hubot", "tpope", "twp", "2020-12-30");
        String output = driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Assert.assertEquals("created:2020-09-27 comments:100 label:bug author:hubot mentions:tpope assignee:twp updated:2020-12-30 language:HTML state:open", output);
    }

    @After
    public void tearDown() { driver.close(); }
}
