package Utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {


    @BeforeMethod(description = "Open the browser and extend the size")
    public  void setUp(){
        System.setProperty("selenide.browserSize", "1920x1080");
        open("https://space.ge/career/test-automation-engineer/");
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));

    }


    @AfterMethod(description = "Clear the cache and close the browser")
    public void tearDown(){
        SelenideLogger.removeListener("allure");
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();

    }



}