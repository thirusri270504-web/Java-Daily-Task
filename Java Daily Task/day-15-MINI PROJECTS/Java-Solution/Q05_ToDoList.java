import java.util.ArrayList;
import java.util.Scanner;

public class Q05_ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();

                    if (task.trim().isEmpty()) {
                        System.out.println("Task cannot be empty.");
                    } else {
                        tasks.add(task);
                        System.out.println("Task added successfully.");
                    }
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(
                                (i + 1) + ". " + tasks.get(i)
                            );
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                        break;
                    }

                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(
                            (i + 1) + ". " + tasks.get(i)
                        );
                    }

                    System.out.print("Enter task number to remove: ");
                    int number = sc.nextInt();

                    if (number >= 1 && number <= tasks.size()) {
                        tasks.remove(number - 1);
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
