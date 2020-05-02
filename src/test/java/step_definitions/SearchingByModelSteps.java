package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import page_object.CarResultsPage;
import page_object.MainPage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchingByModelSteps extends Base_Step {
    List<Double> minMaxPrice = new ArrayList<>();
    List<String> brandAndModel = new ArrayList<>();
    @Given("User is not logged in")
    public void userIsNotLoggedIn() {
    }

    @When("User select brand by (.*)")
    public void userSelectBrandByName(String brand) {
       new MainPage(driver).selectBrand(brand);
       brandAndModel.add(brand);
    }

    @And("User select model by (.*)")
    public void userSelectModelByA(String model) {
        new MainPage(driver).selectModel(model);
        brandAndModel.add(model);
    }

    @And("User click search button")
    public void userClickSearchButton() {
        new MainPage(driver).ClickSearchButton();
    }

    @Then("Searching title should contains selected model and brand")
    public void searchingTitleShouldContainsSelectedModelAndBrand() throws InterruptedException {
        Thread.sleep(2000);
    String searchingTitle = new CarResultsPage(driver).getSearchingTitle();
        Assert.assertTrue(searchingTitle.contains(brandAndModel.get(0)));
        Assert.assertTrue(searchingTitle.contains(brandAndModel.get(1)));
    }

    @And("Ads titles should contain model and brand")
    public void adsTitlesShouldContainModelAndBrand() {
        List<WebElement> results = new CarResultsPage(driver).getAdResultList();
        for(int i = 0; i <results.size(); i++){
            Assert.assertTrue(results.get(i).getText().contains(brandAndModel.get(0)));
            Assert.assertTrue(results.get(i).getText().contains(brandAndModel.get(1)));
        }
        driver.quit();
    }

    @When("User fill minimal price with (.*)")
    public void userFillMinimalPriceWithMinimalPrice(String minimalPrice) {
        new MainPage(driver).FillMinimalPriceField(minimalPrice);
        double minPrice = Double.parseDouble(minimalPrice);
        minMaxPrice.add(minPrice);
    }

    @And("User fill maximal price with (.*)")
    public void userFillMaximalPriceWithMaximalPrice(String maximalPrice) {
        new MainPage(driver).FillMaximalPriceField(maximalPrice);
        double maxPrice = Double.parseDouble(maximalPrice);
        minMaxPrice.add(maxPrice);

    }
}
