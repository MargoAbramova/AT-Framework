
import org.testng.annotations.Test;

import static constants.Constant.Urls.REALT_HOME_PAGE;

@Test
public class SearchApartmentTest extends BaseTest {
    public void checkIsRedirectToListing() {
        basePage.open(REALT_HOME_PAGE);
        realtHomePage
                .enterCountRooms()
                .clickToFind();
        realtListingPage.checkCountCards();
    }

}
