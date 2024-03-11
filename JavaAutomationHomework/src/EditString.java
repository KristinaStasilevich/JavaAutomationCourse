import java.util.Scanner;

public class EditString {
    public static void main(String[] args) {
        String normalString = "Всем привет! Пусть день пройдет прекрасно!";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фразу: " + normalString);
        String enterString = sc.nextLine();
        System.out.println("Длина введенной Вами строки: " + enterString.length() + " символов");

        if (enterString.isEmpty()) {
            System.out.println("Вы ввели пустутю строку. Попробуйте ещё раз!");
        } else {
            System.out.println("Введенная строка не пустая");
        }

        System.out.println("Первый введенный вами символ: " + enterString.charAt(0));


        if (enterString.equals(normalString)) {
            System.out.println("Введенный вами текст: " + normalString);
        } else {
            System.out.println("Вы ввели неизвестный текст");
        }

        if (enterString.equalsIgnoreCase(normalString)) {
            System.out.println("Введенный вами текст: " + normalString);
        }

        System.out.println ("Введенная вами строка начинается со слова \"Всем\": " + enterString.startsWith("Всем"));
        System.out.println ("Введенная вами строка заканчивается словом \"прекрасно!\": " + enterString.endsWith("прекрасно!"));
        System.out.println ("Введенная вами строка содержит слово \"день\": " + enterString.contains("день"));
        System.out.println(enterString.replace("е", "Е"));
        System.out.println(enterString.replace("привет", "hello"));
        System.out.println(enterString.toLowerCase());

        System.out.println("Введите ваше имя:");
        String name = sc.nextLine();
        System.out.println("Введите вашу фамилию:");
        String lastName = sc.nextLine();
        System.out.println("Введите ваш возраст:");
        int age = sc.nextInt();
        String fullName = String.format("Ваше полное имя: %s %s. Ваш возраст %d лет", name, lastName, age);
        System.out.println(fullName);

        StringBuffer mutableString = new StringBuffer("Всем привет! ");
        mutableString.append("Пусть день пройдет прекрасно! ");
        mutableString.append("И пусть у вас всё получится!");
        System.out.println(mutableString);

    }
}