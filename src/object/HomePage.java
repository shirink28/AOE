package object;

import base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*Page object of Home Page*/
public class HomePage extends PageObject {

    @FindBy(xpath = "//a[@data-qa='header-navigation-search-icon']")
    WebElement searchIcon;

    @FindBy(xpath = "//input[@id='search']")
    WebElement searchTextBox;

    @FindBy(id = "show-results")
    WebElement searchSubmitButton;


   public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSearchIcon() {
        waitForElementVisibility(searchIcon);
        searchIcon.click();
    }

    public void clickSearchButton() {
        waitForElementVisibility(searchSubmitButton);
        searchSubmitButton.click();
    }


    public void enterSearchText(String text) {
        try {
            waitForElementVisibility(searchTextBox);
            searchTextBox.clear();
            searchTextBox.sendKeys(text);
            waitOnElement(searchTextBox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
