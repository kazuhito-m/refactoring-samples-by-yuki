package hm.orz.sumpic.samples.originalsamples.iresure;

/**
 * Created by kazuhito_m on 15/08/21.
 */
public class Inherit extends Base {

    private String description;

    public String getKey() {
        return String.format("_%n_%s" , this.getType() , this.getName());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Inherit create(String name , int type , String description) {
        Inherit b = new Inherit();
        b.setName(name);
        b.setType(type);
        b.setDescription(description);
        return b;
    }


}
