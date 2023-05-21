package tests;

import base.TestBase;
import objects.pages.MainPage;
import objects.pages.RubberDucksPage;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class StickerCheckTest extends TestBase {

    @Test(timeOut = 5000)
    public void saleStickerOnYellowDuckTest() {
        RubberDucksPage rubberDucksPage = new MainPage()
            .switchToMainMenu()
            .clickMenuRubberDucks();
        assertTrue(rubberDucksPage.isLoaded());

        boolean isStickerPresented = rubberDucksPage.checkSaleStickerOnYellowDuck();

        assertTrue(isStickerPresented, "Failed test: 'Sale' sticker not presented");
    }

}