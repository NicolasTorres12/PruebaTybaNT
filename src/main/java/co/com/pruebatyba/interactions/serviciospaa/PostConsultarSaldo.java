package co.com.pruebatyba.interactions.serviciospaa;

import co.com.pruebatyba.utils.SeleniumFunctions;
import co.com.pruebatyba.utils.enums.RestServices;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostConsultarSaldo implements Interaction {

    SeleniumFunctions functions = new SeleniumFunctions();
    private final String body;

    public PostConsultarSaldo(String body) {
        this.body = body;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(RestServices.CONSULTAR_SALDO_PAA.toString())
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                        .auth().basic("201245","Andres")
                        .body(body)));
        functions.saveInScenario("saldo", SerenityRest.lastResponse().jsonPath().getString("saldo"));

    }

}
