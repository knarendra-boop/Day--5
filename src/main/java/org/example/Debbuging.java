package org.example;

import java.util.Scanner;

public class Debbuging {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter a");
        int a = sc.nextInt();
        System.out.print("enter b");
        int b = sc.nextInt();

        int sum = add(a, b);   // <-- we will put breakpoint here
        System.out.println(sum);
    }

    static int add(int x, int y) {
        int result = x + y;
        return result;
    }
}

