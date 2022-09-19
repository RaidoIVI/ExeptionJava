import java.util.*;
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
        return """
                Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
                и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
                приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
                """;
    }

    public void Run() {
        Scanner in = new Scanner(System.in);
        String userEnter;
        boolean parseSuccess = false;
        do {
            System.out.print("Введите число для парсинга или ! для выхода: ");
            System.out.println();
            userEnter = in.next();
            double result = 0;
            if (userEnter.charAt(0) != '!') {
                try {
                    result = Parse.ToDouble(userEnter);
                    parseSuccess = true;
                } catch (Parse.ParseException e) {
                    System.err.println(e.getMessage()+" повторите ввод");
                }
                if (parseSuccess) System.out.println("Выполнено успешно. Результат: " + result);
            }
        }
        while (!parseSuccess);

    }
}
