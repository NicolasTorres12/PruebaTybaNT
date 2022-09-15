package co.com.pruebatyba.tasks.procesoRegistroCompra;

import co.com.pruebatyba.interactions.esperas.EsperarElemento;
import co.com.pruebatyba.models.procesoRegistroCompra.ProcesoRegistroCompraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.commons.lang3.RandomStringUtils;

import static co.com.pruebatyba.userinterfaces.procesoRegistroCompra.ProcesoRegistroCompra.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroTask implements Task {

    ProcesoRegistroCompraModel procesoRegistroCompraModel;

    public RegistroTask(ProcesoRegistroCompraModel procesoRegistroCompraModel){
        this.procesoRegistroCompraModel = procesoRegistroCompraModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(



                Click.on(BTN_MENU_USUARIO),
                Click.on(BTN_CREAR_CUENTA),
                EsperarElemento.esClickable((TXT_USERNAME)),
                Enter.theValue(RandomStringUtils.randomAlphanumeric(6)).into(TXT_USERNAME),
                EsperarElemento.esClickable((TXT_EMAIL)),
                Enter.theValue(procesoRegistroCompraModel.getEmail()).into(TXT_EMAIL),
                EsperarElemento.esClickable((TXT_PASSWORD)),
                Enter.theValue(procesoRegistroCompraModel.getPassword()).into(TXT_PASSWORD),
                EsperarElemento.esClickable((TXT_CONFIRM_PASSWORD)),
                Enter.theValue(procesoRegistroCompraModel.getConfirmPassword()).into(TXT_CONFIRM_PASSWORD),
                EsperarElemento.esClickable((TXT_FIRST_NAME)),
                Enter.theValue(procesoRegistroCompraModel.getFristName()).into(TXT_FIRST_NAME),
                EsperarElemento.esClickable((TXT_LAST_NAME)),
                Enter.theValue(procesoRegistroCompraModel.getFristName()).into(TXT_LAST_NAME),
                EsperarElemento.esClickable((TXT_PHONE_NUMBER)),
                Enter.theValue(procesoRegistroCompraModel.getFristName()).into(TXT_PHONE_NUMBER),
                Enter.theValue(procesoRegistroCompraModel.getCity()).into(TXT_CITY),
                EsperarElemento.esClickable((TXT_CITY)),
                Enter.theValue(procesoRegistroCompraModel.getAddress()).into(TXT_ADDRESS),
                EsperarElemento.esClickable((TXT_ADDRESS)),
                Enter.theValue(procesoRegistroCompraModel.getState()).into(TXT_STATE),
                EsperarElemento.esClickable((TXT_STATE)),
                Enter.theValue(procesoRegistroCompraModel.getPostalCode()).into(TXT_POSTAL_CODE),
                EsperarElemento.esClickable((TXT_POSTAL_CODE)),
                EsperarElemento.esClickable(BTN_AGREE),
                Click.on(BTN_AGREE),
                EsperarElemento.esClickable(BTN_REGISTER),
                Click.on(BTN_REGISTER)




        );
    }
     public static RegistroTask procesoRegistroCompra(ProcesoRegistroCompraModel procesoRegistroCompraModel){
        return instrumented(RegistroTask.class, procesoRegistroCompraModel);
     }
}

//}
