package co.com.pruebatyba.stepdefinitions.procesoReigstroCompra;

import co.com.pruebatyba.models.procesoRegistroCompra.ProcesoRegistroCompraModel;
import co.com.pruebatyba.tasks.ambientes.AbrirUrl;
import co.com.pruebatyba.tasks.procesoRegistroCompra.AgregarCarroTask;
import co.com.pruebatyba.tasks.procesoRegistroCompra.RegistroTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class ProcesoReigstroCompraStepDefinition {

    @Managed(driver = "chrome")
    WebDriver driver;


    @Before
    public void prepareStage(){

        setTheStage(new OnlineCast());
        theActorCalled("usuario");
    }

    @Given("^el usuario (.*) ingresa a la pagina advantageonlineshopping$")
    public void elusuarioNicolasingresalapaginaadvantageonlineshopping(String user){
        theActorInTheSpotlight().wasAbleTo(AbrirUrl.abrirUrl());

    }

    @When("^Se dirige al apartado de perfil para registrarse, una vez en la pagina de registro ingresa los datos solicitados$")
    public void seDirigeAlApartadoDePerfilParaRegistrarseUnaVezEnLaPaginaDeRegistroIngresaLosDatosSolicitados(List<ProcesoRegistroCompraModel> procesoRegistroCompraModel) {
        theActorInTheSpotlight().attemptsTo(RegistroTask.procesoRegistroCompra(procesoRegistroCompraModel.get(0)));

    }

    @And("^Selecciona el apartado de popular items, selecciona los productos que desea comprar y los agrega al carrito, una vez agregados al carrito se realiza el proceso de compra$")
    public void seleccionaElApartadoDePopularItemsSeleccionaLosProductosQueDeseaComprarYLosAgregaAlCarritoUnaVezAgregadosAlCarritoSeRealizaElProcesoDeCompra(List<ProcesoRegistroCompraModel> procesoRegistroCompraModel) {
        theActorInTheSpotlight().attemptsTo(AgregarCarroTask.agregarCarroTask(procesoRegistroCompraModel.get(0)));
    }

}
