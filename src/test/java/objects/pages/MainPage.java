package objects.pages;

import base.PageBase;

public class MainPage extends PageBase {

    private static String TITLE_EXPECTED = "Online Store | My Store";



    public boolean isLoaded() {
        return isTitlePresented(TITLE_EXPECTED);
    }
}
