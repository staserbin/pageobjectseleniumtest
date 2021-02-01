import org.openqa.selenium.WebDriver;

public class TrendingPage {

    private WebDriver driver;

    public TrendingPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
