package com.github.kazuhito_m.samples.replaceInheritancewithdelegation;

import java.util.Random;

public class Dice {

    private final Random random;

    public Dice() {
        this.random = new Random(314159L);
    }

    public Dice(long seed) {
        this.random = new Random(seed);
    }

    public int nextInt() {
        return this.random.nextInt(6) + 1;
    }

    public void setSeed(long seed) {
        this.random.setSeed(seed);
    }

}
