package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class CianCardPage extends BasePage {
    //локатор один для двух кнопок ибо нет элементов, к которым можно привязаться
    private final By descriptions = By.xpath("//div[@data-name='Description']//div[@data-name='Collapse']");

    public CianCardPage(WebDriver driver) {
        super(driver);

    }

    public String getDescriptionText() {
        waitElementIsPresent(descriptions);
        List<WebElement> elements = driver.findElements(descriptions);

        //Кликаем через js потому что куча объектов блокирующих клик
        JavascriptExecutor jsex = (JavascriptExecutor) driver;
        jsex.executeScript("arguments[0].click();", elements.get(0));


        Actions actions = new Actions(driver);
        actions.moveToElement(elements.get(1)).click().perform();

        // возвращааем текст элемента
        return elements.get(1).getText();

    }
}
//div[@data-name='NewbuildingTiledCarousel']//img