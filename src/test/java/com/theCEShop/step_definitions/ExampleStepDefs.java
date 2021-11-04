package com.theCEShop.step_definitions;

import com.theCEShop.pages.CorporatePage;
import com.theCEShop.utilities.BrowserUtils;
import com.theCEShop.utilities.Driver;
import io.cucumber.java.en.*;

public class ExampleStepDefs extends CorporatePage {
    CorporatePage cp = new CorporatePage();
    BrowserUtils bu = new BrowserUtils();
    @Given("the user navigates to the corporate page")
    public void the_user_navigates_to_the_corporate_page() {
        cp.navigateTo(CORPORATE_PAGE_URL);
    }
    @When("the user clicks on logic button")
    public void the_user_clicks_on_logic_button() {
        cp.clickByElement(topLogin);
    }
    @Then("the user should see the correct title")
    public void the_user_should_see_the_correct_title() throws Exception {
        BrowserUtils.assertTitle("Log In | The CE Shop",15);
    }
}
