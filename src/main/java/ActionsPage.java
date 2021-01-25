<<<<<<< HEAD
import org.openqa.selenium.WebDriver;

public class ActionsPage {

    private WebDriver driver;

    public ActionsPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
=======
import org.openqa.selenium.WebDriver;

public class ActionsPage {

    private WebDriver driver;

    public ActionsPage(WebDriver driver) {
        this.driver = driver;
    }

    /* To get current URL of page */
    public String getPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
>>>>>>> origin/main
