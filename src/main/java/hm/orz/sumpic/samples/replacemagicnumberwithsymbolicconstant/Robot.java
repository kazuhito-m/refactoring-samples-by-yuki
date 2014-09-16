package hm.orz.sumpic.samples.replacemagicnumberwithsymbolicconstant;

public class Robot {

//    public static final int COMMAND_WALK = 0;
//    public static final int COMMAND_STOP = 1;
//    public static final int COMMAND_JUMP = 2;

    public enum Command {
        WALK,
        STOP,
        JUMP,
    };


    private final String _name;
    public Robot(String name) {
        _name = name;
    }
    public void order(Command command) {
        if (command == Command.WALK) {
            System.out.println(_name + " walks.");
        } else if (command == Command.STOP) {
            System.out.println(_name + " stops.");
        } else if (command == Command.JUMP) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
