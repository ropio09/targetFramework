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

    @Test
    public void verifyHomeTitle(){
        SeleniumUtils.waitForVisibilityOfElement(homePage.home_Btn);
        Assert.assertEquals(driver.getTitle(),"Target : Expect More. Pay Less.");
    }

    @Test
    public void testAcctName(){
        SeleniumUtils.click(account.acctName);
        String expectedTitle="Hello, Rocio";
        Assert.assertEquals(SeleniumUtils.getText(account.acctName),expectedTitle);
    }

    @Test(groups= {"smoke"})
    public void testargetBtn(){
        SeleniumUtils.click(homePage.home_Btn);
        String expectedTitle= "Target : Expect More. Pay Less.";
        Assert.assertEquals(SeleniumUtils.getText(homePage.home_Btn),expectedTitle);
    }



}
