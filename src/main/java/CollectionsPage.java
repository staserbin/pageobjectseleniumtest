import org.openqa.selenium.WebDriver;

public class CollectionsPage {

    private WebDriver driver;

    public CollectionsPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
