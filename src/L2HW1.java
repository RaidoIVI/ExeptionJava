//import java.util.Scanner;

import java.util.*;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.
*/
public class L2HW1 implements IHomeWork {
    @Override
    public int getLesson() {
        return 2;
    }

    @Override
    public int getHomeWork() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.\n" +
                "Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,\n" +
                "необходимо повторно запросить у пользователя ввод данных.";
    }

    public void Run() {
        Scanner in = new Scanner(System.in);
        String userEnter = null;
        do {
            System.out.print("Введите число для парсинга или ! для выхода: ");
            userEnter = in.next();
            if (userEnter.charAt(0) != '!') {
                var result = Parse.ToDouble(userEnter);
                if (result == null) {
                    System.out.println("Не получилось распарсить");
                } else {
                    System.out.println("Выполнено успешно. Результат: " + result.toString());
                }
            }
        }
        while (userEnter.charAt(0) != '!');

    }
}
