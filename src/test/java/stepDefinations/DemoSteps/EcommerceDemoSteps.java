package stepDefinations.DemoSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EcommerceDemoSteps {

    @Before

    public  void beforeScenario(){

        System.out.println("--------------Start Scenario-------------");
    }

    @After

    public  void afterScenario(){

        System.out.println("----------END Scenario-----------");
    }


    @Given("user opens the E-commerce website")
    public void userOpensTheECommerceWebsite() {

        System.out.println("opened E-commerce website");
    }

    @And("user enters username and password")
    public void userEntersUsernameAndPassword() {

        System.out.println("enters credentials");
    }

    @And("Submit login button")
    public void submitLoginButton() {

        System.out.println("Click on submit ");
    }

    @Then("Login successfully")
    public void loginSuccessfully() {

        System.out.println("LOGIN Success");

    }


    @When("user searches for an item")
    public void userSearchesForAnItem() {
        System.out.println("Search for product");
    }

    @When("user found the item")
    public void userFoundTheItem() {
        System.out.println("when found the product");
    }

    @Then("Then click on it")
    public void thenClickOnIt() {
        System.out.println("user will click on selected product");
    }

    @And("ADD to cart")
    public void addToCart() {
        System.out.println("user adds found product to cart");
    }

    @When("user selects a product")
    public void userSelectsAProduct() {
        System.out.println("Select product");

    }

    @And("click on payment Tab")
    public void clickOnPaymentTab() {
        System.out.println(" Go to payment tab");
    }

    @Then("Payment options should display")
    public void paymentOptionsShouldDisplay() {
        System.out.println("All payment options will display");
    }

    @And("confirm the payment")
    public void confirmThePayment() {
        System.out.println("payment is done");
    }

    @Then("Order Placed")
    public void orderPlaced() {
        System.out.println("Order is placed Successfully");
    }
}
