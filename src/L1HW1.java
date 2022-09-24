import java.io.File;
import java.io.IOException;

public class L1HW1 implements IHomeWork {
    public int getLesson() {
        return 1;
    }

    public int getHomeWork() {
        return 1;
    }

    public String getShortDescription() {
        return "Реализуйте 3 метода, чтобы в каждом из них получить разные исключения";
    }

    public String getFullDescription() {
        return "Реализуйте 3 метода, чтобы в каждом из них получить разные исключения";
    }

    public void Run() {
        System.out.println("""
                Как я понял надо получить исключения всез типов:
                1. Ошибка
                2. Проверяемое
                3. Непроверяемое""");
        try {
            GetExeption.Cheked();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            GetExeption.UnCheked();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        GetExeption.Error();
    }

    private static class GetExeption {
        private static void Error() {
            boolean i = false;
            while (!i) {
                Error();
            }
        }

        private static void UnCheked() {
            int[] i = new int[10];
            var b = i[11];
        }

        private static void Cheked() throws IOException {
            File file = new File("z:/example.txt");

            file.createNewFile();
        }
    }
}
