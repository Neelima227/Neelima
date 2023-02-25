package steps;

import Pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.BrowserManager;
import utils.QaProps;
import utils.TestDataReader;

import java.util.HashMap;

public class StepDefinitions {

    private WebDriver driver;

    HomePage homePage;
    String url;
    private HashMap<String, String> data;
    Scenario scenario;
    private Pages.HomePage HomePage;


    public StepDefinitions(BrowserManager browserManager){
        this.driver=browserManager.getDriver();
    }

    @Before(order = 1)
    public void before(Scenario scenario){

        this.scenario=scenario;
    }
    @Given("User is logged in")
    public void User_user_logged_in(){
        url = QaProps.getValue("url");
        driver.get(url);
        //System.out.println(1 / 0);
        data = TestDataReader.getData(scenario.getName());
        homePage.getSelectchocolateGiftHamper().click();
        homePage. getSelectPandaTeddy().click();

    }


    @Given("the user navigates to the home page")
   public void the_user_navigates_to_the_home_page() {
        url = QaProps.getValue("url");
        driver.get(url);
      //  System.out.println(1 / 0);
        data = TestDataReader.getData(scenario.getName());

    }
    @When("the user enter the product name")
   public void the_user_enter_the_product_name() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("TypeValue"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);
        data = TestDataReader.getData(scenario.getName());


    }
    @Then("the product results should be displayed")
    public void the_product_results_should_be_displayed() {
            String text = homePage.getSearchResult().getText();
        data = TestDataReader.getData(scenario.getName());

    }
    @Given("Given the user navigates the invalid product")
    public void the_user_navigates_the_invalid_product() {
        url = QaProps.getValue("url");
        driver.get(url);
        //  System.out.println(1 / 0);
        data = TestDataReader.getData(scenario.getName());

    }

       @When("the user enter invalid product name")
    public void the_user_enter_invalid_product_name() {
           homePage = new HomePage(driver);
           homePage.getSearchBox().sendKeys(data.get("TypeValue"));
           homePage.getSearchBox().sendKeys(Keys.ENTER);
           data = TestDataReader.getData(scenario.getName());
       }
    @Then("the user able the get invalid results")
    public void the_user_able_the_get_invalid_results() {
        //String text = homePage.getSearchResult().getText();
        data = TestDataReader.getData(scenario.getName());



    }
    @Given("the user navigates to the chocolate gift hamper")
    public void the_user_navigates_to_the_chocolate_gift_hamper() {
        url = QaProps.getValue("url");
        driver.get(url);
        //  System.out.println(1 / 0);
        data = TestDataReader.getData(scenario.getName());
        homePage.getSelectchocolateGiftHamper().click();
    }
    @When("the user enter chocolate gift hamper product")
    public void the_user_enter_chocolate_gift_hamper_product() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("TypeValue"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);
        homePage.getSelectchocolateGiftHamper().sendKeys(Keys.ENTER);
        data = TestDataReader.getData(scenario.getName());

        driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]")).click();

    }

    @Then("the product chocolate gift hamper will be displayed")
    public void the_product_chocolate_gift_hamper_will_be_displayed() {
        String text = homePage.getSearchResult()
                .getText();
        data = TestDataReader.getData(scenario.getName());


    }
    @Given("the user navigates to the panda teddy product")
    public void the_user_navigates_the_panda_teddy_product() {
        url = QaProps.getValue("url");
        driver.get(url);
        //  System.out.println(1 / 0);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user enter panda teddy product")
    public void the_user_enter_panda_teddy_product() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("TypeValue"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);
        homePage.getSelectPandaTeddy().sendKeys(Keys.ENTER);

     //   driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]")).click();

    }
    @Then("the panda teddy product will displayed")
    public void the_panda_teddy_product_will_displayed() {
        String text = homePage.getSearchResult().getText();
        data = TestDataReader.getData(scenario.getName());


    }
    @Given("the user navigates to the bag product")
    public void the_user_navigates_to_the_bag_product() {
        url = QaProps.getValue("url");
        driver.get(url);
        //  System.out.println(1 / 0);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user enter bag product")
    public void the_user_enter_bag_product() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("TypeValue"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);
        homePage.getSelectbags().sendKeys(Keys.ENTER);
        data = TestDataReader.getData(scenario.getName());

       // driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]")).click();

    }
    @Then("the bag product will displayed")
    public void the_bag_product_will_displayed() {
        String text = homePage.getSearchResult().getText();
        data = TestDataReader.getData(scenario.getName());

    }




}
