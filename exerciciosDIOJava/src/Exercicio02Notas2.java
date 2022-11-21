
/*
Faça um programa que peça uma nota entre 0 e 10 e mostre uma mensagem caso o valor seja inválido até que o usuário digite o valor correto.
*/


import java.util.Scanner;

public class Exercicio02Notas2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota do aluno, a qual deve ser entre 0 e 10.");
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
            System.out.println("Nota: ");
            nota = scan.nextInt();
        }

        System.out.println("Nota digitada: " + nota + ". Programa encerrado.");

    }


}
