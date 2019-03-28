package object;

import base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*Page Object of Opened Result page*/
public class SearchTextPage extends PageObject {

    @FindBy(xpath = "(//div[@class='ce-bodytext'])[1]//p")
    WebElement searchResultText;

    public SearchTextPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public String getSearchResultText() {

        waitForElementVisibility(searchResultText);
        return searchResultText.getText();

    }
}
