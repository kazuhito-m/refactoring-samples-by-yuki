package com.github.kazuhito_m.samples.replaceerrorcodewithexception;

public class InvalidCommandException extends Exception {

    public InvalidCommandException(String name) {
        super(name);
    }

    public InvalidCommandException() {

    }

}
