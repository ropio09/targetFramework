package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class HomePage extends TestBase {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@id='home']")
    public WebElement home_Btn;


    public void navigateToHomePage(){
        SeleniumUtils.click(home_Btn);
    }



}
