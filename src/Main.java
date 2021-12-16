import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run(args);
    }

    public static int remainder3;
    public static int remainder5;
    public static int remainder7;
    public static int Age;
    public static int userNumber;
    public static int Test;
    public static int answer;

    public static void run(String[] args) {
        System.out.println("Hello man! My name is SaintOG\n" +
                "I was created in 2021.");
        System.out.println("Please, remind me your name\n");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + " !");
    }
}