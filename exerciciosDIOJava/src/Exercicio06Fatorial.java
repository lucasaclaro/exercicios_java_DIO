/*

Faça um programa que calcule o fatorial de um número inteiro.

*/


import java.util.Scanner;

public class Exercicio06Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        int res = 1;

        System.out.println("Digite um número para que seja gerado o seu fatorial: ");
        number = scan.nextInt();
        System.out.print(number + "! = ");

        for (int count = number; count > 1; count--) {
            System.out.print(count + " x ");
            res *= count;
            if (count == 2) {
                System.out.print("1 = ");
            }
        }

        System.out.println(res);





    }




}
