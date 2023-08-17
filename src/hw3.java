import java.util.Scanner;

public class hw3 {
    static int number;
    static boolean gameIsOn;

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 9);
    }

    public static void main(String[] args) {
        int x = getRandomDiceNumber();
        System.out.println(x);
        gameIsOn = true;
        int attempts = 1;
        do {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите цифру от 0 до 9");
            number = in.nextInt();

            if (x == number) {
                System.out.println("верно");
                gameIsOn = false;
            }
            if (x > number || x < number) {
                System.out.println("неверно");
                attempts++;
            }
                if (number > x) {
                    System.out.println("меньше");
                }
                if (number < x) {
                    System.out.println("больше");
                }
                if(attempts >=3){
                    break;
                }

        } while (gameIsOn);
        System.out.println("End");



    }

}