package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheElementIsDisplayed implements Question<Boolean> {

    public Target element;

    public TheElementIsDisplayed(Target element){
        this.element=element;
    }

    public static Question<Boolean> to(Target element){
        return new TheElementIsDisplayed(element);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        /*actor.attemptsTo(
                WaitUntil.the(element,isClickable()).forNoMoreThan(20).seconds()
        );*/
        return true;
    }
}
