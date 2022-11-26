public class Exercicio011MetodosMensagem {

    public static void message(int hour) {

        if (hour >= 0 && hour < 12 || hour == 24) {
            System.out.println("Good morning, it's " + hour + " o'clock." );
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good afteroon, it's " + hour + " o' clock.");
        } else if (hour >= 18 && hour < 24) {
            System.out.println("Good evening, it's " + hour + " o' clock.");
        } else if (hour < 0 || hour > 24) {
            System.out.println("Invalid hour, try again.");
        }

    }



}
