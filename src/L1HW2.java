public class L1HW2 implements IHomeWork {
    public int getLesson() {
        return 1;
    }

    public int getHomeWork() {
        return 2;
    }

    public String getShortDescription() {
        return "Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?";
    }

    public String getFullDescription() {
        return """
                   Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
                 1 public static int sum2d(String[][] arr) {
                 2     int sum = 0;
                 3     for (int i = 0; i < arr.length; i++) {
                 4         for (int j = 0; j < 5; j++) {
                 5             int val = Integer.parseInt(arr[i][j]);
                 6             sum += val;
                 7         }
                 8     }
                 9     return sum;
                10 }
                   """;
    }

    public void Run() {
        System.out.println("""
                Тут можно получить:
                Выход за пределы массива в 4й строке
                Неверный формат строки в 5й строке""");
    }
}
