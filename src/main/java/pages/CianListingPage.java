package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CianListingPage extends BasePage {
    private final By card = By.xpath("//article[@data-name='CardComponent']");

    public CianListingPage(WebDriver driver) {
        super(driver);
    }

    public CianListingPage checkCountCards() {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 28);
        return this;
    }

    public CianListingPage clickOnFirstCard() {
        driver.findElement(card).click();
        return this;
    }

}
