import java.util.*;

/*

Faça um programa que gere uma tabuada.

*/

public class Exercicio05Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("Digite um número para que seja gerada a sua tabuada: ");
        number = scan.nextInt();

        System.out.println("\nGerando tabuada...\n");
        for (int count = 0; count < 11; count++) {
            System.out.println(number + " x " + count + " = " + (number * count));
        }









    }


}
