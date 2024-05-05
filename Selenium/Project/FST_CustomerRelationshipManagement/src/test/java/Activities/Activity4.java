package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity4 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://alchemy.hguy.co/crm");
    }


    @Test(dataProvider = "loginCreds")
    public void loginTest(String username, String password)
    {


        try {
            WebElement user = driver.findElement(By.id("user_name"));
            WebElement pwd = driver.findElement(By.id("username_password"));

            user.clear();
            pwd.clear();

            user.sendKeys(username);
            pwd.sendKeys(password);

            driver.findElement(By.id("bigbutton")).click();

            WebElement suiteDashboard = driver.findElement(By.id("tab0"));
            boolean suite = suiteDashboard.isDisplayed();
            String suiteText = suiteDashboard.getText();

           wait.until(ExpectedConditions.visibilityOf(suiteDashboard));

            if (suite == true) {
                System.out.println("Login successful, Suite Dashboard displayed having text:"+suiteText);
            } else {
                System.out.println("Login not successful");
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }




    }

    @DataProvider(name="loginCreds")
    public Object[][] credentials()
    {

        Object[][] obj ={
                {"admin","pa$$w0rd"},
                {"admin1","password"}
        };
        return obj;
    }


    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
