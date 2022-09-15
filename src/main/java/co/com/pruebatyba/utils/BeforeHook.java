package co.com.pruebatyba.utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BeforeHook {

    /********** Log Attribute **********/
    private static final Logger LOGGER = LoggerFactory.getLogger(BeforeHook.class);

    @Before
    public void initScenario(Scenario scenario) {

        LOGGER.info("************************************************************************************************");
        LOGGER.info("[ Start stage ] --> " + scenario.getName());
        LOGGER.info("************************************************************************************************");
    }

    public static void prepareStage(String urlBase) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Nicolas").whoCan(CallAnApi.at(urlBase));
    }

    @After
    public void endScenario(Scenario scenario) {
        LOGGER.info("************************************************************************************************");
        LOGGER.info("[ End of stage ] --> " + scenario.getName());
       // UtilLogger.escribirLoggerEstandar(
        //        "[ End of stage ] -->"+scenario.getName(),
         //       ConstantesLogger.LOGGER_INFO,
         //       "endScenrario",
         //       this.getClass());

         LOGGER.info("************************************************************************************************");
    }

}
