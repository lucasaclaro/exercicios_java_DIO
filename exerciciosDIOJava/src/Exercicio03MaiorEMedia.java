import java.util.*;

/*

Faça um programa que leia cinco números e informe o maior valor e a média entre eles.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        int sizeList;
        int maior = -9999;
        int total = 0;
        double media;



        List lista = new ArrayList();


        System.out.println("Digite 5 números entre (menor valor aceito: -9999) :");

        for (int count = 0; count < 5; count++) {
            System.out.println("Número " + count + ":");
            number = scan.nextInt();
            while (number < -9999) {
                System.out.println("Valor inválido. O menor valor aceito é -9999");
                System.out.println("Número " + count + ":");
                number = scan.nextInt();
            }
            lista.add(number);
            total += number;
            if (number > maior) {
                maior = number;
            }
        }





        System.out.println("Números digitados: " + lista + ".");
        sizeList = lista.size();
        System.out.println("O maior número digitado é " + maior + ".");
        media = total / sizeList;
        System.out.println("A média entre os números digitado é " + media + ".");








    }



}
