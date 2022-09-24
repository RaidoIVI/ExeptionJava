import java.util.Arrays;

public class L1HW3 implements IHomeWork {
    public int getLesson() {
        return 1;
    }

    public int getHomeWork() {
        return 3;
    }

    public String getShortDescription() {
        return "Разность элементов массива";
    }

    public String getFullDescription() {
        return """
                Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
                каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
                не равны, необходимо как-то оповестить пользователя.
                """;
    }

    public void Run() {
        var value1 = new int[10];
        var value2 = new int[10];
        var incorValue = new int[5];
        for (int i = 0; i < value1.length; i++) {
            if (i < 5) incorValue[i] = (int) (Math.random() * 11);
            value1[i] = (int) (Math.random() * 11);
            value2[i] = (int) (Math.random() * 11);
        }
        System.out.println("Массивы инициированы следующими значениями:");
        System.out.println("Массив 1: " + Arrays.toString(value1));
        System.out.println("Массив 2: " + Arrays.toString(value2));
        System.out.println("Массив 3: " + Arrays.toString(incorValue));
        System.out.println();
        int[] result1 = new int[value1.length];
        int[] result2 = new int[value1.length];
        try {
            result1 = Diff(value1, value2);
            result2 = Diff(value1, incorValue);
        } catch (ArrayNotCorrect e) {
            System.out.println("При некорректной обработке результат: " + e.getMessage());
        } finally {
            System.out.println("При корректной обработке результат: " + Arrays.toString(result1));
        }
    }

    private static int[] Diff(int[] value1, int[] value2) throws ArrayNotCorrect {
        if (value1.length != value2.length) throw new ArrayNotCorrect();
        int[] dif = new int[value1.length];
        for (int i = 0; i < value1.length; i++) {
            dif[i] = value1[i] - value2[i];
        }
        return dif;
    }

    private static class ArrayNotCorrect extends Exception {
        ArrayNotCorrect() {
            super("Массивы не одинаковой длины");
        }
    }
}
