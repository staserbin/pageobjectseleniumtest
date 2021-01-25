import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AdvancedSearchTest extends Application{

    public WebDriver driver;

    @Before
    public void setUp() {
        driver = appSetUp();
    }

    /* Search field validation */
    @Test
    public void searchFromAdvancedSearchField() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(),'advanced search')]")).click();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.searchFromAdvanced("java");
        WebElement expectedElement = driver.findElement(By.xpath("//h3[contains(text(),'Java')]"));
        Assert.assertTrue(expectedElement.isDisplayed());
    }

    /* Advanced Options section validation */
    @Test
    public void checkAdvancedSearchWithAO() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(),'advanced search')]")).click();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.checkAdvancedOptions("alex", "testrepo", "2020-12-24", "Java");
        String output = driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Assert.assertEquals("user:alex repo:testrepo created:2020-12-24 language:Java", output);
    }

    /* Repositories Options section validation */
    @Test
    public void checkAdvancedSearchWithRO() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(),'advanced search')]")).click();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.checkRepositoriesOptions("100", "200", "150", "2020-12-24", "0bsd", "true");
        String output = driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Assert.assertEquals("stars:100 forks:200 size:150 pushed:2020-12-24 license:0bsd fork:true", output);
    }

    /* Code Options section validation */
    @Test
    public void checkAdvancedSearchWithCO() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(),'advanced search')]")).click();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.checkCodeOptions("jpg", "2000", "/test/path", "test.name", "true");
        String output = driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Assert.assertEquals("extension:jpg size:2000 path:/test/path filename:test.name fork:true", output);
    }

    /* Issues Options section validation */
    @Test
    public void checkAdvancedSearchWithIO() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(),'advanced search')]")).click();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.checkIssueOptions("open", "100", "bug", "hubot", "tpope", "twp", "2020-12-30");
        String output = driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Assert.assertEquals("comments:100 label:bug author:hubot mentions:tpope assignee:twp updated:2020-12-30 state:open", output);
    }

    /* Users Options section validation */
    @Test
    public void checkAdvanceSearchWithUO() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(),'advanced search')]")).click();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.checkUsersOptions("Stanislav Serbin", "San Francisco, CA", "<10", "<5", "Java");
        String output = driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Assert.assertEquals("fullname:\"Stanislav Serbin\" location:\"San Francisco\" location:CA followers:<10 repos:<5 language:Java", output);
    }

    /* Wiki Options section validation */
    @Test
    public void checkAdvancedSearchWithWO() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(),'advanced search')]")).click();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.checkWikiOptions("2020-12-31");
        String output = driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Assert.assertEquals("updated:2020-12-31", output);
    }

    /* SearchFromFooter button validation */
    @Test
    public void checkSearchFooterButton() {
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(),'advanced search')]")).click();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.searchFromAdvancedFooter();
        WebElement expectedElement = driver.findElement(By.xpath("//body/div[4]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
        Assert.assertTrue(expectedElement.isDisplayed());
    }

    @After
    public void tearDown() { driver.close(); }
}
