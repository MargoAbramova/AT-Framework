
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static constants.Constant.Urls.CIAN_HOME_PAGE;

@Test
public class SearchApartmentTest extends BaseTest {
    public void checkIsRedirectToListing() {
        basePage.open(CIAN_HOME_PAGE);
        cianHomePagetHomePage
                .enterCountRooms()
                .clickToFind();
        cianListingPage.checkCountCards();
        cianListingPage.clickOnFirstCard();

        List<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(1));

        Assert.assertFalse(cianCardPage.getDescriptionText().isEmpty());
    }

}
