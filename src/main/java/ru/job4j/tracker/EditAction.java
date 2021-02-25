package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idSelect = input.askInt("=== Enter Id ===");
        String rename = input.askStr("=== New name ===");
        Item newName = new Item(rename);
        if (tracker.replace(idSelect, newName)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
        return true;
    }
}
