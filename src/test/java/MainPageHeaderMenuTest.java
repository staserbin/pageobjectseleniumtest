import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.reporters.jq.Main;

import java.net.MalformedURLException;
import java.net.URL;

public class MainPageHeaderMenuTest extends Application {

    public WebDriver driver;

    @Before
    public void setUp() { driver = appSetUp(); }

    /* wghFeatures validation */
    @Test
    public void checkWghFeatures() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghFeatures();
        FeaturesPage featuresPage = new FeaturesPage(driver);
        String searchURL = featuresPage.getPageURL();
        URL url = new URL("https://github.com/features");
        Assert.assertEquals(url.toString(), searchURL);
    }

    @Test
    public void checkWghCodeReview() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghCodeReview();
        CodeReviewPage codeReviewPage = new CodeReviewPage(driver);
        String searchURL = codeReviewPage.getPageURL();
        URL url = new URL("https://github.com/features/code-review/");
        Assert.assertEquals(url.toString(), searchURL);
    }

    @Test
    public void checkWghProjectManagement() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghProjectManagement();
        ProjectManagementPage projectManagementPage = new ProjectManagementPage(driver);
        String searchURL = projectManagementPage.getPageURL();
        URL url = new URL("https://github.com/features/project-management/");
        Assert.assertEquals(url.toString(), searchURL);
    }

    @Test
    public void checkWghIntegrations() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghIntegrations();
        IntegrationsPage integrationsPage = new IntegrationsPage(driver);
        String searchURL = integrationsPage.getPageURL();
        URL url = new URL("https://github.com/features/integrations");
        Assert.assertEquals(url.toString(), searchURL);
    }

    @Test
    public void checkWghActions() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghActions();
        ActionsPage actionsPage = new ActionsPage(driver);
        String searchURL = actionsPage.getPageURL();
        URL url = new URL("https://github.com/features/actions");
        Assert.assertEquals(url.toString(), searchURL);
    }

    @Test
    public void checkWghPackages() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghPackages();
        PackagesPage packagesPage = new PackagesPage(driver);
        String searchURL = packagesPage.getPageURL();
        URL url = new URL("https://github.com/features/packages");
        Assert.assertEquals(url.toString(), searchURL);
    }

    @Test
    public void checkWghSecurity() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghSecurity();
        SecurityPage securityPage = new SecurityPage(driver);
        String searchURL = securityPage.getPageURL();
        URL url = new URL("https://github.com/features/security");
        Assert.assertEquals(url.toString(), searchURL);
    }

    @Test
    public void checkWghTeamManagement() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghTeamManagement();
        TeamManagementPage teamManagementPage = new TeamManagementPage(driver);
        String searchURL = teamManagementPage.getPageURL();
        URL url = new URL("https://github.com/features#team-management");
        Assert.assertEquals(url.toString(), searchURL);
    }

    @Test
    public void checkWghHosting() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghHosting();
        HostingPage hostingPage = new HostingPage(driver);
        String searchURL = hostingPage.getPageURL();
        URL url = new URL("https://github.com/features#hosting");
        Assert.assertEquals(url.toString(), searchURL);
    }

    @Test
    public void checkWghCustomerStories() {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghCustomerStories();
        WebElement expectedElem = driver.findElement(By.xpath("//body/div[4]/main[1]/div[1]/nav[1]/div[1]/a[1]"));
        Assert.assertTrue(expectedElem.isDisplayed());
    }

    @Test
    public void checkWghSecurity2() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghSecurity2();
        SecurityPage2 securityPage2 = new SecurityPage2(driver);
        String searchURL = securityPage2.getPageURL();
        URL url = new URL("https://github.com/security");
        Assert.assertEquals(url.toString(), searchURL);
    }


    @After
    public void tearDown() { driver.close(); }
}
