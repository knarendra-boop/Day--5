package org.example;

public class StackTraceIdentify {
    public static void main(String[] args) {
        System.out.print(divide(10, 0));
    }

    static int divide(int a, int b) {
         int result = a / b;
         return result;
         // line 10
    }
}