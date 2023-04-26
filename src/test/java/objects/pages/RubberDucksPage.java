package objects.pages;

import base.PageBase;
import objects.controls.SortingButtons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static helpers.WebBrowser.webBrowser;

public class RubberDucksPage extends PageBase {

    private String TITLE_EXPECTED = "Rubber Ducks | My Store";

    private By YELLOW_DUCK = By.cssSelector("a.link[title='Yellow Duck']");
    private By DUCK_NAME = By.cssSelector("ul.listing-wrapper.products div.name");
    private By PRICE = By.cssSelector("ul.listing-wrapper.products span.price, strong.campaign-price");
    private By STICKER_SALE = By.cssSelector("div.sticker.sale");

    private List<String> ducksNamesExpected;
    private List<String> ducksNamesReal;
    private List<String> ducksPricesExpected;
    private List<String> ducksPricesReal;


    public boolean isLoaded() {
        return isTitlePresented(TITLE_EXPECTED);
    }

    public RubberDucksPage clickNameSortingButton() {
        SortingButtons.clickButtonName();
        return this;
    }

    public RubberDucksPage clickPriceSortingButton() {
        SortingButtons.clickButtonPrice();
        return this;
    }

    public RubberDucksPage getExpectedNameSortingList() {
        ducksNamesExpected = getCurrentList(DUCK_NAME);
        Collections.sort(ducksNamesExpected);
        return this;
    }

    public RubberDucksPage getExpectedPriceSortingList() {
        ducksPricesExpected = getCurrentList(PRICE);
        Collections.sort(ducksPricesExpected);
        return this;
    }

    public RubberDucksPage getRealNameSortingList() {
        ducksNamesReal = getCurrentList(DUCK_NAME);
        return this;
    }

    public RubberDucksPage getRealPriceSortingList() {
        ducksPricesReal = getCurrentList(PRICE);
        return this;
    }

    public boolean isNameListExpectedEqualsReal() {
        return isListsEquals(ducksNamesExpected, ducksNamesReal);
    }

    public boolean isPriceListExpectedEqualsReal() {
        return isListsEquals(ducksPricesExpected, ducksPricesReal);
    }

    public boolean checkSaleStickerOnYellowDuck() {
        return checkStickerOnDuck(YELLOW_DUCK, STICKER_SALE);
    }

    private List<String> getCurrentList(By selector) {
        List<String> currentList = new ArrayList<>();
        for (WebElement webElement : webBrowser().findElements(selector)) {
            currentList.add(webElement.getText());
        }
        return currentList;
    }

    private boolean isListsEquals(List<String> expectedList, List<String> realList) {
        return expectedList.equals(realList);
    }

    private boolean checkStickerOnDuck(By duck, By sticker) {
        return webBrowser().findElement(duck).findElement(sticker).isDisplayed();
    }
}
