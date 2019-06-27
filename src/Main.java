import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        int randomNum1 = (int) (Math.random() * 10);
        int randomNum2 = (int) (Math.random() * 10);

        TimerTask timeIsUp = new TimerTask() {
            public void run() {
                System.out.println("Time's up!");
                System.exit(0);
            }
        };

        System.out.println("What is " + randomNum1
                + " plus " + randomNum2 + "?");
        Timer timer = new Timer();
        timer.schedule(timeIsUp, 5000);

        int answer = randomNum1 + randomNum2;
        Scanner input = new Scanner(System.in);
        int userAnswer = input.nextInt();

        if (answer == userAnswer) {
            System.out.println("That's right!");
        } else {
            System.out.println("No, you did a mistake! The answer is " + answer);
        }
        System.exit(0);
    }
}
