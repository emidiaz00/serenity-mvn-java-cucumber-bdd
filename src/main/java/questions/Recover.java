package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Recover implements Question<String> {
    private final String recordedValue;

    public Recover(String recordedValue){
        this.recordedValue=recordedValue;
    }
    public static Question<String> TheRecordedValue(String valueName){
        return new Recover(valueName);
    }

    @Override
    public String answeredBy(Actor actor){
        return actor.recall(recordedValue);
    }
}
