import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        String actualURL = featuresPage.getPageURL();
        URL expectedURL = new URL("https://github.com/features");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkWghCodeReview() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghCodeReview();
        CodeReviewPage codeReviewPage = new CodeReviewPage(driver);
        String actualURL = codeReviewPage.getPageURL();
        URL expectedURL = new URL("https://github.com/features/code-review/");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkWghProjectManagement() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghProjectManagement();
        ProjectManagementPage projectManagementPage = new ProjectManagementPage(driver);
        String actualURL = projectManagementPage.getPageURL();
        URL expectedURL = new URL("https://github.com/features/project-management/");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkWghIntegrations() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghIntegrations();
        IntegrationsPage integrationsPage = new IntegrationsPage(driver);
        String actualURL = integrationsPage.getPageURL();
        URL expectedURL = new URL("https://github.com/features/integrations");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkWghActions() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghActions();
        ActionsPage actionsPage = new ActionsPage(driver);
        String actualURL = actionsPage.getPageURL();
        URL expectedURL = new URL("https://github.com/features/actions");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkWghPackages() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghPackages();
        PackagesPage packagesPage = new PackagesPage(driver);
        String actualURL = packagesPage.getPageURL();
        URL expectedURL = new URL("https://github.com/features/packages");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkWghSecurity() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghSecurity();
        SecurityPage securityPage = new SecurityPage(driver);
        String actualURL = securityPage.getPageURL();
        URL expectedURL = new URL("https://github.com/features/security");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

/*    @Test
    public void checkWghTeamManagement() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghTeamManagement();
        TeamManagementPage teamManagementPage = new TeamManagementPage(driver);
        String actualURL = teamManagementPage.getPageURL();
        URL expectedURL = new URL("https://github.com/features#team-management");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }*/

    /*@Test
    public void checkWghHosting() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghHosting();
        HostingPage hostingPage = new HostingPage(driver);
        String actualURL = hostingPage.getPageURL();
        URL expectedURL = new URL("https://github.com/features#hosting");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }*/

    @Test
    public void checkWghGitHubSponsors() {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickWghGitHubSponsors();
        WebElement expectedElem = driver.findElement(By.xpath("//small[contains(text(),'GitHub Sponsors')]"));
        Assert.assertTrue(expectedElem.isDisplayed());
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
        String actualURL = securityPage2.getPageURL();
        URL expectedURL = new URL("https://github.com/security");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkTeam1() {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickTeam();
        WebElement expectedElem = driver.findElement(By.xpath("//h4[contains(text(),'GitHub for Teams')]"));
        Assert.assertTrue(expectedElem.isDisplayed());
    }

    @Test
    public void checkTeam2() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickTeam();
        TeamPage teamPage = new TeamPage(driver);
        String actualURL = teamPage.getPageURL();
        URL expectedURL = new URL("https://github.com/team");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkEnterprise1() {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickEnterprise();
        WebElement expectedElem = driver.findElement(By.xpath("//h4[contains(text(),'GitHub for enterprises')]"));
        Assert.assertTrue(expectedElem.isDisplayed());
    }

    @Test
    public void checkEnterprise2() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickEnterprise();
        EnterprisePage enterprisePage = new EnterprisePage(driver);
        String actualURL = enterprisePage.getPageURL();
        URL expectedURL = new URL("https://github.com/enterprise");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkExplore1() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickExplrExploreGitHub();
        ExplorePage explorePage = new ExplorePage(driver);
        String actualURL = explorePage.getPageURL();
        URL expectedURL = new URL("https://github.com/explore");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkExplore2() {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickExplrExploreGitHub();
        WebElement expectedElem = driver.findElement(By.xpath("//h2[contains(text(),\"Here's what's popular on GitHub today...\")]"));
        Assert.assertTrue(expectedElem.isDisplayed());
    }

    @Test
    public void checkExplrTopics1() {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickExplrTopics();
        WebElement expectedElem = driver.findElement(By.xpath("//h1[contains(text(),'Topics')]"));
        Assert.assertTrue(expectedElem.isDisplayed());
    }

    @Test
    public void checkExplrTopics2() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickExplrTopics();
        TopicsPage topicsPage = new TopicsPage(driver);
        String actualURL = topicsPage.getPageURL();
        URL expectedURL = new URL("https://github.com/topics");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkExplrCollections1() {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickExplrCollections();
        WebElement expectedElem = driver.findElement(By.xpath("//h1[contains(text(),'Collections')]"));
        Assert.assertTrue(expectedElem.isDisplayed());
    }

    @Test
    public void checkExplrCollections2() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickExplrCollections();
        CollectionsPage collectionsPage = new CollectionsPage(driver);
        String actualURL = collectionsPage.getPageURL();
        URL expectedURL = new URL("https://github.com/collections");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkExplrTrending1() {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickExplrTrending();
        WebElement expectedElem = driver.findElement(By.xpath("//h1[contains(text(),'Trending')]"));
        Assert.assertTrue(expectedElem.isDisplayed());
    }

    @Test
    public void checkExplrTrending2() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickExplrTrending();
        TrendingPage trendingPage = new TrendingPage(driver);
        String actualURL = trendingPage.getPageURL();
        URL expectedURL = new URL("https://github.com/trending");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkExplrLearningLab() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickExplrLearningLab();
        LearningLabPage learningLabPage = new LearningLabPage(driver);
        String actualURL = learningLabPage.getPageURL();
        URL expectedURL = new URL("https://lab.github.com/");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }

    @Test
    public void checkExplrOpenSourceGuides() throws MalformedURLException {
        MainPageHeaderMenu mainPageHeaderMenu = new MainPageHeaderMenu(driver);
        mainPageHeaderMenu.clickExplrOpenSourceGuides();
        OpenSourceGuidesPage openSourceGuidesPage = new OpenSourceGuidesPage(driver);
        String actualURL = openSourceGuidesPage.getPageURL();
        URL expectedURL = new URL("https://opensource.guide/");
        Assert.assertEquals(expectedURL.toString(), actualURL);
    }


    @After
    public void tearDown() { driver.close(); }
}
