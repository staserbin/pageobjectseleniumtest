import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearchPage {

    private WebDriver driver;

    // Alt+Insert добавить Constructor
    public AdvancedSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    private By advancedSearchField = By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]");
    private By searchHeaderButton = By.xpath("//body/div[4]/main[1]/form[1]/div[1]/div[1]/div[1]/div[2]/button[1]");
    private By fromTheseOwners = By.xpath("//input[@id='search_from']");
    private By inTheseRepositories = By.xpath("//input[@id='search_repos']");
    private By createdOnTheDates = By.xpath("//input[@id='search_date']");
    private By writtenThisLanguage = By.xpath("//select[@id='search_language']");
    private By withThisManyStars = By.xpath("//input[@id='search_stars']");
    private By withThisManyForks = By.xpath("//input[@id='search_forks']");
    private By ofThisSize = By.xpath("//input[@id='search_size']");
    private By pushedTo = By.xpath("//input[@id='search_push']");
    private By withThisLicense = By.xpath("//select[@id='search_license']");
    private By returnRepo = By.xpath("//body/div[4]/main[1]/form[1]/div[2]/fieldset[2]/label[1]/select[1]");
    private By withThisExtension = By.xpath("//input[@id='search_extension']");
    private By ofThisFileSize = By.xpath("//input[@id='search_file_size']");
    private By inThisPath = By.xpath("//input[@id='search_path']");
    private By withThisFileName = By.xpath("//input[@id='search_filename']");
    private By returnCode = By.xpath("//body/div[4]/main[1]/form[1]/div[2]/fieldset[3]/label[1]/select[1]");
    private By searchFooterButton = By.xpath("//body/div[4]/main[1]/form[1]/div[2]/div[1]/div[1]/button[1]");

    public AdvancedSearchPage clickSearchHeaderButton() {
        driver.findElement(searchHeaderButton).click();
        return this;
    }

    public AdvancedSearchPage clickSearchFooterButton() {
        driver.findElement(searchFooterButton).click();
        return this;
    }

    public SearchResultPage searchFromAdvanced(String search) {
        driver.findElement(advancedSearchField).sendKeys(search);
        clickSearchHeaderButton();
        return new SearchResultPage(driver);
    }

    /* Advanced options */

    public AdvancedSearchPage fromTheseOwnersAO(String text) {
        driver.findElement(fromTheseOwners).sendKeys(text);
        return this;
    }

    public AdvancedSearchPage inTheseRepositoriesAO(String text) {
        driver.findElement(inTheseRepositories).sendKeys(text);
        return this;
    }

    public AdvancedSearchPage createdOnTheDatesAO(String date) {
        driver.findElement(createdOnTheDates).sendKeys(date);
        return this;
    }

    public AdvancedSearchPage writtenThisLanguageAO(String value) {
        Select s = new Select(driver.findElement(writtenThisLanguage));
        s.selectByValue(value);
        return this;
    }

    public AdvancedSearchPage checkAdvancedOptions(String text1, String text2, String date, String value) {
        this.fromTheseOwnersAO(text1);
        this.inTheseRepositoriesAO(text2);
        this.createdOnTheDatesAO(date);
        this.writtenThisLanguageAO(value);
        return new AdvancedSearchPage(driver);
    }

    /* Repositories options */

    public AdvancedSearchPage withThisManyStarsRO(String number) {
        driver.findElement(withThisManyStars).sendKeys(number);
        return this;
    }

    public AdvancedSearchPage withThisManyForksRO(String number) {
        driver.findElement(withThisManyForks).sendKeys(number);
        return this;
    }

    public AdvancedSearchPage ofThisSizeRO(String number) {
        driver.findElement(ofThisSize).sendKeys(number);
        return this;
    }

    public AdvancedSearchPage pushedToRO(String date) {
        driver.findElement(pushedTo).sendKeys(date);
        return this;
    }

    public AdvancedSearchPage withThisLicenseRO(String value) {
        Select s = new Select(driver.findElement(withThisLicense));
        s.selectByValue(value);
        return this;
    }

    public AdvancedSearchPage returnRepo(String value) {
        Select s = new Select(driver.findElement(returnRepo));
        s.selectByValue(value);
        return this;
    }

    public AdvancedSearchPage checkRepositoriesOptions(String number1, String number2, String number3, String date, String value1, String value2) {
        this.withThisManyStarsRO(number1);
        this.withThisManyForksRO(number2);
        this.ofThisSizeRO(number3);
        this.pushedToRO(date);
        this.withThisLicenseRO(value1);
        this.returnRepo(value2);
        return new AdvancedSearchPage(driver);
    }

    public AdvancedSearchPage withThisExtensionCO(String text) {
        driver.findElement(withThisExtension).sendKeys("text");
        return this;
    }

    public AdvancedSearchPage ofThisFileSizeCO(String number) {
        driver.findElement(ofThisFileSize).sendKeys(number);
        return this;
    }

    public AdvancedSearchPage inThisPathCO(String text) {
        driver.findElement(inThisPath).sendKeys(text);
        return this;
    }

    public AdvancedSearchPage withThisFileNameCO(String text) {
        driver.findElement(withThisFileName).sendKeys(text);
        return this;
    }

    public AdvancedSearchPage returnCode(String value) {
        Select s = new Select(driver.findElement(returnCode));
        s.selectByValue(value);
        return this;
    }

    public AdvancedSearchPage checkCodeOptions(String text1, String number, String text2, String text3, String value) {
        this.withThisExtensionCO(text1);
        this.ofThisFileSizeCO(number);
        this.inThisPathCO(text2);
        this.withThisFileNameCO(text3);
        this.returnCode(value);
        return new AdvancedSearchPage(driver);
    }
}
