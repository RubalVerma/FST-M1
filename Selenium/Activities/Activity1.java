import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String args[])
    {
        // setup the firefox driver (Geckodriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser to a webpage
        driver.get("https://v1.training-support.net");

        driver.findElement(By.id("about-link")).click();

        System.out.println("Title of the Page is :" +driver.getTitle());

        driver.close();


    }
}
