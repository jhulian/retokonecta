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

public class AddElementsTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(SPEAKERS, isEnabled()).forNoMoreThan(5).seconds(),Click.on(SPEAKERS));
        waiting(TIME);
        //actor.attemptsTo(Scroll.to(ROAR_MINI_WIRELESS));
        actor.attemptsTo(WaitUntil.the(ROAR_MINI_WIRELESS, isEnabled()).forNoMoreThan(5).seconds(),Click.on(ROAR_MINI_WIRELESS));
        waiting(TIME);
        actor.attemptsTo(WaitUntil.the(ADD_TO_CART, isEnabled()).forNoMoreThan(5).seconds(),Click.on(ADD_TO_CART));
        waiting(TIME);
        actor.attemptsTo(WaitUntil.the(HOME, isEnabled()).forNoMoreThan(5).seconds(),Click.on(HOME));
        actor.attemptsTo(WaitUntil.the(MICE, isEnabled()).forNoMoreThan(5).seconds(),Click.on(MICE));
        waiting(TIME);
        //actor.attemptsTo(Scroll.to(SCULPT_TOUCH_MOUSE));
        actor.attemptsTo(WaitUntil.the(SCULPT_TOUCH_MOUSE, isEnabled()).forNoMoreThan(5).seconds(),Click.on(SCULPT_TOUCH_MOUSE));
        waiting(TIME);
        actor.attemptsTo(WaitUntil.the(ADD_TO_CART, isEnabled()).forNoMoreThan(5).seconds(),Click.on(ADD_TO_CART));
        waiting(TIME);

    }

    public static AddElementsTask choose(){
        return Tasks.instrumented(AddElementsTask.class);
    }
}
