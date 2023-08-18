import java.util.Scanner;

public class hw3 {
    static int number;
    static boolean gameIsOn;

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 9);
    }
//TODO add this code to new class Game3attempts. In Main (Hw3) - starting game + asking to play again
    public static void main(String[] args) {
        int x = getRandomDiceNumber();
        System.out.println(x);
        gameIsOn = true;
        int attempts = 3;
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
                attempts--;
            }
            if (number > x) {
                System.out.println("меньше");
                if (number < x) {
                    System.out.println("больше");
                }
                System.out.println("Осталось попыток" + " " + attempts);
            }
            if (attempts <= 0) {
                gameIsOn = false;
            }

        } while (gameIsOn);
        System.out.println("End");
        System.out.println("Хотите начать игру снова? да - 1 нет - 0");

        Scanner yesno = new Scanner(System.in);
        System.out.println("Введите число");
        int y = yesno.nextInt();//TODO switch instead of if
        if (y == 1) {
            //как сделать повтор нужного цикла
            //TODO gameCircle - in separate method
            //FIXME new random number every attempt (check 3 tries)
        }
        if (y == 0) {
            System.out.println("Спасибо за игру");
        }
        while (gameIsOn) ;

    }
}

