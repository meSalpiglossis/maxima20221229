package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static helpers.WebBrowser.closeWebBrowser;
import static helpers.WebBrowser.webBrowser;


public class TestBase {

    String testURL = "https://litecart.stqa.ru/en/";

    @BeforeMethod
    protected void openAppInChromeBrowser() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        webBrowser().manage().window().maximize();
        webBrowser().get(testURL);
    }

    @AfterMethod
    protected void driverQuit() {
        closeWebBrowser();
    }
}
