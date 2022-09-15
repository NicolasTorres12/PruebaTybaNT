package co.com.pruebatyba.userinterfaces.autenticacion;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class AutenticacionPage extends PageObject {

    public static final Target TXT_NOMBRE_USUARIO = Target.the("Texto nombre de usuario").located(By.id("username"));
    public static final Target TXT_PASSWORD = Target.the("Texto nombre de usuario").located(By.id("password"));
    public static final Target BTN_INICIAR_SESION = Target.the("Texto nombre de usuario").located(By.id("sId"));
}
