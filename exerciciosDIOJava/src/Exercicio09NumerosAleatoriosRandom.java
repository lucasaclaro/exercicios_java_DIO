import java.util.Random;
import java.util.Scanner;

public class Exercicio09NumerosAleatoriosRandom {

    public static void main(String[] args) {

        Random random = new Random();
        int number;
        int count = 0;
        int [] listNumbers = new int[20];


        while (count <= 19) {
            number = random.nextInt(100);
            if (number >= 0 && number <=100) {
                listNumbers[count] = number;
                count++;
            }


        }

        System.out.print("\nList of numbers: ");

        for (int num : listNumbers) {
            System.out.print(num + " ");
        }

    }

}
