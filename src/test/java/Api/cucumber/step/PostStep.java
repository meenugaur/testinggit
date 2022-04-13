package Api.cucumber.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostStep {
    @Given("user should be logged in and should be present at its own wall")
    public void userShouldBeLoggedInAndShouldBePresentAtItsOwnWall() {
        System.out.println("Hello");
    }

    @When("I type the massage in the text box")
    public void iTypeTheMassageInTheTextBox() {
        System.out.println("Hi");
    }

    @And("Click on post button")
    public void clickOnPostButton() {
        System.out.println("Hello World");
    }

    @Then("the massage should get posted")
    public void theMassageShouldGetPosted() {
        System.out.println("Hi World");
    }
}


