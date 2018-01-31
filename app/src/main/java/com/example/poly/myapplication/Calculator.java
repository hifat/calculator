package com.example.poly.myapplication;

class Calculator {

    int plus(int x, int y) {
        return x + y;
    }

    int minus(int x, int y) {
        return x - y;
    }

    int multiply(int x, int y) {
        return x * y;
    }

    int divide(int x, int y) {
        if (y == 0) {
            return 0;
        } else {

            return x / y;
        }
    }
}
