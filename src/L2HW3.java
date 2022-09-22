public class L2HW3 implements IHomeWork {
    public int getLesson() {
        return 2;
    }

    public int getHomeWork() {
        return 3;
    }

    public String getShortDescription() {
        return "Исправить код";
    }

    public String getFullDescription() {
        return """
                Дан следующий код, исправьте его там, где требуется
                public static void main(String[] args) throws Exception {               // такое вроде не приветствуется.
                   try {
                       int a = 90;
                       int b = 3;
                       System.out.println(a / b);
                       printSum(23, 234);
                       int[] abc = { 1, 2 };
                       abc[3] = 9;
                   } catch (Throwable ex) {                                            // неверный порядок но идея все сама правит
                       System.out.println("Что-то пошло не так...");
                   } catch (NullPointerException ex) {
                       System.out.println("Указатель не может указывать на null!");
                   } catch (IndexOutOfBoundsException ex) {
                       System.out.println("Массив выходит за пределы своего размера!");
                   }
                }
                public static void printSum(Integer a, Integer b) throws FileNotFoundException { // откуда FileNotFoundException?
                   System.out.println(a + b);
                }                               
                """;
    }


    public void Run() {    // тут должен быть main бросающий исключения. такое вроде не приветствуется.
        System.out.println(getFullDescription());
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {                             // неверный порядок но идея все сама правит
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
        System.out.println("""
                Не запуская понятно что будет выход за пределы массива
                int[] abc = {1, 2};
                abc[3] = 9;
                """);
    }

    public static void printSum(Integer a, Integer b) {                  // откуда тут FileNotFound
        System.out.println(a + b);
    }
}
