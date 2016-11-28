/* PunctA : Read a number N from the keyboard.
Print all the numbers between 0 and N that Are odd on a new line
Read 5
Print
1. 1
2. 3
3. 5

 PunctB : Print the remainder of dividing N with 5 (use the % operator).
        1. Read 7
        2. Print 2

  PunctC : Print all the numbers between 0 and N that can be divided by 3 on the same line,
           separated by a comma (last number has a comma at the end) :
        Read: 7
        Print: 0,3,6,

 PunctD : Print all the numbers between 0 and N that divide N
         (X will divide N if the rest of dividing N with X is 0 => N % X == 0)
         Read 12
         Print: 1,2,3,4,6,12
 PunctE :Count how many numbers between 0 and N divide N
         Read 13
         Print: 2

*/


package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

       // punctA();
       // punctB();
                // punctC();
               // punctD();
                punctE();

        }

        public static void punctA (){
                // punct a
                int N;
                System.out.print("Dati numarul : ");
                N = new Scanner(System.in). nextInt();
                int rest;
                int nr_linie =0;
                for( int i = 1; i<=N ;i++){
                        rest = i%2;
                        if (rest == 1) {
                                nr_linie++;
                                System.out.println(nr_linie  + ". " + i);
                        }
                }
        }

        public static void punctB(){
                // punct b
                int N;
                System.out.print("Dati numarul : ");
                N = new Scanner(System.in). nextInt();
                int reminder;
                reminder = N % 5;
                System.out.println("Restul impartirii lui " + N + " la " + 5 + " este : " + reminder);
        }

        public static void punctC(){
                // punct c
                int N;
                System.out.print("Dati numarul : ");
                N = new Scanner(System.in). nextInt();
                int rest;
                for( int i = 0; i<=N ;i++){
                        rest = i%3;
                        if (rest == 0) {
                                System.out.print(  i +",");
                        }
                }
        }
        public static void punctD(){
                // punct d
                int N;
                System.out.print("Dati numarul : ");
                N = new Scanner(System.in). nextInt();
                int rest;
                for( int X = 1; X<=N ;X++){
                        rest = N%X;
                        if (rest == 0) {
                                System.out.print(  X +",");
                        }
                }
        }
        public static void punctE(){
                // punct e
                int N;
                System.out.print("Dati numarul : ");
                N = new Scanner(System.in). nextInt();
                int rest;
                int count=0;
                for( int X = 1; X<=N ;X++){
                        rest = N%X;
                        if (rest == 0 ){
                                count++;
                        }
                }
                System.out.print(count);

        }
}