package Tests;

import Base.BaseTest;

import Pages.ABTestingPage;
import Pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoToABTestingPageTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://the-internet.herokuapp.com/");

    }
    @Test
    public void userIsOnABTestPage(){
        homePage.clickOnLinkText("A/B Testing");
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/abtest");
        Assert.assertTrue(abTestingPage.isDisplayed());
    }

}
