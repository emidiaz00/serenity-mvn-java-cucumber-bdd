package models;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarsePage {

    public static Target create_button = Target.the("formulario").located(By.id("SubmitCreate"));
    public static Target form = Target.the("formulario").located(By.className("page-subheading"));
    public static Target sign_in = Target.the("boton sign in").located(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
    public static Target input_email = Target.the("input para mail").located(By.id("email_create"));
    public static Target input_genero = Target.the("input para genero").located(By.id("id_gender1"));
    public static Target input_primer_nombre = Target.the("input primer nombre").located(By.id("customer_firstname"));
    public static Target input_segundo_nombre = Target.the("input segundo nombre").located(By.id("customer_lastname"));
    public static Target password = Target.the("password").located(By.id("passwd"));
    public static Target nacimiento = Target.the("nachimiento fecha").located(By.id("form-control"));
    public static Target nacimientoFechaDropdown = Target.the("nacimiento fecha2").located(By.xpath("//*[@id=\'days\']/option[4]"));
    public static Target nacimientoMesDropdown = Target.the("nacimiento mes").located(By.xpath("//*[@id=\'months\']/option[2]"));
    public static Target nacimientoAñoDropdown = Target.the("nacimiento año").located(By.xpath("//*[@id=\'years\']/option[20]"));
    public static Target PostalCode = Target.the("nacimiento año").located(By.id("postcode"));


    public static Target FirstName = Target.the("primer nombre").located(By.id("firstname"));
    public static Target LastName = Target.the("segundo nombre").located(By.id("lastname"));
    public static Target Company= Target.the("empresa").located(By.id("company"));
    public static Target address1 = Target.the("adress").located(By.id("address1"));
    public static Target city = Target.the("ciudad").located(By.id("city"));

    public static Target State = Target.the("estado").located(By.id("id_state"));
    public static Target StateDropDown = Target.the("estado dropdown").located(By.xpath("//*[@id=\'id_state\']/option[4]"));

    public static Target PhoneMobile = Target.the("phone").located(By.id("phone_mobile"));
    public static Target Reference = Target.the("alias").located(By.id("alias"));
    public static Target RegisterButton = Target.the("button register").located(By.xpath("//*[@id=\'submitAccount\']/span"));


















}
