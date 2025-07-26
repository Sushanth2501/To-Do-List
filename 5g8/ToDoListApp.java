import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n===== TO-DO LIST MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter your task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("✅ Task added!");
                    break;

                case 2:
                    System.out.println("\n📋 Your To-Do List:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the task number to remove:");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("🗑️ Task removed.");
                    } else {
                        System.out.println("❌ Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.println("👋 Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }
        }
    }
}









 


 

