package oop.polymorphism;

import java.util.Arrays;

class Calculator {
    int add(int a, int b) { return a + b; }
    int add(int... elems) { return Arrays.stream(elems).sum(); }
    double add(double a, double b) { return a + b; }
}
