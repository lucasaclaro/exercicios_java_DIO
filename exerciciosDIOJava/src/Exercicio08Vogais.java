/*

Faça um programa que leia um vetor de 6 caracteres e diga quantas vogais foram lidas, imprimindo-as.

*/


import java.util.Scanner;

public class Exercicio08Vogais {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] listVowel = new String[6];
        int qtdVowel = 0;
        String letter;

        System.out.println("Type it 6 letters:");

        for (int count = 0; count < 6; count++) {
            System.out.print("Letter [" + count + "]: ");
            letter = scan.next();
            if ((letter.equalsIgnoreCase("a") | letter.equalsIgnoreCase("e") | letter.equalsIgnoreCase("i") | letter.equalsIgnoreCase("o") | letter.equalsIgnoreCase("u"))) {
                listVowel[count] = letter;
                qtdVowel++;
            }


        }
        System.out.print("\nTyped vowels: ");

        for (String vowel : listVowel) {
            if (vowel != null) {
                System.out.print(vowel + " ");
            }

        }

        System.out.println(".\nAmount vowel: " + qtdVowel + ".");





    }



}
