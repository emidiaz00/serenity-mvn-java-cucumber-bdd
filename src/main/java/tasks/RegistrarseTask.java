package tasks;

import models.RegistrarsePage;
import navegacion.NavigateTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrarseTask implements Task {

    private String email;

    public RegistrarseTask(String email) {
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(
                        NavigateTo.theHomePage(),
                        Enter.theValue(email).into(RegistrarsePage.input_email)
                );
    }
}
