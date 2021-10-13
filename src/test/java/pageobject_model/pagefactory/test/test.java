package pageobject_model.pagefactory.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject_model.pagefactory.page.AmazonHomePage;
import pageobject_model.pagefactory.page.AmazonSearchResultsPage;

public class test {
    private WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        driver = new ChromeDriver();
    }
    @Test(description = "Just first pageobject_model.pagefactory.test.pageobject_model.pagefactory.test, JIRA binding can de here")
    public void commonSearchTermReResultsNotEmpty(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.openPage();
        amazonHomePage.searchForTerms("iphone 12");
        AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
        int expectedSearchResultsNumber = amazonSearchResultsPage.countSearchResults();

        Assert.assertTrue(expectedSearchResultsNumber>0, "Search results are empty!");

    }
    @AfterMethod(alwaysRun = true)
    public void browserTearDown(){
        driver.quit();
        driver = null;
    }
}
