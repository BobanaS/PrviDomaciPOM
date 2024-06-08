package Tests;

import Base.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest {
    @BeforeTest
    public void pageSetUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void LogIn(){
        homePage.clickOnLinkText("Basic Auth");
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/basic_auth");
        basicAuthPage.logIn();
        Assert.assertEquals(basicAuthPage.getPoruka().getText(), "Congratulations! You must have the proper credentials.");
        Assert.assertEquals(driver.getCurrentUrl(),"https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
