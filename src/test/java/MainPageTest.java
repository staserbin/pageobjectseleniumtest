import com.google.common.primitives.Chars;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    /* Перед запуском каждого теста будет: */
    @Before
    public void setUp() {
        /* запускаться веб-драйвер */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SERBIN\\IdeaProjects\\pageobjectseleniumtest\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        /* открываться указанный URL */
        driver.get("https://github.com/");
        /* открываться главная страница сайта */
        mainPage = new MainPage(driver);
    }

    /* Проверим, что при нажатии на кнопку 'Sign In' откроется страница 'LoginPage' */
    @Test
    public void signIn() {
        /* Создаём объект(loginPage) LoginPage, чтобы получить данную страницу и вызываем метод clickSignIn на
         главной странице(mainPage) */
        LoginPage loginPage = mainPage.clickSignIn();

        /* Записываем в переменную header получаемое значение методом getHeaderText() на странице логина(loginPage) */
        String header = loginPage.getHeaderText();
        /* Сравниваем текущий текст хедера с получаемым */
        Assert.assertEquals("Sign in to GitHub", header);
    }

    /* Убедимся, что после нажатия на 'Sign up' кнопку мы попадаем на SignUpPage */
    @Test
    public void signUp() {
        SignUpPage signUpPage = mainPage.clickSignUp();
        String headerUp = signUpPage.getHeaderText();
        Assert.assertEquals("Create your account", headerUp);
    }

    /* Убедимся, что при вводе email и нажатии на кнопку 'Sign up for GitHub', мы переходим на SignUpPage */
    @Test
    public void navigateToSignUpPageWithEmail() {
        SignUpPage signUpPage = mainPage.registration("random_string@test.com");
        String headerUp = signUpPage.getHeaderText();
        Assert.assertEquals("Create your account", headerUp);
    }

    /* Убедимся, что при отправки пустого email и нажатии на кнопку 'Sign up for GitHub', мы переходим на SignUpPage */
    @Test
    public void navigateToSignUpPageWithoutEmail() {
        SignUpPage signUpPage = mainPage.registration("");
        String headerUp = signUpPage.getHeaderText();
        Assert.assertEquals("Create your account", headerUp);
    }

    /* Убедимся, что при вводе email и нажатии на кнопку 'Sign up for GitHub', мы переходим на SignUpPage и в поле
      страницы сэтится то же значение email, которое было указано на MainPage */
    @Test
    public void emailValidation() {
        String emailOnMainPage = "test_email@grabli.com";
        SignUpPage signUpPage = mainPage.registration(emailOnMainPage);
        String emailValue = signUpPage.getEmailFieldValue();
        Assert.assertEquals(emailOnMainPage, emailValue);
    }

    /* Проверка поля Search без запроса */
    @Test
    public void searchFieldWithoutValue() throws MalformedURLException {
        SearchResultPage searchResultPage = mainPage.tryToSearchWithText("");
        String searchURL = searchResultPage.getPageURL();
        URL searchUrL = new URL("https://github.com/search?q=&type=");
        Assert.assertEquals(searchUrL.toString(), searchURL);
    }

    /* Проверка поля Search с поисковым запросом */
    @Test
    public void searchFieldWitValue() {
        SearchResultPage searchResultPage = mainPage.tryToSearchWithText("Java");
        WebElement expectedElement = driver.findElement(By.xpath("//h3[contains(text(),'Java')]"));
        Assert.assertTrue(expectedElement.isDisplayed());
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
