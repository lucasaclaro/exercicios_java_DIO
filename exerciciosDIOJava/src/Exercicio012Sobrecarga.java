public class Exercicio012Sobrecarga {

    public static void area(double side) {

        double result = side * side;
        System.out.println("Square area: " + result + ".");
    }

    public static void area(double side1, double side2) {

        double result = side1 * side2;
        System.out.println("Rectangle area: " + result + ".");
    }

    public static void area(double biggerSide, double smallerSide, double heigth) {

        double result = ((biggerSide + smallerSide) * heigth) / 2;
        System.out.println("Trapeze area: " + result + ".");
    }

}
