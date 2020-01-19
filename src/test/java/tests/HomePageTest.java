package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Account;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {

    HomePage homePage;
    Account account;

    @BeforeMethod (alwaysRun = true)
    public void SetUp(){
        initializer();
        homePage= new HomePage();
        account=new Account();
    }

    @AfterMethod (alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }




}
