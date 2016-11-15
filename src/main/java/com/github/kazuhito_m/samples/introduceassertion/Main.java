package com.github.kazuhito_m.samples.introduceassertion;

import java.util.Random;

public class Main {
    private static final Random random = new Random(1234);

    private static void execute(int length) {
        // �����Ńf�[�^�쐬
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(data.length);
        }

        // �f�[�^��\��
        SortSample sorter = new SortSample(data);
        System.out.println("BEFORE:" + sorter);

        // �\�[�g�����s���ĕ\��
        sorter.sort();
        System.out.println(" AFTER:" + sorter);

        System.out.println();
    }

    public static void main(String[] args) {
        execute(10);
        execute(10);
        execute(10);
        execute(10);
        execute(10);
    }
}