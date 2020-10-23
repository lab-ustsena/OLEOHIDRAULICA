package com.aplicacionescsge.oleohidraulica.certification.tasks.users;

import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnableUser implements Task {


    String Search;
    public EnableUser(String search) {
        Search = search;
    }

    @Step("{0} Enable user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(UserPage.BTN_SORTING.of(Search)),
                Click.on(UserPage.BTN_STATE_DISABLE.of(Search)
                ));
    }

    //public static ConsultDetailsUser selectItem(String search) {
    //       return instrumented(ConsultDetailsUser.class, search);
    //  }

    public static EnableUser fillFields(String search) {
        return instrumented(EnableUser.class, search);
    }

}
