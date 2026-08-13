import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> toDoList = new ArrayList<>();

    public void addCase(String task) {
        toDoList.add(task);
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
    }

    public void delIndex(int numTask) {
        if (numTask > 0 && numTask < toDoList.size()) {
            toDoList.remove(numTask - 1);
        }else {
            System.out.println("Не верный номер задачи");
        }
    }

    public void delName(String task) {
        toDoList.remove(task);
    }
}
