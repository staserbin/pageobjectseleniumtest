import org.openqa.selenium.WebDriver;

public class ProjectManagementPage {

    private WebDriver driver;

    public ProjectManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
