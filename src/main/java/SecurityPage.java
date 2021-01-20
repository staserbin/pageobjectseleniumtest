import org.openqa.selenium.WebDriver;

public class SecurityPage {

    private WebDriver driver;

    public SecurityPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
