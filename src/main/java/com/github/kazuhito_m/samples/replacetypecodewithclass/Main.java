package com.github.kazuhito_m.samples.replacetypecodewithclass;

public class Main {
    public static void main(String[] args) {
        Item book = new Item(
            Item.TYPECODE_BOOK,
            "���E�̗��j",
            4800);

        Item dvd = new Item(
            Item.TYPECODE_DVD,
            "�j���[���[�N�̖��E���ʔ�",
            3000);

        Item soft = new Item(
            Item.TYPECODE_SOFTWARE,
            "�`���[�����O�}�V���G�~�����[�^",
            3200);

        System.out.println("book = " + book.toString());
        System.out.println("dvd  = " + dvd.toString());
        System.out.println("soft = " + soft.toString());
    }
}
