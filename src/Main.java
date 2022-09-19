import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Parse.ToInt("10"));
        var lessonList = new ArrayList<IHomeWork>();
        lessonList.add(new L2HW1());  // Вот здесь бы добавить все классы реализующие IHomeWork
        System.out.println("Выберете ДЗ для проверки (введите номер строки, некорректный ввод - выход)");
        for (int i = 1; i <= lessonList.size(); i++) {
            var current = lessonList.get(i - 1);
            System.out.println(i + ". Урок " + current.getLesson() + ". Домашнее задание " + current.getHomeWork() + ". " + current.getDescription());
        }
        Scanner in = new Scanner(System.in);
        var userEnter = Parse.ToInt(in.next());
        if (userEnter != null) {
            userEnter--;
            if (userEnter >= 0 && userEnter < lessonList.size()) {
                lessonList.get(userEnter).Run();
            }
        }
    }

}

