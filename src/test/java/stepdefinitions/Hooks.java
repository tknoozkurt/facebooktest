package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {




    //@Before TestNg'deki @BeforeMethod gibi calisir.
    //Her scenario'dan once calisir TUM STEPDEFINITION,LARLA CALISIR
    @Before(order = 1) // global Hooks annotation
    public void setUp(){
        System.out.println("Hooks Class- Setup Method");
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("Hooks Class- tearDown Method");
        //screenshot
        final byte[]screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        if (scenario.isFailed()){

            scenario.embed(screenshot,"image/png");
        }


        // Driver.closeDriver();
    }
}