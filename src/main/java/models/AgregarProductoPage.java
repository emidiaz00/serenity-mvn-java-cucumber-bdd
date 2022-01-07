package models;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class AgregarProductoPage {
    public static Target sign_in = Target.the("boton sign in").located(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
    public static Target t_shirts = Target.the("t-shirts a").located(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
    public static Target view_list = Target.the("ver como lista").located(By.className("icon-th-list"));
    public static Target add_cart = Target.the("button_add_cart").located(By.xpath("//*[contains(text(),'Add to cart')]"));
    public static Target product_added = Target.the("producto agregado").located(By.xpath("//*[@class='layer_cart_product col-xs-12 col-md-6']/h2"));


    public static Target usernameField = Target.the("create an account_field").located(By.id("is_required validate account_input form-control"));
    public static Target create_button = Target.the("create an account_button").located(By.className("icon-user left"));

}