import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MainPage {

    public WebDriver driver;

    // Alt+Insert добавить Constructor
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    /* Локаторы кнопок 'Sign In', 'Sign Up' and others */
    private By signInButton = By.xpath("//a[contains(text(),'Sign in')]");
    private By signUpButton = By.xpath("//header/div[1]/div[2]/div[2]/a[2]");
    private By emailAddressField = By.xpath("//input[@id='user_email']");
    private By signUpForButton = By.xpath("//button[contains(text(),'Sign up for GitHub')]");
    private By searchGitHubField = By.xpath("//header/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/input[1]");

    /* Методы для работы с локаторами */

    /* При нажатии кнопки 'Sign In' мы будем попадать на 'Login Page', поэтому данный метод будет
    * возвращать новый объект LoginPage, в который будет передаваться наш driver */
    public LoginPage clickSignIn() {
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUp() {
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpForButton() {
        driver.findElement(signUpForButton).click();
        return new SignUpPage(driver);
    }

    /* Находим поле, передаём туда наш email и возвращаем данную страницу */
    public MainPage typeEmailAddress(String email) {
        driver.findElement(emailAddressField).sendKeys(email);
        return this;
    }

    /* Метод для регистрации, который будет возвращать страницу 'Sign Up' и принимать email */
    public SignUpPage registration(String email) {
        this.typeEmailAddress(email);
        this.clickSignUpForButton();
        return new SignUpPage(driver);
    }

    /* Метод для отправки поискового запроса с MainPage */
    public SearchResultPage tryToSearchWithText(String search) {
        driver.findElement(searchGitHubField).sendKeys(search);
        driver.findElement(searchGitHubField).sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }

    /* Метод для отправки ПУСТОГО поискового запроса с MainPage */
    public SearchResultPage tryToSearchWithoutText() {
        driver.findElement(searchGitHubField).sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }

    /*public SearchResultPage pushEnterSearch() {
        driver.findElement(searchGitHubField).sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }*/

}
