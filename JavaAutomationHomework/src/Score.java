import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int score;
        while(true) {
            System.out.print("Please enter your score: ");
            Scanner sc = new Scanner(System.in);
            score = sc.nextInt();
            if (score <= 100 & score >= 0)  {
                break;
            } else {
                System.out.println("Incorrect value entered!");
            }
        }

        if (score >= 70) {
            System.out.println("Congrats! You’ve passed the test!");
        } else {
            System.out.println("Sorry, you’ve failed the test.");
        }
    }
}
