package tests;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Account;
import pages.HomePage;
import utils.ConfigReader;
import utils.SeleniumUtils;

public class AccountTest extends TestBase {
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


    @Test(groups = {"smoke"})
    public void verifyAcctName(){
        homePage.navigateToHomePage();
        account.navigateToAcctLogin();
        account.enterInfoLogin();
        account.goIntoAcct();
        SeleniumUtils.waitForVisibilityOfElement(account.acctName);
        Assert.assertEquals(account.acctName.getText(), "Hello, Rocio");
        account.signOut();
    }


}
