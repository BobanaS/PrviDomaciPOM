package Tests;

import Base.BaseTest;
import Pages.FormAuthPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormAuthTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://the-internet.herokuapp.com/");

    }
    public void goToLogInPage(){
        homePage.clickOnLinkText("Form Authentication");
    }
    @Test
    public void LogIn() {
        goToLogInPage();
        formAuthPage.inputUsername("tomsmith");
        formAuthPage.inputPassword("SuperSecretPassword!");
        formAuthPage.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
        Assert.assertTrue(formAuthPage.fleshIsD());
    }

    @Test
    public void LogInwithWrongUsername() {
        goToLogInPage();
        formAuthPage.inputUsername("Bobana");
        formAuthPage.inputPassword("SuperSecretPassword!");
        formAuthPage.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        Assert.assertTrue(formAuthPage.fleshIsD());
    }
    @Test
    public void LogInwithWrongPassword() {
        goToLogInPage();
        formAuthPage.inputUsername("tomsmith");
        formAuthPage.inputPassword("Bobana");
        formAuthPage.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        Assert.assertTrue(formAuthPage.fleshIsD());
    }
    @Test
    public void LogInwithWrongUsernameAndPassword() {
        goToLogInPage();
        formAuthPage.inputUsername("");
        formAuthPage.inputPassword("");
        formAuthPage.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        Assert.assertTrue(formAuthPage.fleshIsD());
    }
    @AfterMethod
    public void deleteC() {
        driver.manage().deleteAllCookies();
    }
}
