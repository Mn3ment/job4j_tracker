package ru.job4j.tracker;

public class DeleteAction  implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idEntered = input.askInt("=== Enter Id ===");
        if (tracker.delete(idEntered)) {
            out.println("Заявка успешно удалена");
        } else {
            out.println("Error");
        }
        return true;
    }
}
