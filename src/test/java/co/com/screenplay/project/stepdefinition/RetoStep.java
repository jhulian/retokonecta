package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.task.AddElementsTask;
import co.com.screenplay.project.task.RemoveElementsTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.project.utils.Constants.ACTOR;

public class RetoStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("el usuario añade productos al carrito de compras")
    public void elUsuarioAñadeProductosAlCarritoDeCompras() {
        OnStage.theActorCalled(ACTOR).attemptsTo(AddElementsTask.choose());


    }

    @When("el usuario remueve productos del carrito de compras")
    public void elUsuarioRemueveProductosDelCarritoDeCompras() {
        OnStage.theActorCalled(ACTOR).attemptsTo(RemoveElementsTask.choose());
    }

    @Then("el usuario finaliza la compra de los productos con el precio correcto")
    public void elUsuarioFinalizaLaCompraDeLosProductosConElPrecioCorrecto() {
    }


}
