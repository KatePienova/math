package com.company;

public class math8 {
    public static void main() {
        int a = 9;
        int b = 6;
        int c = a + 6 * ++b;
        System.out.println(c);
        System.out.println("Скобки позволяют переопределить порядок вычислений:");
        int r = 9;
        int e = 6;
        int t = (a + 6) * ++b;
        System.out.println(t);
    }
}
