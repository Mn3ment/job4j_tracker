package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

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
            out.println("Заявка успешно изменена");
        } else {
            out.println("Error");
        }
        return true;
    }
}
