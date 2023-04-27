package tests;

import base.TestBase;
import objects.controls.MainMenu;
import objects.pages.MainPage;
import objects.pages.SubcategoryPage;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SubcategoryTest extends TestBase {

    @Test(timeOut = 5000)
    public void menuSubcategoryTest() {
        assertTrue(new MainPage().isLoaded());
        MainMenu mainMenu = new MainMenu();

        mainMenu
            .hoverOverMenuRubberDucks()
            .hoverOverMenuSubcategory()
            .click();

        assertTrue(new SubcategoryPage().isLoaded());
    }


}
