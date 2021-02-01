import org.openqa.selenium.WebDriver;

public class OpenSourceGuidesPage {

    private WebDriver driver;

    public OpenSourceGuidesPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
