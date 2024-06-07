package co.com.screenplay.project.stepdefinition.hook;

import co.com.screenplay.project.hook.OpenWeb;
import co.com.screenplay.project.utils.Time;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.*;

import static co.com.screenplay.project.utils.Constants.TIME;
import static co.com.screenplay.project.utils.Constants.TITLE;
import static co.com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("{string} ingresa a la pagina web")
    public void elUsuarioIngresaALaPaginaWeb(String actor) {
      OnStage.theActorCalled(actor).attemptsTo(OpenWeb.browserURL());
        waiting(TIME);
        //theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheWebPage.title().Matchers.containsString(TITLE)));
    }
}
