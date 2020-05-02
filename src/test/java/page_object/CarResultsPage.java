package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CarResultsPage {
    public CarResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1")
    private WebElement searchingTitle;
    @FindBy(css = ".offer-title__link")
    List<WebElement> adResultList;

    public List<WebElement> getAdResultList() {
        return adResultList;
    }

    public String getSearchingTitle(){
        return searchingTitle.getText();
    }
}
