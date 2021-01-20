import org.openqa.selenium.WebDriver;

public class HostingPage {

    private WebDriver driver;

    public HostingPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
