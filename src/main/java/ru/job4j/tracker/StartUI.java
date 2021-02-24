package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItems(Input input, Tracker tracker) {
        Item[] all = tracker.findAll();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }

    public static void editItem(Input input, Tracker tracker) {
            int idSelect = input.askInt("=== Enter Id ====");
            String rename = input.askStr("=== Rename ====");
            Item newName = new Item(rename);
            if (tracker.replace(idSelect, newName)) {
                System.out.println("Success");
            } else {
                System.out.println("Error");
            }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int idEntered = input.askInt("=== Enter Id ====");
        if (tracker.delete(idEntered)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }

    public static void findId(Input input, Tracker tracker) {
        int idEntered = input.askInt("=== Enter Id ====");
        Item findId = tracker.findById(idEntered);
        if (findId != null) {
            System.out.println(findId);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    public static void findName(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] findName = tracker.findByName(name);
        if (findName.length > 0) {
            for (int i = 0; i < findName.length; i++) {
                System.out.println(findName[i]);
            }
        }
        else {
            System.out.println("Заявки с таким именем не найдены");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItems(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input,tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findId(input, tracker);
            } else if (select == 5) {
                StartUI.findName(input, tracker);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
