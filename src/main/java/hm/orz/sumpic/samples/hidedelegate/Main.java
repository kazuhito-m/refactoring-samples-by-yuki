package hm.orz.sumpic.samples.hidedelegate;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            AddressFile file = new AddressFile(args[0]);
            file.getDatabase().set("Hiroshi Yuki", "hyuki@example.com");
            file.getDatabase().set("Tomura", "tomura@example.com");
            file.getDatabase().set("Hanako Sato", "hanako@example.com");
            file.getDatabase().update();

            @SuppressWarnings("unchecked")
			Enumeration<String> e = (Enumeration<String>) file.names();
            while (e.hasMoreElements()) {
                String name = e.nextElement();
                String mail = file.getDatabase().get(name);
                System.out.println("name=" + name + ", mail=" + mail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
