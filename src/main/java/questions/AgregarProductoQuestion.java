package questions;

import models.AgregarProductoPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class AgregarProductoQuestion {
    public static Question<String> messageAvailable() {
        return actor -> TextContent.of(AgregarProductoPage.product_added).viewedBy(actor).asString();
    }
}
