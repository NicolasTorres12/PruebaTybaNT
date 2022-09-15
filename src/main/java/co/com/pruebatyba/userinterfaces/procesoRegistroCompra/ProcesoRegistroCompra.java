package co.com.pruebatyba.userinterfaces.procesoRegistroCompra;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProcesoRegistroCompra extends PageObject  {


    public static final Target BTN_MENU_USUARIO = Target.the("Menu usuario").located(By.id("menuUser"));
    public static final Target BTN_CREAR_CUENTA = Target.the("Crear Cuenta").located(By.cssSelector(".create-new-account"));
    public static final Target TXT_USERNAME = Target.the("Campo Username").located(By.xpath("//*[@name='usernameRegisterPage']"));
    public static final Target TXT_EMAIL = Target.the("Campo Email").located(By.xpath("//*[@name='emailRegisterPage']"));
    public static final Target TXT_PASSWORD = Target.the("Campo password").located(By.xpath("//input[@name='passwordRegisterPage']"));
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Campo Confirmar Password").located(By.xpath("//input[@name='confirm_passwordRegisterPage']"));
    public static final Target TXT_FIRST_NAME = Target.the("Campo Primer Nombre").located(By.xpath("//input[@name='first_nameRegisterPage']"));
    public static final Target TXT_LAST_NAME = Target.the("Campo Ultimo Nombre").located(By.xpath("//input[@name='last_nameRegisterPage']"));
    public static final Target TXT_PHONE_NUMBER = Target.the("Campo Numero Celular").located(By.xpath("//input[@name='phone_numberRegisterPage']"));
    public static final Target SEL_COUNTRY = Target.the("Campo country").located(By.xpath("//*[@name='countryListboxRegisterPage']"));
    public static final Target TXT_CITY = Target.the("Campo city").located(By.xpath("//input[@name='cityRegisterPage']"));
    public static final Target TXT_ADDRESS = Target.the("Campo direccion").located(By.xpath("//input[@name='addressRegisterPage']"));
    public static final Target TXT_STATE = Target.the("Campo estado").located(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']"));
    public static final Target TXT_POSTAL_CODE = Target.the("Campo codigo postal").located(By.xpath("//input[@name='postal_codeRegisterPage']"));
    public static final Target BTN_AGREE = Target.the("boton aceptar terminos").located(By.xpath("//input[@name='i_agree']"));
    public static final Target BTN_REGISTER= Target.the("boton registrar").located(By.id("register_btnundefined"));

    public static final Target BTN_POPULAR_ITEMS = Target.the("boton popular items").located(By.xpath("//a[normalize-space()='POPULAR ITEMS']"));



    public static final Target BTN_VIEW_DETAILS_01= Target.the("boton ver detalles").located(By.id("details_16"));
    public static final Target BTN_COLOR_01= Target.the("Color Gris").located(By.id("rabbit"));
    public static final Target BTN_QUANTITY = Target.the("BOTON CANTIDAD").located(By.xpath("//div[@class='plus']"));
    public static final Target BTN_ADD_TO_CART = Target.the("boton añadir carro").located(By.xpath("//button[normalize-space()='ADD TO CART']"));
    public static final Target BTN_HOME = Target.the("boton casa").located(By.xpath("//a[normalize-space()='HOME']"));
    //public static final Target BTN_POPULAR_ITEMS = Target.the("Campo Email").located(By.xpath("//a[normalize-space()='POPULAR ITEMS']"));



    public static final Target BTN_VIEW_DETAILS_02= Target.the("boton ver detalle").located(By.id("details_10"));
    //public static final Target BTN_QUANTITY = Target.the("BOTON CANTIDAD").located(By.xpath("//div[@class='plus']"));
    //public static final Target BTN_ADD_TO_CART = Target.the(" ").located(By.xpath("//button[normalize-space()='ADD TO CART']"));



    public static final Target BTN_MENU_CART= Target.the("boton menu carrito").located(By.id("menuCart"));
    public static final Target BTN_CHECKOUT= Target.the("boton checkout").located(By.id("checkOutButton"));
    public static final Target BTN_CHECKOUT_NEXT= Target.the("boton checkout siguiente").located(By.id("next_btn"));
    public static final Target BTN_MASTER_CREDIT = Target.the("boton metodo de pago tarjeta de credito").located(By.xpath("//input[@name='masterCredit']"));




    public static final Target TXT_CARD_NUMBER= Target.the("campo numero de tarjeta").located(By.id("creditCard"));
    public static final Target TXT_CVV = Target.the("campo cvv tarjeta").located(By.xpath("//input[@name='cvv_number']"));
    public static final Target SEL_MM = Target.the("seleccionador mes").located(By.xpath("//select[@name='mmListbox']"));
    public static final Target SEL_YYYY = Target.the("seleccionador año").located(By.xpath("//select[@name='yyyyListbox']"));
    public static final Target BTN_PAY_NOW = Target.the("boton pagar").located(By.id("pay_now_btn_ManualPayment"));


    public static final Target VERIFY_ORDER_PAYMENT = Target.the("verificar compra").located(By.xpath("//h3[normalize-space()='ORDER PAYMENT']"));





}


