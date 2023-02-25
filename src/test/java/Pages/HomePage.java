package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    private WebElement searchResult;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchResults() {
        return searchResults;
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    WebElement searchResults;


    public WebElement getSearchResult() {
        return searchResults;
    }

    @FindBy(xpath = "//a[@class=\"a-link-normal s-no-outline\"][1]")
    private WebElement SelectchocolateGiftHamper;

    public WebElement getSelectbags() {
        return Selectbags;
    }

    @FindBy(xpath = "//a[@class=\"a-link-normal s-no-outline\"][1]")
    private WebElement Selectbags;

    public WebElement getSelectchocolateGiftHamper() {
        return SelectchocolateGiftHamper;

    }
    @FindBy(xpath = "//a[@class=\"a-link-normal s-no-outline\"][1]")
    private WebElement SelectPandaTeddy;

        public WebElement getSelectPandaTeddy() {
            return SelectPandaTeddy;

        }

}








