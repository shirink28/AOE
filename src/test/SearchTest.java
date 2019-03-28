package test;

import base.PageObject;
import base.PageTest;
import object.HomePage;
import object.SearchResultPage;
import object.SearchTextPage;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import util.CONSTANTS;

public class SearchTest extends PageTest {


    HomePage home = null;
    SearchResultPage result = null;
    SearchTextPage text = null;


    @Before
    public void initDriver() {
        /*Initialising the Chrome driver*/
        WebDriver driver = initChromeDriver();
        /*Creating Instances of each Page Object*/

        PageObject b= new PageObject();
        home = new HomePage(driver);
        result = new SearchResultPage(driver);
        text = new SearchTextPage(driver);

    }

    @Test
    public void SearchResult() throws InterruptedException {
        /*Navgating to the Application URL*/
        driver.get(CONSTANTS.URL);
        /*Step 1: Click on Search icon*/
        home.clickSearchIcon();
        /*Step 2: Enter the text to be searched*/
        home.enterSearchText("blog");
        /*Step 3: Click on Show Results Button*/
        home.clickSearchButton();
        /*Step 4: Click on the image of first search result*/
        result.clickOnSearchResultImage();
        /*Step 5: Validate the text of opened searched result*/
        String textValue = text.getSearchResultText();
        Assert.assertNotNull(textValue);


    }

    @After
    public void exitDriver() {
        /*Closing the driver*/
        driver.quit();

    }

}
