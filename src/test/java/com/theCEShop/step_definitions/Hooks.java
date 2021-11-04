package com.theCEShop.step_definitions;

import com.theCEShop.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void tearDownScenario(Scenario scenario){

        //IF MY SCENARIO FAILS
        // TAKE A SCREENSHOT
        //scenario.isFailed() --> if scenario fails : returns true
        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
