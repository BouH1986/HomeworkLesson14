import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ToDoList toDoList = new ToDoList();
        Scanner sc = new Scanner(System.in);
        boolean rep = true;
        while (rep) {
            System.out.println("Выберите операцию:");
            System.out.println("0. Выход из программы ");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дела");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");
            try {
                System.out.print("Ваш выбор: ");
                int choice = Integer.parseInt(sc.nextLine());
                String task;
                switch (choice) {
                    case 0:
                        rep = false;
                        System.out.println("Программа завершена");
                        break;
                    case 1:
                        System.out.print("Введите название задачи: ");
                        task = sc.nextLine();
                        toDoList.addCase(task);
                        toDoList.showCase();
                        break;
                    case 2:
                        toDoList.showCase();
                        break;
                    case 3:
                        System.out.print("Введите номер для удаления: ");
                        int numTask = Integer.parseInt(sc.nextLine());
                        toDoList.delIndex(numTask);
                        toDoList.showCase();
                        break;
                    case 4:
                        System.out.print("Введите название задачи: ");
                        task = sc.nextLine();
                        toDoList.delName(task);
                        toDoList.showCase();
                        break;
                    default:
                        System.out.println("Не верное значение");
                        toDoList.showCase();
                }
            } catch (NumberFormatException e) {
                System.out.println("!!!ВЫ ВВЕЛИ НЕ ЧИСЛО!!!");
            }
        }
    }
}
