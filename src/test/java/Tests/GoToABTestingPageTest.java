package Tests;

import Base.BaseTest;

import Pages.ABTestingPage;
import Pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoToABTestingPageTest extends BaseTest {

    @BeforeTest
    public void pageSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

    }
    @Test
    public void userIsOnABTestPage(){
        homePage.clickOnLinkText("A/B Testing");
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/abtest");
        Assert.assertTrue(abTestingPage.isDisplayed());
    }

}
