
/*
Faça um programa que peça uma nota entre 0 e 10 e mostre uma mensagem caso o valor seja inválido até que o usuário digite o valor correto.
*/


import java.util.Scanner;

public class Exercicio02Notas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite um número entre 0 e 10:");

        while (true) {

            System.out.println("Nota:");
            nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota digitada: " + nota + ".");
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Número inválido, digite uma nota entre 0 e 10.");
            }
        }



    }

}
