import java.util.Scanner;

public class EnterSomething {
    public static void main(String[] args) {
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        String exitFromCycle = "Exit";
        while (true) {
            if(str.length() == 0) {
                System.out.print("Please enter something ");
                str = scanner.nextLine();
            } else if(!str.isEmpty() & !str.equals(exitFromCycle)) {
                System.out.print("Please enter something ");
                str = scanner.nextLine();
            } else {
                break;
            }
        }

    }
}
