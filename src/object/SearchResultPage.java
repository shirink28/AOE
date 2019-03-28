package object;

import base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*Page Object of Search result page*/
public class SearchResultPage extends PageObject {

    @FindBy(xpath = "//a[@data-qa = 'search-result-list-item-image'][1]")
    WebElement searchResultImage;

    public SearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


    public void clickOnSearchResultImage() {
        waitForElementVisibility(searchResultImage);
        searchResultImage.click();

    }
}
