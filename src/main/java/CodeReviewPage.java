import org.openqa.selenium.WebDriver;

public class CodeReviewPage {

    private WebDriver driver;

    public CodeReviewPage(WebDriver driver) { this.driver = driver; }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
