import org.openqa.selenium.WebDriver;

public class SecurityPage2 {

    private WebDriver driver;

    public SecurityPage2(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
