import java.util.Scanner;

public class RemoteController {
    public static void main(String[] args) {
        String[] channels = new String[9];
        channels[0] = "Охота и рыбалка";
        channels[1] = "Cinema";
        channels[2] = "Комедия";
        channels[3] = "Телепутешествия";
        channels[4] = "Домашние животные";
        channels[5] = "Моя Планета";
        channels[6] = "Карусель";
        channels[7] = "Дорама";
        channels[8] = "Мульт";

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please, enter channel number ");
            int channelNumber = scanner.nextInt();
            if (channelNumber != 0) {
                System.out.println(channels[channelNumber - 1]);
            } else {
                break;
            }
        }
    }
}
