/*

Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.

 */


import java.util.Random;

public class Exercicio010ArrayMultidimensional {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] M = new int[4][4];
        int number;
        int number1;

        for (int row = 0; row < M.length; row++) {
            for (int column = 0; column < M[row].length; column++){
                M[row][column] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] row : M) {
            for (int elementColumn : row) {
                System.out.print(elementColumn + " ");
            }
            System.out.println();
        }

    }

}
