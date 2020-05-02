package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MainPage {
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".car-type.search-area__tab-icon.icon-osobowe")
    private WebElement osoboweSearchingOption;
    @FindBy(xpath = "//span[@id='select2-param571-container']")
    private WebElement brandDropdown;
    @FindBy(css = ".select2-search__field")
    private WebElement brandDropdownTextField;
    @FindBy(xpath = "//ul[@class='select2-results__options select2-results__options--nested']")
    private List<WebElement> brandDropdownSearchResults;
    @FindBy(xpath = "//span[@id='select2-param573-container']")
    private WebElement modelDropdown;
    @FindBy(css = ".select2-results__option.select2-results__option--highlighted")
    private WebElement modelDropdownSearchResult;
    @FindBy(xpath = "//button[@data-test='29-ad-search-submit']")
    private WebElement searchButton;
    @FindBy(css = ".select2.select2-container.select2-container--suggestions")
    private List<WebElement> searchFields;


    public void FillMaximalPriceField(String maximalPrice){
       searchFields.get(1).click();
       searchFields.get(1).sendKeys(maximalPrice);
    }
    public void FillMinimalPriceField(String minimalPrice){
        searchFields.get(0).click();
        searchFields.get(0).click();
        searchFields.get(0).sendKeys(minimalPrice);
    }

    public void ClickSearchButton(){
        searchButton.click();
    }

    public void selectModel(String model){
        modelDropdown.click();
        brandDropdownTextField.sendKeys(model);
        modelDropdownSearchResult.click();
    }

    public void selectBrand(String brand) {
        brandDropdown.click();
        brandDropdownTextField.sendKeys(brand);
        brandDropdownSearchResults.get(1).click();

    }

    public void ClickOsoboweSearchingOption() {
        osoboweSearchingOption.click();
    }
}
