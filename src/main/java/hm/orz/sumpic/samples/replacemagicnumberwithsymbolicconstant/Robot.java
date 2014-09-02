public class Robot {

//    public static final int COMMAND_WALK = 0;
//    public static final int COMMAND_STOP = 1;
//    public static final int COMMAND_JUMP = 2;

//    public enum Command {
//        WALK,
//        STOP,
//        JUMP,
//    };


    private final String _name;
    public Robot(String name) {
        _name = name;
    }
    public void order(int command) {
        if (command == 0) {
            System.out.println(_name + " walks.");
        } else if (command == 1) {
            System.out.println(_name + " stops.");
        } else if (command == 2) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
