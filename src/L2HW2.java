import java.util.Scanner;

public class L2HW2 implements IHomeWork {
    public int getLesson() {
        return 2;
    }

    public int getHomeWork() {
        return 2;
    }

    public String getShortDescription() {
        return "Исправить код";
    }

    public String getFullDescription() {
        return """
                Если необходимо, исправьте данный код
                try {
                   int d = 0;
                   double catchedRes1 = intArray[8] / d;
                   System.out.println("catchedRes1 = " + catchedRes1);
                } catch (ArithmeticException e) {
                   System.out.println("Catching exception: " + e);
                }
                                
                """;
    }

    public void Run() {
        try {
            System.out.println(getFullDescription());
            Scanner in = new Scanner(System.in);
            System.out.print("Введите делитель (в исходном коде d): ");
            int d = Parse.ToInt(in.nextLine());                         // ввод делителя с его парсингом а не тупо 0
            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // инициализирован массив
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | Parse.ParseException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
