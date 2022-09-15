package co.com.pruebatyba.interactions.esperas;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperaUnTiempo implements Interaction {

    private final int tiempo;

    protected EsperaUnTiempo(int tiempo){
        this.tiempo = tiempo;
    }

    public static EsperaUnTiempo unTiempo(int tiempo){
        return instrumented(EsperaUnTiempo.class, tiempo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(tiempo);
    }
}
