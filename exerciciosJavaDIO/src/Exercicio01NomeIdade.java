import java.util.Scanner;

public class Exercicio01NomeIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;



        while(nome != 0) {
            System.out.println("Nome: ");
            nome = scan.next();
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }


    }
}
