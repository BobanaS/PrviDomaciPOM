package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ABTestingPage {
    WebDriver driver;
    WebElement git;

    public ABTestingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getGit() {
        return driver.findElement(By.cssSelector("body > div:nth-child(2) > a > img"));
    }
    //-----------------------------------
    public boolean isDisplayed(){
       return getGit().isDisplayed();
    }
}
