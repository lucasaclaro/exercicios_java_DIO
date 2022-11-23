/*

Faça um programa que peça 6 números inteiros e os apresente na ordem inversa.

*/


import java.util.*;

public class Exercicio07OrdemInversa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        List numbers_list = new ArrayList();

        for (int count = 1; count < 7; count++) {
            System.out.println("Number " + count + ": ");
            number = scan.nextInt();
            numbers_list.add(number);
        }

        Collections.reverse(numbers_list);
        System.out.println(numbers_list);


        System.out.println("-----------------------------------");
        System.out.println("Outra maneira: ");
        System.out.println();

        int[] vetor = {1, 5, 9, 8, 7, 9};

        System.out.print("Vetor original: ");
        for (int count = 0; count < vetor.length; count++) {
            System.out.print(vetor[count]);
        }

        System.out.println();
        System.out.print("Vetor na ordem inversa: ");
        for (int count = vetor.length - 1; count >= 0; count--) {
            System.out.print(vetor[count]);
        }

    }


}
