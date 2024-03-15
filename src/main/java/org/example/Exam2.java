package org.example;

public class Exam2 {
    public static void main(String[] args) {
        // 높이 : 3

        /*

         *
         ***
         *****

         */

        for (int i=1; i<4; i++){
            for (int j=2; j>=0; j--){ // 널어디 둬야하니...
                System.out.print(" ");
            }
            for (int c=1; c<=i; c++){
                for (int d=c; d<=i; d++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 높이 : 5

        // 출력

        /*

         *
         ***
         *****
         *******
         *********

         */
        for (int i=1; i<6; i++){
            for (int j=5; j>=0; j--){
                System.out.print(" ");
            }
            for (int c=1; c<=i; c++){
                for (int d=c; d<=i; d++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 높이 : 7

        // 출력

        /*

         *
         ***
         *****
         *******
         *********
         ***********
         *************

         */
        for (int i=1; i<8; i++){
            for (int j=7; j>=0; j--){
                System.out.print(" ");
            }
            for (int c=1; c<=i; c++){
                for (int d=c; d<=i; d++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
