import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSelenium {

    public static void main(String[] args) {

        // setup the firefox driver (Geckodriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser to a webpage
        driver.get("https://training-support.net");

        // Print the title of the page
        System.out.println("Title of the page is: " +driver.getTitle());


        driver.quit();
    }

}
