package com.demowebshop.stepDefinitions;


import com.demowebshop.pages.DemoShopPage;
import com.demowebshop.utilities.BrowserUtils;
import com.demowebshop.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Demowebshop_StepDefs {

    DemoShopPage demoShopPage = new DemoShopPage();
    Faker faker = new Faker();

    @Given("Navigate to web page url")
    public void navigate_to_web_page_url() {
        Driver.get().get("https://demowebshop.tricentis.com/");
        BrowserUtils.waitFor(2);
    }

    @When("Click to register link")
    public void click_to_register_link() {
        demoShopPage.registerLinkBtn.click();
        BrowserUtils.waitFor(2);
    }

    @When("Enter to form user info")
    public void enter_to_form_user_info() {
        demoShopPage.genderCheckBtn.click();
        BrowserUtils.waitFor(1);
        demoShopPage.firstNameInbox.sendKeys(faker.name().firstName());
        BrowserUtils.waitFor(1);
        demoShopPage.lastNameInbox.sendKeys(faker.name().lastName());
        BrowserUtils.waitFor(1);
        demoShopPage.emailInbox.sendKeys(faker.internet().emailAddress());
        BrowserUtils.waitFor(1);
        demoShopPage.passwordInbox.sendKeys("123456");
        BrowserUtils.waitFor(1);
        demoShopPage.confirmPasswordInbox.sendKeys("123456");
        BrowserUtils.waitFor(1);
    }

    @When("Click to register button")
    public void click_to_register_button() {
        demoShopPage.registerBtn.click();
        BrowserUtils.waitFor(1);
    }

    @Then("Verify to text message {string}")
    public void verify_to_text_message(String registerCompleteMessage) {
        BrowserUtils.waitFor(1);
        Assert.assertEquals(registerCompleteMessage, demoShopPage.registerCompleteText.getText());
        BrowserUtils.waitFor(1);
    }

    @When("Click to continue button")
    public void click_to_continue_button() {
        BrowserUtils.waitFor(1);
        demoShopPage.continueBtn.click();
        BrowserUtils.waitFor(1);
    }

    @When("Enter the search box  {string}")
    public void enter_the_search_box(String product) {
        BrowserUtils.waitFor(1);
        demoShopPage.searchInbox.sendKeys(product);
        BrowserUtils.waitFor(1);
    }

    @When("Click to search box button")
    public void click_to_search_box_button() {
        demoShopPage.searchBoxBtn.click();
        BrowserUtils.waitFor(1);
    }

    @When("Add to cart product")
    public void add_to_cart_product() {
        BrowserUtils.waitFor(1);
        demoShopPage.addToCartBtn.click();
        BrowserUtils.waitFor(1);
    }

    @Then("Verify add to cart message {string}")
    public void verify_add_to_cart_message(String addProductMessage) {
        BrowserUtils.waitFor(1);
        Assert.assertEquals(addProductMessage, demoShopPage.addProductTextMessage.getText());
        BrowserUtils.waitFor(1);
    }

}
