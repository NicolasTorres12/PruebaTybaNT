package co.com.pruebatyba.interactions;

import co.com.pruebatyba.interactions.serviciospaa.PostConsultarSaldo;
import net.serenitybdd.screenplay.Tasks;

public class ConsumirServiciosPAA {

    public static PostConsultarSaldo PostConsultarSaldo(String body) {
        return Tasks.instrumented(PostConsultarSaldo.class, body);
    }

}
