package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPaginaPrincipal {
    // Mapeo del boton Sign in

    public static final Target BTN_SIGN_IN = Target.the( "Boton para ir al formulario de iniciar sesion")
            .located(By.className("navbar__btn"));

    // Mapeo del input para ingresar user
    public static final Target TXT_USERNAME = Target.the( "Input para ingresar nombre de usuario o correo")
            .located(By.id("username"));

    // Mapeo del input para ingresar contraseña
    public static final Target TXT_PASSWORD= Target.the( "Input para ingresar contraseña")
            .located(By.id("password"));

    // Mapeo del boton para iniciar sesion
    public static final Target TXT_BUTTON= Target.the( "Boton para iniciar sesion")
            .located(By.id("kc-login"));


}


