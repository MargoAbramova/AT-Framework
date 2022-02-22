import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.BasePage;
import pages.CianCardPage;
import pages.CianHomePage;
import pages.CianListingPage;

import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createdDriver();
    protected BasePage basePage = new BasePage(driver);
    protected CianHomePage cianHomePagetHomePage = new CianHomePage(driver);
    protected CianListingPage cianListingPage = new CianListingPage(driver);
    protected CianCardPage cianCardPage = new CianCardPage(driver);


    @AfterSuite(alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
