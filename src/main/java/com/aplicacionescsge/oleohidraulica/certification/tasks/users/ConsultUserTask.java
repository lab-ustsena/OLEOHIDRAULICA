package com.aplicacionescsge.oleohidraulica.certification.tasks.users;

import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultUserTask implements Task {

    String Search;

    public ConsultUserTask(String search) {

        Search = search;
    }

    @Step("{0} Logout site")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOption.OPTION_USER));
        actor.attemptsTo(
                Enter.theValue(Search).into(UserPage.SEARCH_USER)
        );
    }

    public static ConsultUserTask fillFields(String search) {
        return instrumented(ConsultUserTask.class, search);
    }
}
