public class Main {


    public static void main(String[] args) {

        System.out.println("Calculator exercise:");
        Exercicio011MetodosCalculadora.sum(3, 6);
        Exercicio011MetodosCalculadora.subtraction(9, 8);
        Exercicio011MetodosCalculadora.multiplication(8, 7);
        Exercicio011MetodosCalculadora.division(15, 3);


        System.out.println("\n Message exercise:");
        Exercicio011MetodosMensagem.message(24);


        System.out.println("\n Loan exercise:");
        Exercicio011MetodosEmprestimo.calculate(1500, 2);


        System.out.println("\n Overload exercise:");
        Exercicio012Sobrecarga.area(5);
        Exercicio012Sobrecarga.area(2, 5);
        Exercicio012Sobrecarga.area(5, 8, 9);

        System.out.println("\n Return exercise:");
        System.out.println("Square area: " + Exercicio013Return.area(5) + ".");
        System.out.println("Rectangle area: " + Exercicio013Return.area(5, 5) + ".");
        System.out.println("Trapaze area: " + Exercicio013Return.area(5, 6, 7) + ".");



    }




}