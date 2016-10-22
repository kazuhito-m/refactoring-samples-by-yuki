package com.github.kazuhito_m.samples.extractclass;

public class Main {
    public static void main(String[] args) {
        Book refactoring = new Book(
                "Refactoring: improving the design of existing code",
                "ISBN0201485672",
                "$44.95",
                "Martin Fowler",
                "fowler@acm.org");

        Book math = new Book(
                "�v���O���}�̐��w",
                "ISBN4797329734",
                "\\2310",
                "����_",
                "hyuki@hyuki.com");

        System.out.println("refactoring:");
        System.out.println(refactoring.toXml());

        System.out.println("math:");
        System.out.println(math.toXml());
    }
}
