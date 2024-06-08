package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicAuthPage {
    WebDriver driver;
    String username;
    String password;
    String url;
    WebElement poruka;

    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUsername() {
        return "admin";
    }

    public String getPassword() {
        return "admin";
    }

    public String getUrl() {
        return "http://" + getUsername() + ":" + getPassword() + "@the-internet.herokuapp.com/basic_auth";
    }

    public WebElement getPoruka() {
        return driver.findElement(By.cssSelector("#content > div > p"));
    }

    //--------------------------------
    public void logIn(){
        driver.get(getUrl());
    }
}
