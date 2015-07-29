package hm.orz.sumpic.samples.originalsamples.dictionaly;

/**
 * Created by kazuhito_m on 15/07/30.
 */
public class Suggest {

    private final String value;
    private final String description;
    private final String displayText;


    public Suggest(String value , String description) {
        this.value= value;
        this.description = defaultString(description);
        if (description.isEmpty()) {
            this.displayText = this.value;
        } else {
            this.displayText = String.format("%s (%s)" , this.value,this.description);
        }
    }

    @Override
    public String toString() {
        return displayText;
    }

    // ---- getter ----

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    // ---- utility methods ----


    private static String defaultString(String value) {
        return value == null ? "" : value;
    }




}
