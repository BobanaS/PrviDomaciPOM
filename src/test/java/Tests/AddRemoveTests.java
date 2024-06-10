package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddRemoveTests extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.get("https://the-internet.herokuapp.com/");

    }

    @Test(priority = 10)
    public void checkIfYouAreOnAddRemove() {
        homePage.clickOnLinkText("Add/Remove Elements");
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/add_remove_elements/");
        Assert.assertEquals(addRemovePage.getNaslov().getText(), "Add/Remove Elements");
        Assert.assertTrue(addRemovePage.getAddButton().isDisplayed());
    }

    @Test(priority = 20)
    public void isDeleteButtonDisplayed() {
        checkIfYouAreOnAddRemove();
        addRemovePage.clickOnAddButton();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        Assert.assertTrue(addRemovePage.getDeleteButton().isDisplayed());
    }

    @Test(priority = 30)
    public void isDeleteButtonWorking() {
        homePage.clickOnLinkText("Add/Remove Elements");
        addRemovePage.clickOnAddButton();
        addRemovePage.clickOnDeleteButton();
        addRemovePage.addRemovewait();
        Assert.assertFalse(addRemovePage.displayDelete());
    }
}