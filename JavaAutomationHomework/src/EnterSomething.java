import java.util.Scanner;

public class EnterSomething {
    public static void main(String[] args) {
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        String exitFromCycle = "Exit";
        do {
            System.out.print("Please enter something ");
            str = scanner.nextLine();
        } while (!str.equals(exitFromCycle));
    }
}

