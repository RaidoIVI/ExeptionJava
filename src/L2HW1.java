import java.util.*;

public class L2HW1 implements IHomeWork {
    public int getLesson() {
        return 2;
    }

    public int getHomeWork() {
        return 1;
    }

    public String getShortDescription() {
        return "Парсинг Double числа";
    }

    public String getFullDescription() {
        return """
                Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
                и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
                приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
                """;
    }

    public void Run() {
        System.out.println(getFullDescription());
        Scanner in = new Scanner(System.in);
        String userEnter;
        boolean parseSuccess = false;
        do {
            System.out.print("Введите число для парсинга: ");
            userEnter = in.nextLine();
            double result = 0;
            try {
                result = Parse.ToDouble(userEnter);
                parseSuccess = true;
            } catch (Parse.ParseException e) {
                System.out.println(e.getMessage() + " повторите ввод");
            }
            if (parseSuccess) System.out.println("Выполнено успешно. Результат: " + result);
        }
        while (!parseSuccess);
    }
}
