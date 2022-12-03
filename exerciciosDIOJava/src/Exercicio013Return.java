public class Exercicio013Return {

    public static double area(double side) {
        double result = side * side;
        return result;
    }

    public static double area(double side1, double side2) {
        double result = side1 * side2;
        return result;
    }

    public static double area(double biggerSide, double smallerSide, double height) {
        double result = ((biggerSide + smallerSide) * height) / 2;
        return result;
    }



}
