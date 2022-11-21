import java.util.Scanner;


/*
Faça um programa que leia nome e idade do usuário e interrompa o programa quando for digitado 0 no campo nome.
*/


public class Exercicio01NomeIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite abaixo o seu nome e idade. Para interromper o programa digite 0 no campo nome: ");

        while(true) {

            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0")) {
                System.out.println("Encerrando programa...");
                break;
            }

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }


    }
}