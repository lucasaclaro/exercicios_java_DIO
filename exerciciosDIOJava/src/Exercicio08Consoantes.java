/*

Faça um programa que leia um vetor de 6 caracteres e diga quantas consoantes foram lidas, imprimindo-as.

*/


import java.util.Scanner;

public class Exercicio08Consoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int qtdConsoantes = 0;
        int count = 0;


        do {
            System.out.println("Letra [" + count + "]:");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                  letra.equalsIgnoreCase("e") |
                  letra.equalsIgnoreCase("i") |
                  letra.equalsIgnoreCase("o") |
                  letra.equalsIgnoreCase("u"))) {
               consoantes[count] = letra;
               qtdConsoantes++;
            }

            count++;
        } while(count < consoantes.length);

        System.out.println("Consoantes digitadas:");
        for ( String consoante : consoantes ) {
            if ( consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\nQuantidade de consoantes: "+ qtdConsoantes);


    }



}
