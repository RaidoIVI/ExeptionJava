import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Parse.ToInt("10"));
        var lessonList = new ArrayList<IHomeWork>();
        lessonList.add(new L2HW1());  // Вот здесь бы добавить все классы реализующие IHomeWork и отсортировать по уроку и номеру ДЗ
        lessonList.add(new L2HW2());
        lessonList.add(new L2HW3());
        for (int i = 1; i <= lessonList.size(); i++) {
            var current = lessonList.get(i - 1);
            System.out.println(i + ". Урок " + current.getLesson() + ". Домашнее задание " + current.getHomeWork() + ". ");
            System.out.println(current.getDescription());
        }
        System.out.println("Выберете ДЗ для проверки (введите номер из 1й колонки, некорректный ввод - выход)");
        Scanner in = new Scanner(System.in);
        var userEnter = in.next();
        boolean exit = false;
        int numberHW = 0;
        try {
            numberHW = Parse.ToInt(userEnter);            
        } catch (Parse.ParseException e){
            exit = true;
        }
        if (!exit) {
            numberHW--;
            if (numberHW >= 0 && numberHW < lessonList.size()) {
                lessonList.get(numberHW).Run();
            }
        }
    }
}

