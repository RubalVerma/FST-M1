package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity9 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
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

            // driver.findElement(By.id("toolbar"));
            WebElement element = driver.findElement(By.id("grouptab_0"));
            String text = element.getText();
            System.out.println(text);

            element.click();

            WebElement leads = driver.findElement(By.linkText("Leads"));
            leads.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr")));

            List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr"));

            System.out.println(rows.size());

            int count = 0;
            for(int i=0; i< rows.size(); i++)
            {
                    // Rows are 0-based, so odd rows have even indices
                    WebElement row = rows.get(i);
                    WebElement cellName = row.findElement(By.xpath(".//td[3]"));
                    String name = cellName.getText();
                    System.out.println("Name : "+name);

                WebElement cellUser = row.findElement(By.xpath(".//td[8]"));
                String cellUserName = cellUser.getText();
                System.out.println("User Type : "+cellUserName);
                    count++;

                    if(count == 10)
                    {
                        break;
                    }


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
                {"admin","pa$$w0rd"}
        };
        return obj;
    }


    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
