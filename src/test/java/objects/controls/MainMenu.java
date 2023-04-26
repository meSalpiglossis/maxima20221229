package objects.controls;

import objects.pages.RubberDucksPage;
import objects.pages.SubcategoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static helpers.WebBrowser.webBrowser;

public class MainMenu {

    private Actions make = new Actions(webBrowser());

    private static By LINK_RUBBER_DUCKS = By.linkText("Rubber Ducks");
    private static By LINK_SUBCATEGORY = By.linkText("Subcategory");

    public boolean isLoaded() {
        //TODO: logic
        return true;
    }

    public MainMenu hoverOverMenuRubberDucks() {
        make.moveToElement(find(LINK_RUBBER_DUCKS)).perform();
        return this;
    }

    public MainMenu hoverOverMenuSubcategory() {
        make.moveToElement(find(LINK_SUBCATEGORY)).perform();
        return this;
    }

    public MainMenu click() {
        make.click().perform();
        return this;
    }

    public RubberDucksPage clickMenuRubberDucks() {
        find(LINK_RUBBER_DUCKS).click();
        return new RubberDucksPage();
    }

    public SubcategoryPage clickMenuSubcategory() {
        find(LINK_SUBCATEGORY).click();
        return new SubcategoryPage();
    }

    private WebElement find(By link) {
        return webBrowser().findElement(link);
    }
}
