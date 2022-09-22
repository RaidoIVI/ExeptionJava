import java.util.Scanner;

public class L2HW4 implements IHomeWork {
    public int getLesson() {
        return 2;
    }

    public int getHomeWork() {
        return 4;
    }

    public String getShortDescription() {
        return "Ввод значимой строки";
    }

    public String getFullDescription() {
        return """
                Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
                Пользователю должно показаться сообщение, что пустые строки вводить нельзя
                """;
    }

    public void Run() {
        System.out.println(getFullDescription());
        boolean successEnter;
        do {
            try {
                UserEnter();
                successEnter = true;
            } catch (NullUserEnter e) {
                System.out.println(e.getMessage() + " Вводить пустые строки нельзя");
                successEnter = false;
            }
        } while (!successEnter);
    }

    private String UserEnter() {
        Scanner in = new Scanner(System.in );
        System.out.print("Введите строку: ");
        var userEnter = in.nextLine() ;
        if (userEnter.isEmpty()) throw new NullUserEnter();
        return userEnter;
    }

    static class NullUserEnter extends RuntimeException {
        NullUserEnter() {
            super("Вы ничего не ввели");
        }
    }
}
