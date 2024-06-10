package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddRemovePage {
    WebDriver driver;
    WebElement addButton;
    WebElement deleteButton;
    WebElement naslov;
    WebDriverWait wait;

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.cssSelector(".example button"));
    }

    public WebElement getDeleteButton() {
        return driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
    }

    public WebElement getNaslov() {
        return driver.findElement(By.cssSelector("#content > h3"));
    }

    //-----------------------------------------------
    public void clickOnAddButton() {
        getAddButton().click();
    }
    public void clickOnDeleteButton() {
        getDeleteButton().click();
    }
    public boolean displayDelete() {
        try {
            getDeleteButton();
            return getDeleteButton().isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public boolean addRemovewait() {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"elements\"]/button")));

    }
}
