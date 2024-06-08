package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthPage {
    WebDriver driver;
    WebElement usernameField;
    WebElement passwordField;
    WebElement logInButton;
    WebElement flesh;
    public FormAuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLogInButton() {
        return driver.findElement(By.cssSelector("#login > button > i"));
    }

    public WebElement getFlesh() {
        return driver.findElement(By.id("flash"));
    }

    //------------------------------------------------------

    public void inputUsername(String username){
        getUsernameField().clear();
        getUsernameField().sendKeys(username);
    }
    public void inputPassword(String password){
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
    }
    public void clickOnLogInButton(){
        getLogInButton().click();
    }
    public boolean fleshIsD(){
        return getFlesh().isDisplayed();
    }
}
