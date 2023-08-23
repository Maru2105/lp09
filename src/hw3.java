import java.util.Scanner;

public class hw3 {
    static int number;

    static boolean gameIsOn;



    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру! Вам нужно отгадать число");
        RandomNumber();
        startGame();
       endGame();

    }

    private static int RandomNumber() {
        return (int) (Math.random() * 9);
    }

    private static void endGame() {
        System.out.println("Конец игры");

        System.out.println("Хотите начать игру снова? да/нет ");


        Scanner yesno = new Scanner(System.in);
        System.out.println("Введите ваш ответ");
        String y = yesno.nextLine();
        switch (y) {
            case "да":
                startGame();
                endGame();
                break;
            case "нет":
                System.out.println("Спасибо за игру");
                break;
        }


    }

    private static void Scannerpeople() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цифру от 0 до 9");
        number = in.nextInt();
    }

    private static void startGame() {
        int x = RandomNumber();
        gameIsOn = true;
        int attempts = 3;
        do {
            Scannerpeople();

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
            }
            if (number < x) {
                System.out.println("больше");
            }
            System.out.println("Осталось попыток" + " " + attempts);

            if (attempts <= 0) {
                gameIsOn = false;
            }

        } while (gameIsOn);
    }
}




