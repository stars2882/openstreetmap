package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static manager.PageFactoryManager.HOME_PAGE;

public class SetRouteAndCheckDistanceSteps {

    @Given("User opens home page")
    public void userOpensHomePage() {
        HOME_PAGE.openHomePage();
    }

    @And("User click button find a route between two points")
    public void userClickButtonFindARouteBetweenTwoPoints() {
        HOME_PAGE.clickButtonRote();
    }

    @And("Enter the starting point in the field {string}")
    public void enterTheStartingPoint(final String keyword) {
        HOME_PAGE.enterFirstPoint(keyword);
    }

    @And("Enter the finishing point in the field {string}")
    public void enterTheFinishingPoint(final String keyword) {
        HOME_PAGE.enterSecondPoint(keyword);
    }

    @And("In the drop-down list of transport options, select {string}")
    public void inTheDropDownListOfTransportOptionsSelectKindOfTransport(final String keyword) {
        HOME_PAGE.selectTransport(keyword);
    }

    @And("Click button Go")
    public void clickButtonGo() {
        HOME_PAGE.clickBtnGo();
    }

    @Then("We check that the distance is {string} km.")
    public void weCheckThatTheDistanceIsDistanceKm(final String keyword) {
        Assert.assertTrue(HOME_PAGE.checkDistance(keyword));
    }
}
