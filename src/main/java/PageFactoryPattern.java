/*

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PageFactoryPattern {

    private WebDriver driver;

    public PageFactoryPattern(WebDriver driver) {

        this.driver = driver;
    }

    /* Код в стиле Page Factory pattern, не Page Object */
/*
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    private By signInButton;
    @FindBy(xpath = "//header/div[1]/div[2]/div[2]/a[2]")
    private By signUpButton;
    @FindBy(xpath = "//input[@id='user_email']")
    private By emailAddressField;
    @FindBy(xpath = "//button[contains(text(),'Sign up for GitHub')]")
    private By signUpForButton;

    public LoginPage clickSignIn() {
        signInButton.click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUp() {
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpForButton() {
        signUpForButton.click();
        return new SignUpPage(driver);
    }

    public PageFactoryPattern typeEmailAddress(String email) {
        emailAddressField.sendKeys(email);
        return this;
    }
}



*/