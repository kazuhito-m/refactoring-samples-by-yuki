package hm.orz.sumpic.samples.originalsamples.iresure;

/**
 * Created by kazuhito_m on 15/08/21.
 */
public class Base {

    private String name;

    private int type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private Base() {

    }


    public static create(String name , int type) {
        Base b = new Base();
        b.setName(name);
        b.setType(type);
        return b;
    }



}
