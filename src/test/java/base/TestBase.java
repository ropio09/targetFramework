package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static final String propertyPath= "src/main/resources/configurations/configurations.properties";
    private static long implicitWait= Long.parseLong(ConfigReader.readProperty(propertyPath, "implicitWait"));
    public static String url= ConfigReader.readProperty(propertyPath,"url");
    public static String browser= ConfigReader.readProperty(propertyPath,"browser");

}
