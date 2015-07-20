package hm.orz.sumpic.samples.replaceerrorcodewithexception;

public class InvalidCommandException extends Exception {

    public InvalidCommandException(String name) {
        super(name);
    }

    public InvalidCommandException() {

    }

}
