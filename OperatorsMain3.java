package operators;

import java.util.Objects;
import java.util.Scanner;

public class OperatorsMain3 {

    public static void main(String[] arddsdsdds) {
        Scanner in = new Scanner(System.in);
        System.out.print("Как Вас зовут?: ");
        String name = in.nextLine();
        Objects.equals("Вася", "Анастасия");
        if (name.equals("Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!name.equals("Вася")&&!name.equals("Анастасия")){
            System.out.println("Добрый день,а вы кто?");
        }
    }
}
