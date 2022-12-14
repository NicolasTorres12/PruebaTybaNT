package co.com.pruebatyba.interactions.esperas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class Presente implements Interaction {
    Target elemento;

    public Presente(Target elemento){
        this.elemento = elemento;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(elemento, isPresent()).forNoMoreThan(20).seconds());

    }
}

