import org.openqa.selenium.WebDriver;

public class LearningLabPage {

    private WebDriver driver;

    public LearningLabPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
