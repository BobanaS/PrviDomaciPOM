package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesPage {

    WebDriver driver;
    List<WebElement> checkBoxes;

    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCheckBoxes() {
        return driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));
    }

    //--------------------------------------------------------------------

    public void clickOnFirstCheckbox() {
        getCheckBoxes().get(0).click();
    }

    public void clickOnSecondCheckbox() {
        getCheckBoxes().get(1).click();
    }
}


