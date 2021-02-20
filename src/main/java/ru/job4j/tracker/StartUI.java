package ru.job4j.tracker;
import java.util.Scanner;
import java.util.Arrays;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                } else if (select == 1) {
                    Item[] all = tracker.findAll();
                    System.out.println(Arrays.toString(all));
            } else if (select == 2) {
                System.out.println("=== Enter Id ====");
                int idSelect = Integer.valueOf(scanner.nextLine());
                System.out.println("=== Rename ====");
                Scanner input = new Scanner(System.in);
                String rename = input.nextLine();
                Item newName = new Item(rename);
                tracker.replace(idSelect, newName);
                if (tracker.replace(idSelect, newName)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 3) {
                System.out.println("=== Enter Id ====");
                int idEntered = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(idEntered)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 4) {
                System.out.println("=== Enter Id ====");
                int idEntered = Integer.valueOf(scanner.nextLine());
                Item findId = tracker.findById(idEntered);
                if (findId != null) {
                    System.out.println(findId);
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] findName = tracker.findByName(name);
                if (findName.length > 0) {
                    System.out.println(Arrays.toString(findName));
                }
                else {
                    System.out.println("Заявки с таким именем не найдены");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
