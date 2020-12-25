import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginField = By.xpath("//input[@id='login_field']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By signInButton = By.xpath("//input[@type='submit']");
    private By signInHeader = By.xpath("//div[contains(@class, 'auth-form-header')]/h1");
    private By error = By.xpath("//body/div[3]/main[1]/div[1]/form[1]/div[2]/div[1]");
    private By createAnAccount = By.xpath("//a[contains(text(),'Create an account')]");

    public LoginPage typeUsername(String username){
        driver.findElement(loginField).sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    // Логин с некорректными данными
    public LoginPage loginWithInvalidCreds(String username, String password){
        this.typeUsername(username);
        this.typePassword(password);
        driver.findElement(signInButton);
        return new LoginPage(driver);
    }

    // Метод для получения текста заголовка
    public String getHeaderText(){
        return driver.findElement(signInHeader).getText();
    }

    // Метод для получения сообщения об ошибке
    public String getErrorText(){
        return driver.findElement(error).getText();
    }

    public SignUpPage clickCreateAnAccount(){
        driver.findElement(createAnAccount).click();
        return new SignUpPage(driver);
    }


}
