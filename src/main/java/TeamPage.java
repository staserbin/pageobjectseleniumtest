import org.openqa.selenium.WebDriver;

public class TeamPage {

    private WebDriver driver;

    public TeamPage(WebDriver driver) { this.driver = driver; }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

}
