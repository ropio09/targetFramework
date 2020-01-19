package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.SeleniumUtils;

public class Account extends TestBase {
    Account account;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initializer();
        homePage = new HomePage();
        account = new Account();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }





}
