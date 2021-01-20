import org.openqa.selenium.WebDriver;

public class FeaturesPage {

    private WebDriver driver;

    public FeaturesPage(WebDriver driver) { this.driver = driver; }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
