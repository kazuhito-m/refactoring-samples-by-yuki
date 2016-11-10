package com.github.kazuhito_m.samples.Introducenullobject;

public class Person {

    private final Label _name;
    private final Label _mail;

    public Person(Label name, Label mail) {
        _name = name;
        _mail = mail;
    }

    public Person(Label name) {
        this(name, Label.NULL);
    }

    public void display() {
        _name.display();
        _mail.display();
    }

    public String toString() {
        return String.format("[ Person: name=%s mail=%s ]", _name, _mail);
    }

}
