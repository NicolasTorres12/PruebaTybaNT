package co.com.pruebatyba.tasks.procesoRegistroCompra;

import co.com.pruebatyba.models.procesoRegistroCompra.ProcesoRegistroCompraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.pruebatyba.userinterfaces.procesoRegistroCompra.ProcesoRegistroCompra.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarCarroTask implements Task {

    ProcesoRegistroCompraModel procesoRegistroCompraModel;

    public AgregarCarroTask(ProcesoRegistroCompraModel procesoRegistroCompraModel){
        this.procesoRegistroCompraModel = procesoRegistroCompraModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(


                Click.on(BTN_POPULAR_ITEMS),
                Click.on(BTN_VIEW_DETAILS_01),
                Click.on(BTN_COLOR_01),
                Click.on(BTN_QUANTITY),
                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_HOME),
                Click.on(BTN_POPULAR_ITEMS),
                Click.on(BTN_VIEW_DETAILS_02),
                Click.on(BTN_QUANTITY),
                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_MENU_CART),
                Click.on(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT_NEXT),
                Click.on(BTN_MASTER_CREDIT),
                Click.on(BTN_PAY_NOW)


        );
    }
    public static AgregarCarroTask agregarCarroTask(ProcesoRegistroCompraModel procesoRegistroCompraModel){
        return instrumented(AgregarCarroTask.class, procesoRegistroCompraModel);
    }
}