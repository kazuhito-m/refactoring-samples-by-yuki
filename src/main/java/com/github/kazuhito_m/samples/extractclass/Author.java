package com.github.kazuhito_m.samples.extractclass;

/**
 * Created by kazuhito_m on 15/07/15.
 */
public class Author {

    private String _name;
    private String _mail;

    public Author(String name, String mail) {
        _name = name;
        _mail = mail;
    }

    public String getName() {
        return _name;
    }

    public String getMail() {
        return _mail;
    }
}
