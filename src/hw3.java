import java.util.Scanner;

public class hw3 {
    static int number;
    static int world;
    static boolean gameIsOn;

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 9);
    }

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
                if(attempts <=-0){
                    break;

                }

        } while (gameIsOn);
        System.out.println("End");
        System.out.println("Хотите начать игру снова? да - 1 нет - 0");

        Scanner yesno = new Scanner(System.in);
        System.out.println("Введите число");
        int y = yesno.nextInt();
        if (y == 1){
           //как сделать повтор нужного цикла
        }
        if (y == 0){
            System.out.println("Спасибо за игру");
        }while (gameIsOn);

        }
    }

