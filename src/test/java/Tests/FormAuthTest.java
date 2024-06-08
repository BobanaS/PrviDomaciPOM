package Tests;

import Base.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormAuthTest extends BaseTest {

    @BeforeTest
    public void pageSetUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void LogIn() {
        homePage.clickOnLinkText("Form Authentication");
        formAuthPage.inputUsername("tomsmith");
        formAuthPage.inputPassword("SuperSecretPassword!");
        formAuthPage.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
        Assert.assertTrue(formAuthPage.fleshIsD());
    }

    @Test
    public void LogInwithWrongUsername() {
        homePage.clickOnLinkText("Form Authentication");
        formAuthPage.inputUsername("Bobana");
        formAuthPage.inputPassword("SuperSecretPassword!");
        formAuthPage.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        Assert.assertTrue(formAuthPage.fleshIsD());
    }

    @AfterMethod
    public void deleteC() {
        driver.manage().deleteAllCookies();
    }
}
