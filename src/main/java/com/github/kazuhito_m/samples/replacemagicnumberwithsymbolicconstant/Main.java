package com.github.kazuhito_m.samples.replacemagicnumberwithsymbolicconstant;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(WALK); // walk
        robot.order(STOP); // stop
        robot.order(JUMP); // jump

    }
}
