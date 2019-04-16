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


    @Given("^click on 'Register new machine' from lateral menu in 'Machine' page$")
    public void goRegisterSection() {
        machine.registerMachine();
    }

    @And("^click on 'Machine' option from the 'Top Menu' of the main page$")
    public void goToMachineSection() throws Throwable {
        machine.machineSection();
    }

    @Given("^click on 'delete' option from 'list of machine' in the 'Machine' page$")
    public void deleteAMachine() throws Throwable{
        machine.deleteMachine();
    }

    @Given("^click on 'edit' option from 'list of machine' in the 'Machine' page$")
    public void editAMachine() {
        machine.editMachine();
    }

    @Given("^'Care4You' page is loaded$")
    public void theUserEnterToHome() {
        machine = LoadPage.loginPage();
    }


    @Then("^verify that the 'Machine' was registered$")
    public void theMachineWasRegistered() {

        String URL = CommonEvents.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:4200/machines/create" );
    }

    @Then("^verify that the 'Machine' was edited$")
    public void theMachineWasEdited() {

        String URL = CommonEvents.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:4200/machines/update" );
    }

    @Then("^verify that the 'Machine' was deleted$")
    public void theMachineWasDeleted() {
        String URL = CommonEvents.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:4200/machines/list" );
    }
}
