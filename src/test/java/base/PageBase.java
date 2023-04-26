package base;

import objects.controls.MainMenu;
import objects.controls.SortingButtons;

import static helpers.WebBrowser.webBrowser;

public class PageBase {

    public boolean isTitlePresented(String TITLE_EXPECTED) {
        return webBrowser().getTitle().contains(TITLE_EXPECTED);
    }

    public MainMenu switchToMainMenu() {
        return new MainMenu();
    }

    public SortingButtons switchToSortingButtons() {
        return new SortingButtons();
    }
}
