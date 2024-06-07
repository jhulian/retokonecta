package co.com.screenplay.project.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.HomeUI.*;
import static co.com.screenplay.project.utils.Constants.TIME;
import static co.com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class RemoveElementsTask implements Task{

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(WaitUntil.the(MENU_CART, isEnabled()).forNoMoreThan(5).seconds(),Click.on(MENU_CART));
        waiting(TIME);
        actor.attemptsTo(WaitUntil.the(REMOVE_1, isEnabled()).forNoMoreThan(5).seconds(),Click.on(REMOVE_1));
        waiting(TIME);
        actor.attemptsTo(WaitUntil.the(CHECKOUT, isEnabled()).forNoMoreThan(5).seconds(),Click.on(CHECKOUT));
        waiting(TIME);
    }

    public static RemoveElementsTask choose(){
        return Tasks.instrumented(RemoveElementsTask.class);
    }
}
