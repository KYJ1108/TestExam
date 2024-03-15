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
            for (int j=2; j>=0; j--){
                System.out.print(" ");
            }
            for (int c=1; c<=i; c++){
                System.out.print("*");
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

    }
}
