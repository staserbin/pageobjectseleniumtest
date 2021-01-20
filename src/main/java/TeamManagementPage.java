import org.openqa.selenium.WebDriver;

public class TeamManagementPage {

    private WebDriver driver;

    public TeamManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
