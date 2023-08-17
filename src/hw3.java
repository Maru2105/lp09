import java.util.Scanner;

public class hw3 {
    static int number;
    static int attempts;

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 9);
    }

    public static void main(String[] args) {
        int x = getRandomDiceNumber();
        System.out.println(x);
        attempts = 0;
        do {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите цифру от 0 до 9");
            number = in.nextInt();

            if (x == number) {
                System.out.println("верно");
            }
            if (x > number || x < number) {
                System.out.println("неверно");

                if (number > x) {
                    System.out.println("меньше");
                }
                if (number < x) {
                    System.out.println("больше");
                }
            }
            attempts++;
        } while (x!= number && attempts <3);
        System.out.println("End");



    }

}