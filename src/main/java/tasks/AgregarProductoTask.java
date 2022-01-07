package tasks;

import navegacion.NavigateTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class AgregarProductoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        /**
           1-El usuario de nombre emiliano
           2-Agregar Producto al carrito
            3-ingresa a la pagina de automation practice
            4-cliquea en t_shirts
            5-cliquea en ver como lista
            6-agrega el elemento al carrito
            7-verifica que el producto se haya agregado **/

        actor.attemptsTo(
                NavigateTo.theHomePage()
        );
    }
}
