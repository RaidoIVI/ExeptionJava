import java.util.Arrays;

public class L1HW4 implements IHomeWork {
    public int getLesson() {
        return 1;
    }

    public int getHomeWork() {
        return 4;
    }

    public String getShortDescription() {
        return "Частное элементов массива";
    }

    public String getFullDescription() {
        return """
                Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
                каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
                не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
                которое пользователь может увидеть - RuntimeException, т.е. ваше""";
    }

    public void Run() {
        var value1 = new int[10];
        var valueWithOut0 = new int[10];
        var incorValue = new int[5];
        var valueWith0 = new int[10];
        for (int i = 0; i < value1.length; i++) {
            if (i < 5) incorValue[i] = (int) (Math.random() * 11);
            value1[i] = (int) (Math.random() * 11);
            valueWith0[i] = (int) (Math.random() * 11);
            valueWithOut0[i] = (int) (Math.random() * 11);
            if (valueWithOut0[i] == 0) valueWithOut0[i]++;
        }
        valueWith0[0] = 0;
        System.out.println("Массивы инициированы следующими значениями:");
        System.out.println("Массив 1: " + Arrays.toString(value1));
        System.out.println("Массив 2: " + Arrays.toString(valueWithOut0));
        System.out.println("Массив 3: " + Arrays.toString(valueWith0));
        System.out.println("Массив 4: " + Arrays.toString(incorValue));
        System.out.println();
        int[] result1 = new int[value1.length];
        int[] result2 = new int[value1.length];
        int[] result3 = new int[value1.length];
        try {
            result1 = Divide(value1, valueWithOut0);
            result2 = Divide(value1, incorValue);
            result3 = Divide(value1, valueWith0);
        } catch (ArrayNotCorrect | DevByZero e) {
            System.out.println("При некорректной обработке результат: " + e.getMessage());
        } finally {
            System.out.println("При корректной обработке результат: " + Arrays.toString(result1));
        }
    }

    private static int[] Divide(int[] value1, int[] value2) throws ArrayNotCorrect, DevByZero {
        if (value1.length != value2.length) throw new ArrayNotCorrect();
        int[] dif = new int[value1.length];
        for (int i = 0; i < value1.length; i++) {
            if (value2[i] == 0) throw new DevByZero();
            dif[i] = value1[i] / value2[i];
        }
        return dif;
    }

    private static class ArrayNotCorrect extends Exception {
        ArrayNotCorrect() {
            super("Массивы не одинаковой длины");
        }
    }

    private static class DevByZero extends Exception {
        DevByZero() {
            super("Деление на 0");
        }
    }
}