import org.openqa.selenium.WebDriver;

public class PackagesPage {

    private WebDriver driver;

    public PackagesPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
