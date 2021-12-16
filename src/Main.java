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

    public static void run(String[] args) {
        System.out.println("Hello man! My name is SaintOG\n" +
                "I was created in 2021.");
        System.out.println("Please, remind me your name\n");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + " !");
        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        remainder3 = scanner.nextInt();
        remainder5 = scanner.nextInt();
        remainder7 = scanner.nextInt();
        System.out.println(
                "Remaining 3: " + remainder3 +
                        "\nRemaining 5: " + remainder5 +
                        "\nRemaining 7: " + remainder7);
        Age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + Age + " years");
        System.out.println(" Enter the number to which I should count");
        userNumber = scanner.nextInt();
        for (int i = 0; i <= userNumber; i++) {
            System.out.println(i + " !");
        }
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Do you want to take a little test?" + "\n1. - YES" + "\n2. - NO");
        Test = scanner.nextInt();
        if (Test == 1) {
            System.out.println("Ok let's start");
        } else {
            System.out.println("But let's start anyway");
        }

        System.out.println("Did you like the dialogue with me?" + "\n1. - YES" + "\n2. - NO" + "\n3. - MAYBE");
        String choice = myScanner.nextLine();
        while (!choice.equalsIgnoreCase("1")) {
            System.out.println("I'm so upset");
            choice = myScanner.nextLine();
        }
        System.out.println("Thanks!!!" + "\nGoodbye, have a nice day!");
    }
}