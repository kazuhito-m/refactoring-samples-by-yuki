package com.github.kazuhito_m.samples.hidedelegate;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            AddressFile file = new AddressFile(args[0]);
            file.set("Hiroshi Yuki", "hyuki@example.com");
            file.set("Tomura", "tomura@example.com");
            file.set("Hanako Sato", "hanako@example.com");
            file.update();

            @SuppressWarnings("unchecked")
			Enumeration<String> e = (Enumeration<String>) file.names();
            while (e.hasMoreElements()) {
                String name = e.nextElement();
                String mail = file.get(name);
                System.out.println("name=" + name + ", mail=" + mail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
