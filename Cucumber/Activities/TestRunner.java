//activity6
package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/Features",
        glue = {"StepDefinitions"},
        tags = "@SimpleAlert",
        publish = true,
        plugin = {"pretty"},
        monochrome = true
        /*
        plugin = {
                "html:src/Reports/HTML_Report.html",
                "json:src/Reports/JSON_Report.json",
                "junit:src/Reports/XML_Report.xml"
        }*/
        )


public class TestRunner {
}
