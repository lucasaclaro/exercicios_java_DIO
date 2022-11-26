public class Exercicio011MetodosEmprestimo {

    public static int getFourInstallments() {
        return 3;
    }

    public static double getThreeInstallments() {
        return 0.3;
    }

    public static double getTwoInstallments() {
        return 0.15;
    }

    public static void calculate(double loan, int installments) {

        double result;

        if (installments == 4) {
            result = loan + (loan * getFourInstallments());
            System.out.println("With " + installments + " installments, the final price of loan is R$" + result + "." );
        } else if (installments == 3) {
            result = loan + (loan * getThreeInstallments());
            System.out.println("With " + installments + " installments, the final price of loan is R$" + result + "." );
        } else if (installments == 2) {
            result = loan + (loan * getTwoInstallments());
            System.out.println("With " + installments + " installments, the final price of loan is R$" + result + "." );
        } else if (installments == 1) {
            result = loan;
            System.out.println("With " + installments + "installment, the final price of loan is R$" + result + ".");
        } else {
            System.out.println("Numbers of installments invalid.");
        }


    }

}
