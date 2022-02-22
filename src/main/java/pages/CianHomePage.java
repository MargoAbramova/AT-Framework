package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CianHomePage extends BasePage {
    private final By countRooms = By.xpath("//div[@data-mark='FilterRoomsCount']/button");
    private final By option1room = By.xpath("//div[@data-mark='FilterRoomsCount']//button[text()=1]");
    private final By findBtn = By.xpath("//a[@data-mark='FiltersSearchButton' and (text()='Найти')]");

    public CianHomePage(WebDriver driver) {
        super(driver);
    }

    public CianHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(option1room).click();
        return this;
    }

    public CianHomePage clickToFind() {
        WebElement btnFind = driver.findElement(findBtn);
        waitElementIsVisible(btnFind).click();
        return this;
    }
}
