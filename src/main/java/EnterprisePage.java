import org.openqa.selenium.WebDriver;

public class EnterprisePage {

    private WebDriver driver;

    public EnterprisePage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

}
