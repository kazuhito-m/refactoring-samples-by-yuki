package hm.orz.sumpic.samples.replacemagicnumberwithsymbolicconstant;

import static hm.orz.sumpic.samples.replacemagicnumberwithsymbolicconstant.Robot.Command.*;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(WALK); // walk
        robot.order(STOP); // stop
        robot.order(JUMP); // jump

    }
}
