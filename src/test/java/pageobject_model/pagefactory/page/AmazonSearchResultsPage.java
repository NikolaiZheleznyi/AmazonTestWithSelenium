package pageobject_model.pagefactory.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AmazonSearchResultsPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='sg-col-inner']//span[contains(text(), 'Apple iPhone')]")
    private  List<WebElement> fieldResult;

    public AmazonSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int countSearchResults(){
        System.out.println("Search results number for requested term: "+ fieldResult.size());
        return fieldResult.size();
    }

   // List<WebElement> fieldResult = driver.findElements(By.xpath("//div[@class='sg-col-inner']//span[contains(text(), 'Apple iPhone')]"));


}
