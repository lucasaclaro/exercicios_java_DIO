import java.util.*;

/*

Faça um programa que leia X números inteiros, calcule e mostre a quantidade de números pares e ímpares.

*/


public class Exercicio04ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List pair_numbers = new ArrayList<>();
        List odd_numbers = new ArrayList<>();
        int qtd_pair_numbers;
        int qtd_odd_numbers;
        int number = 0;

        System.out.println("Digite abaixo números inteiros positivos (999 para interromper):");

        while (true) {
            System.out.println("Número: ");
            number = scan.nextInt();
            if (number == 999) {
                break;
            } else  {
                if (number % 2 == 0){
                    pair_numbers.add(number);
                } else {
                    odd_numbers.add(number);
                }


            }

        }

        qtd_pair_numbers = pair_numbers.size();
        qtd_odd_numbers = odd_numbers.size();
        System.out.println("Foi(ram) digitado(s) " + qtd_pair_numbers + " número(s) par(es), sendo ele(s): " + pair_numbers + "." );
        System.out.println("Foi(ram) digitado(s) " + qtd_odd_numbers + " número(s) par(es), sendo ele(s): " + odd_numbers + "." );

    }


}
