package co.com.pruebatyba.tasks.autenticacion;
import co.com.pruebatyba.interactions.esperas.EsperarElemento;
import co.com.pruebatyba.models.autenticacion.Autenticacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.pruebatyba.userinterfaces.autenticacion.AutenticacionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task{

    Autenticacion autenticacion;

    public IniciarSesion(Autenticacion autenticacion){
        this.autenticacion = autenticacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                EsperarElemento.esClickable(TXT_NOMBRE_USUARIO),
                Enter.theValue(autenticacion.getUsuario()).into(TXT_NOMBRE_USUARIO),
                EsperarElemento.esClickable((TXT_PASSWORD)),
                Enter.theValue(autenticacion.getPassword()).into(TXT_PASSWORD),
                EsperarElemento.esClickable(BTN_INICIAR_SESION),
                Click.on(BTN_INICIAR_SESION)
        );
    }
  public static IniciarSesion iniciarSesion(Autenticacion autenticacion){
        return instrumented(IniciarSesion.class, autenticacion);
  }

}
