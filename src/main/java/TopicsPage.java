import org.openqa.selenium.WebDriver;

public class TopicsPage {

    private WebDriver driver;

    public TopicsPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

}
