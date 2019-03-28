package base;

import object.HomePage;
import object.SearchResultPage;
import object.SearchTextPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.CONSTANTS;

/*Base page object class for common methods*/
public class PageObject {



    public static WebDriver driver = PageTest.driver;

    public static void waitForElementVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, CONSTANTS.EXPLICITWAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitOnElement(WebElement element) {

        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
