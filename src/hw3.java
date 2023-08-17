import java.util.Scanner;

public class hw3 {
    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 9);
    }

    public static void main(String[] args) {
        int x = getRandomDiceNumber();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите цифру от 0 до 9");
        int number = (int) in.nextFloat();

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

        }
    }

