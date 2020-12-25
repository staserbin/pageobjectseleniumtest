import org.openqa.selenium.*;


public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.xpath("//input[@id='user_login']");
    private By emailField = By.xpath("//input[@id='user_email']");
    private By passwordField = By.xpath("//input[@id='user_password']");
    private By header = By.xpath("//h1[contains(text(),'Create your account')]");
    private By signUpButton = By.xpath("//button[@id='signup_button']");

    public SignUpPage typeUserName(String username){
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }

    public SignUpPage typePassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage typeEmailAddress(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }


    /* Метод для регистрации, который будет возвращать страницу 'Sign Up' и принимать username, email и password */
    public SignUpPage createYourAccount(String username, String email, String password) {
        this.typeUserName(username);
        this.typeEmailAddress(email);
        this.typePassword(password);
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    /* Метод для получения текста заголовка(хедера) */
    public String getHeaderText() {
        return driver.findElement(header).getText();
    }

    /* Метод для получения Value поля 'Email address' */
    public String getEmailFieldValue() {
        return driver.findElement(emailField).getAttribute("value");
    }

}
