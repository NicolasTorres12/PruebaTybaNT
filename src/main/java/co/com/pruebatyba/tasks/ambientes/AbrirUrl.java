package co.com.pruebatyba.tasks.ambientes;

import co.com.pruebatyba.userinterfaces.ambientes.Url;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirUrl implements Task {
    Url url;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(url));
    }
    public static AbrirUrl abrirUrl(){
        return Tasks.instrumented(AbrirUrl.class);
    }
}
