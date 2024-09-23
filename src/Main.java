import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        char previousChar = ' ';

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.toLowerCase(ch) == Character.toLowerCase(previousChar)) {
                    result.append(' ');
                }
                result.append(ch);
                previousChar = ch;
            } else if (Character.isWhitespace(ch)) {

                result.append(ch);
                previousChar = ' ';
            }
        }

        System.out.println("Обработанный текст: " + result.toString());
    }
}

