import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPageHeaderMenu {

    private WebDriver driver;

    // Alt+Insert добавить Constructor
    public MainPageHeaderMenu(WebDriver driver) { this.driver = driver; }

    /* Why GitHub drop-down */
    private By WhyGitHub = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[1]/details[1]/summary[1]");
    private By wghFeatures = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[1]/details[1]/div[1]/a[1]");
    private By wghCodeReview = By.xpath("//a[contains(text(),'Code review')]");
    private By wghProjectManagement = By.xpath("//a[contains(text(),'Project management')]");
    private By wghIntegrations = By.xpath("//a[contains(text(),'Integrations')]");
    private By wghActions = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[1]/details[1]/div[1]/ul[1]/li[2]/a[1]");
    private By wghPackages = By.xpath("//a[contains(text(),'Packages')]");
    private By wghSecurity = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[1]/details[1]/div[1]/ul[1]/li[5]/a[1]");
    /*private By wghTeamManagement = By.xpath("//a[contains(text(),'Team management')]");*/
    /*private By wghHosting = By.xpath("//a[contains(text(),'Hosting')]");*/
    private By wghGitHubSponsors = By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/details[1]/div[1]/ul[2]/li[1]/a[1]");
    private By wghCustomerStories = By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/details[1]/div[1]/ul[2]/li[2]/a[1]");
    private By wghSecurity2 = By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/details[1]/div[1]/ul[2]/li[3]/a[1]");

    /* Team button */
    private By bTeam = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]");

    /* Enterprise button */
    private By bEnterprise = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]");

    /* Explore drop-down */
    private By Explore = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[4]/details[1]/summary[1]");
    private By explrExploreGitHub = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[4]/details[1]/div[1]/ul[1]/li[1]/a[1]");
    private By explrTopics = By.xpath("//a[contains(text(),'Topics')]");
    private By explrCollections = By.xpath("//a[contains(text(),'Collections')]");
    private By explrTrending = By.xpath("//a[contains(text(),'Trending')]");
    private By explrLearningLab = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[4]/details[1]/div[1]/ul[2]/li[4]/a[1]");
    private By explrOpenSourceGuides = By.xpath("//a[contains(text(),'Open source guides')]");
    private By explrTheReadMeProject = By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/details[1]/div[1]/ul[3]/li[1]/a[1]");
    private By explrEvents = By.xpath("//a[contains(text(),'Events')]");
    private By explrCommunityForum = By.xpath("//a[contains(text(),'Community forum')]");
    private By explrGitHubEducation = By.xpath("//a[contains(text(),'GitHub Education')]");
    private By explrGitHubStarsProgram = By.xpath("//a[contains(text(),'GitHub Stars program')]");

    /* Marketplace button */
    private By bMarketplace = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[5]/a[1]");

    /* Pricing drop-down */
    private By Pricing = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[6]/details[1]/summary[1]");
    private By pricingPlans = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[6]/details[1]/div[1]/a[1]");
    private By pricingComparePlans = By.xpath("//a[contains(text(),'Compare plans')]");
    private By pricingContactSales = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[6]/details[1]/div[1]/ul[1]/li[2]/a[1]");
    private By pricingNonprofit = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[6]/details[1]/div[1]/ul[2]/li[1]/a[1]");
    private By pricingEducation = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[6]/details[1]/div[1]/ul[2]/li[2]/a[1]");

    /* Moving mouse cursor to the WhyGitHub element */
    private void navigateToWhyGitHub() {
        driver.findElement(WhyGitHub).click();
    }

    public FeaturesPage clickWghFeatures() {
        navigateToWhyGitHub();
        driver.findElement(wghFeatures).click();
        return new FeaturesPage(driver);
    }

    public CodeReviewPage clickWghCodeReview() {
        navigateToWhyGitHub();
        driver.findElement(wghCodeReview).click();
        return new CodeReviewPage(driver);
    }

    public ProjectManagementPage clickWghProjectManagement() {
        navigateToWhyGitHub();
        driver.findElement(wghProjectManagement).click();
        return new ProjectManagementPage(driver);
    }

    public IntegrationsPage clickWghIntegrations() {
        navigateToWhyGitHub();
        driver.findElement(wghIntegrations).click();
        return new IntegrationsPage(driver);
    }

    public ActionsPage clickWghActions() {
        navigateToWhyGitHub();
        driver.findElement(wghActions).click();
        return new ActionsPage(driver);
    }

    public PackagesPage clickWghPackages() {
        navigateToWhyGitHub();
        driver.findElement(wghPackages).click();
        return new PackagesPage(driver);
    }

    public SecurityPage clickWghSecurity() {
        navigateToWhyGitHub();
        driver.findElement(wghSecurity).click();
        return new SecurityPage(driver);
    }

    /*public TeamManagementPage clickWghTeamManagement() {
        navigateToWhyGitHub();
        driver.findElement(wghTeamManagement).click();
        return new TeamManagementPage(driver);
    }*/

    /*public HostingPage clickWghHosting() {
        navigateToWhyGitHub();
        driver.findElement(wghHosting).click();
        return new HostingPage(driver);
    }*/

    public CustomerStoriesPage clickWghGitHubSponsors() {
        navigateToWhyGitHub();
        driver.findElement(wghGitHubSponsors).click();
        return new CustomerStoriesPage(driver);
    }

    public CustomerStoriesPage clickWghCustomerStories() {
        navigateToWhyGitHub();
        driver.findElement(wghCustomerStories).click();
        return new CustomerStoriesPage(driver);
    }

    public SecurityPage2 clickWghSecurity2() {
        navigateToWhyGitHub();
        driver.findElement(wghSecurity2).click();
        return new SecurityPage2(driver);
    }

    public TeamPage clickTeam() {
        driver.findElement(bTeam).click();
        return new TeamPage(driver);
    }

    public EnterprisePage clickEnterprise() {
        driver.findElement(bEnterprise).click();
        return new EnterprisePage(driver);
    }

    /* Moving mouse cursor to the Explore element */
    private void navigateToExplore() {
        driver.findElement(Explore).click();
    }

    public ExplorePage clickExplrExploreGitHub() {
        navigateToExplore();
        driver.findElement(explrExploreGitHub).click();
        return new ExplorePage(driver);
    }

    public TopicsPage clickExplrTopics() {
        navigateToExplore();
        driver.findElement(explrTopics).click();
        return new TopicsPage(driver);
    }

    public CollectionsPage clickExplrCollections() {
        navigateToExplore();
        driver.findElement(explrCollections).click();
        return new CollectionsPage(driver);
    }

    public TrendingPage clickExplrTrending() {
        navigateToExplore();
        driver.findElement(explrTrending).click();
        return new TrendingPage(driver);
    }

    public LearningLabPage clickExplrLearningLab() {
        navigateToExplore();
        driver.findElement(explrLearningLab).click();
        return new LearningLabPage(driver);
    }

    public OpenSourceGuidesPage clickExplrOpenSourceGuides() {
        navigateToExplore();
        driver.findElement(explrOpenSourceGuides);
        return new OpenSourceGuidesPage(driver);
    }

}
