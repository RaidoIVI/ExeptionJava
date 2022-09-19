public class L2HW3 implements IHomeWork {
    @Override
    public int getLesson() {
        return 2;
    }

    @Override
    public int getHomeWork() {
        return 3;
    }

    @Override
    public String getDescription() {
        return """
                Дан следующий код, исправьте его там, где требуется
                public static void main(String[] args) throws Exception {
                   try {
                       int a = 90;
                       int b = 3;
                       System.out.println(a / b);
                       printSum(23, 234);
                       int[] abc = { 1, 2 };
                       abc[3] = 9;
                   } catch (Throwable ex) {
                       System.out.println("Что-то пошло не так...");
                   } catch (NullPointerException ex) {
                       System.out.println("Указатель не может указывать на null!");
                   } catch (IndexOutOfBoundsException ex) {
                       System.out.println("Массив выходит за пределы своего размера!");
                   }
                }
                public static void printSum(Integer a, Integer b) throws FileNotFoundException {
                   System.out.println(a + b);
                }                                
                """;
    }

    @Override
    public void Run() {    // тут должен быть main бросающий исключения. такое вроде не приветствуется.
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
