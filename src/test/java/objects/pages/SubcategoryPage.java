package objects.pages;

import base.PageBase;
import objects.controls.SortingButtons;


public class SubcategoryPage extends PageBase {

    private final String TITLE_EXPECTED = "Subcategory | My Store";

    public boolean isLoaded() {
        return isTitlePresented(TITLE_EXPECTED);
    }



    public SubcategoryPage getExpectedNameSorting() {
        return this;
    }
}
