import org.openqa.selenium.WebDriver;

public class ExplorePage {

    private WebDriver driver;

    public ExplorePage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

}