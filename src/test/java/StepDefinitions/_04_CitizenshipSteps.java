package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenshipSteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Navigate to CitizendShip page")
    public void navigateToCitizendShipPage()
    {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.paremeters);
        ln.clickFunction(ln.citizenShip);
    }

    @When("User a CitizendShip name {string} short name is {string}")
    public void userACitizendShipNameShortNameIs(String name, String shortName)
    {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortName,shortName);
        dc.clickFunction(dc.saveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed()
    {
        dc.verifyContainsTextFunction(dc.alreadyExists,"already");
    }

    @When("User delete the {string}")
    public void userDeleteThe(String searchText) {
        dc.deleteItem(searchText);
    }
}
