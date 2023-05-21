package objects.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helpers.WebBrowser.webBrowser;

public class SortingButtons {

    private static By BUTTON_NAME = By.linkText("Name");
    private static By BUTTON_PRICE = By.linkText("Price");
    private static By BUTTON_POPULARITY = By.linkText("Popularity");
    private static By BUTTON_DATE = By.linkText("Date");

    public boolean isLoaded() {
        //TODO: logic
        return true;
    }

    public static void clickButtonName() {
        find(BUTTON_NAME).click();
    }

    public static void clickButtonPrice() {
        find(BUTTON_PRICE).click();
    }

    public static void clickButtonPopularity() {
        find(BUTTON_POPULARITY).click();
    }

    public static void clickButtonDate() {
        find(BUTTON_DATE).click();
    }

    private static WebElement find(By link) {
        return webBrowser().findElement(link);
    }
}
