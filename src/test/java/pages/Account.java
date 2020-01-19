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
    public Account(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[@id='account']")
    public WebElement signinMain_btn;

    @FindBy(id ="accountNav-signIn")
    public WebElement signIn_Btn;

    @FindBy(id="username")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement passWord;

    @FindBy(id= "login")
    public WebElement loginBtn;

    @FindBy(id="accountNav-account")
    public WebElement acct;


    @FindBy(xpath = "//div[@class='managerStyles__MenuTitle-q3xm96-5 bJqDwb h-text-center']//h1")
    public WebElement acctName;

    @FindBy(id="accountNav-guestSignOut")
    public WebElement signOut;


    public void navigateToAcctLogin() {
        SeleniumUtils.click(signinMain_btn);
        SeleniumUtils.click(signIn_Btn);
    }
    public void enterInfoLogin(){
        SeleniumUtils.sendKeys(userName, ConfigReader.readProperty(propertyPath,"email"));
        SeleniumUtils.sendKeys(passWord, ConfigReader.readProperty(propertyPath,"password"));
        SeleniumUtils.click(loginBtn);
    }

    public void goIntoAcct(){
        SeleniumUtils.click(signIn_Btn);
        SeleniumUtils.click(acct);
    }

    public void signOut(){
        SeleniumUtils.click(signinMain_btn);
        SeleniumUtils.click(signOut);
    }






}
