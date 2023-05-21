package tests;

import base.TestBase;
import objects.pages.MainPage;
import objects.pages.RubberDucksPage;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SortingTest extends TestBase {

    @Test(timeOut = 5000)
    public void sortingByNameTest() {
        RubberDucksPage rubberDucksPage = new MainPage()
            .switchToMainMenu()
            .clickMenuRubberDucks();
        assertTrue(rubberDucksPage.isLoaded());

        rubberDucksPage
            .getExpectedNameSortingList()
            .clickNameSortingButton()
            .getRealNameSortingList();

        assertTrue(rubberDucksPage.isNameListExpectedEqualsReal(), "Failed test: Expected and Real sorts are not equal.");
    }

    @Test(timeOut = 5000)
    public void sortingByPriceTest() {
        RubberDucksPage rubberDucksPage = new MainPage()
            .switchToMainMenu()
            .clickMenuRubberDucks();
        assertTrue(rubberDucksPage.isLoaded());

        rubberDucksPage
            .getExpectedPriceSortingList()
            .clickNameSortingButton()
            .clickPriceSortingButton()
            .getRealPriceSortingList();

        assertTrue(rubberDucksPage.isPriceListExpectedEqualsReal(), "Failed test: Expected and Real sorts are not equal.");
    }
}