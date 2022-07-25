package ru.netology.sqr.javamavn.services;

public class SQRService {
    public int calcSqrt(int bottomBorder, int topBorder) {
        int counter = 0;

        for (int i = 10; i < 100; i++) {

            if (bottomBorder <= Math.pow(i, 2) && topBorder >= Math.pow(i, 2)) {
                counter++;
            }

        }
        return counter;
    }

}

