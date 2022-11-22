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


        List lista = new ArrayList();


        System.out.println("Digite 5 números:");

        for (int cont = 0; cont < 5; cont++) {
            System.out.println("Número " + cont + ":");
            number = scan.nextInt();
            lista.add(number);

        }





        System.out.println(lista);







    }



}
