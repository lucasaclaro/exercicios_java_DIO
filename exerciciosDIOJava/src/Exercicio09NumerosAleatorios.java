/*

Faça um programa que leia 20 números inteiros aleatórios (0 a 100) e armazene-os em um vetor.
Ao final mostre os números e seus sucessores.

*/


import java.util.Scanner;

public class Exercicio09NumerosAleatorios {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        int count = 0;
        int [] listNumbers = new int[20];

        System.out.println("Type it 20 numbers (0 to 100).\n");

        while (count <= 19) {

            System.out.print("Number [" +count + "]: ");
            number = scan.nextInt();
            if (number >= 0 && number <=100) {
                listNumbers[count] = number;
                count++;
            } else {
                System.out.println("Invalid number, type it again. Number between 0 to 100: ");
            }


        }

        System.out.print("\nList of numbers: ");

        for (int num : listNumbers) {
            System.out.print(num + " ");
        }

    }

}
