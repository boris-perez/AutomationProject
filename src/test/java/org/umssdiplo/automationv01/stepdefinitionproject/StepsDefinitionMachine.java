package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Machine.Machine;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMachine {
    private Machine machine;


    @Given("^The user clicks to registration section$")
    public void goRegisterSection() {
        machine.registerMachine();
    }

    @And("^The user clicks to machine section$")
    public void goToMachineSection() throws Throwable {
        machine.machineSection();
    }

    @Given("^The user clicks delete a machine in list of machines$")
    public void deleteAMachine() throws Throwable{
        machine.deleteMachine();
    }

    @Given("^The user clicks edit option in list of machines$")
    public void editAMachine() {
        machine.editMachine();
    }

    @Given("^The user enter to home$")
    public void theUserEnterToHome() {
        machine = LoadPage.loginPage();
    }

    @Then("^The machine was registered$")
    public void theMachineWasRegistered() {

        String URL = CommonEvents.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:4200/machines/create" );
    }

    @Then("^The machine was edited$")
    public void theMachineWasEdited() {

        String URL = CommonEvents.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:4200/machines/update" );
    }

    @Then("^The machine was deleted$")
    public void theMachineWasDeleted() {
        String URL = CommonEvents.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:4200/machines/list" );
    }
}
