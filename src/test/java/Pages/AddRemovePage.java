package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemovePage {
WebDriver driver;
WebElement addButton;
WebElement deleteButton;
WebElement naslov;

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.cssSelector(".example button"));
    }

    public WebElement getDeleteButton() {
        return  driver.findElement(By.cssSelector("#elements > button"));
    }

    public WebElement getNaslov() {
        return driver.findElement(By.cssSelector("#content > h3"));
    }

    //-----------------------------------------------
    public void clickOnAddButton(){
        getAddButton().click();
    }

    public void displayNaslov(){
        getNaslov().isDisplayed();
    }
}
