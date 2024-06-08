package Base;

import Pages.ABTestingPage;
import Pages.AddRemovePage;
import Pages.CheckBoxesPage;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public HomePage homePage;
    public ABTestingPage abTestingPage;
    public CheckBoxesPage checkBoxesPage;
    public AddRemovePage addRemovePage;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.homePage=new HomePage(driver);
        this.abTestingPage=new ABTestingPage(driver);
        this.checkBoxesPage=new CheckBoxesPage(driver);
        this.addRemovePage=new AddRemovePage(driver);
    }

  /*  @AfterClass
    public void closeUP(){
        driver.quit();
    }
*/
}