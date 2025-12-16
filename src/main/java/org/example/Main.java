package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;

        public class Main {
            public static void main(String[] args) {

                List<Integer> ints = new ArrayList<>();
                ints.add(10);

                List<?> list = ints;

                // READ
                Object o = list.get(0);

                // WRITE
              //   list.add(20); // ❌ not allowed

                // OUTPUT
                System.out.println(o);
            }
        }

