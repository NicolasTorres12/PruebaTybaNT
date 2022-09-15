package co.com.pruebatyba.runners;

import co.com.pruebatyba.utils.BeforeSuite;
import co.com.pruebatyba.utils.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.IOException;


@CucumberOptions(
        features = "src/test/resources/features/procesoReigstroCompra/ProcesoReigstroCompra.feature",
        glue = {"co.com.pruebatyba/stepdefinitions"},
        snippets = SnippetType.CAMELCASE)
@RunWith(CustomRunner.class)

public class ProcesoReigstroCompraRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/procesoReigstroCompra/ProcesoReigstroCompra.feature");
    }

}