import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> toDoList = new ArrayList<>();

    public void addCase(String task) {
        toDoList.add(task);
        System.out.println("Добавлено!");
        System.out.println();
    }

    public void showCase() {
        if (toDoList.isEmpty()) {
            System.out.println("Ваш список дел пуст");
        } else {
            System.out.println("Ваш список дел:");
            for (String task : toDoList) {
                System.out.println(toDoList.indexOf(task) + 1 + ". " + task);
            }
        }
        System.out.println();
    }

    public void delIndex(int numTask) {
        if (numTask > 0 && numTask <= toDoList.size()) {
            toDoList.remove(numTask - 1);
            System.out.println("Удалено!");
        } else {
            System.out.println("Неверный номер задачи");
        }
        System.out.println();
    }

    public void delName(String task) {
        if (toDoList.contains(task)) {
            toDoList.remove(task);
            System.out.println("Удалено!");
        } else {
            System.out.println("Неверное название задачи");
        }
        System.out.println();
    }

    public void delKeyWord(String keyWord) {
        ArrayList<String> removeCollection = new ArrayList<>();
        for (String str : toDoList) {
            if (str.contains(keyWord)) {
                removeCollection.add(str);
            }
        }
        if (!removeCollection.isEmpty()) {
            toDoList.removeAll(removeCollection);
            System.out.println("Удалено!");
        } else {
            System.out.println("Совпадений нет");
        }
        System.out.println();
    }
}
