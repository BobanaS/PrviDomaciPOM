package Tests;

import Base.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBoxesTest extends BaseTest {

    @BeforeTest
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

    }

    @Test
    public void userIsOnABTestPage() {
        homePage.clickOnLinkText("Checkboxes");
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/checkboxes");
        checkBoxesPage.clickOnFirstCheckbox();
        checkBoxesPage.clickOnSecondCheckbox();
        Assert.assertTrue(checkBoxesPage.getCheckBoxes().get(0).isSelected());
        Assert.assertFalse(checkBoxesPage.getCheckBoxes().get(1).isSelected());
    }

}