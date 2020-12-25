import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    private WebDriver driver;

    // Alt+Insert добавить Constructor
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchGitField = By.xpath("//div/input[@placeholder='Search GitHub']");
    private By searchButton = By.xpath("//button[contains(text(),'Search')]");
    private By advancedSearchLink = By.xpath("//a[contains(text(),'advanced search')]");
    private By prefixesLink = By.xpath("//summary[contains(text(),'prefixes.')]");

    /* Метод для получения текущего URL-адреса страницы */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

    /* Метод для вставки поискового запроса */
    public SearchResultPage sendSearchRequest(String search) {
        driver.findElement(searchGitField).sendKeys(search);
        return this;
    }

    /* Метод нажатия SearchButton */
    public SearchResultPage clickSearchButton() {
        driver.findElement(searchButton).click();
        return this;
    }

    /* Метод для Отправки поискового запроса */
    public SearchResultPage tryToSearch(String search) {
        this.sendSearchRequest(search);
        this.clickSearchButton();
        return new SearchResultPage(driver);
    }

    public AdvancedSearchPage advancedSearch() {
        driver.findElement(advancedSearchLink).click();
        return new AdvancedSearchPage(driver);
    }

    public SearchResultPage prefix() {
        driver.findElement(prefixesLink).click();
        return this;
    }



}
