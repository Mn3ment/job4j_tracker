package ru.job4j.tracker;

public class DeleteAction  implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idEntered = input.askInt("=== Enter Id ===");
        if (tracker.delete(idEntered)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
        return true;
    }
}
