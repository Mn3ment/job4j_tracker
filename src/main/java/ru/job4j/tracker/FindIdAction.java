package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idEntered = input.askInt("=== Enter Id ===");
        Item findId = tracker.findById(idEntered);
        if (findId != null) {
            out.println(findId);
        } else {
            out.println("Заявка с введенным id: " + idEntered + " не найдена.");
        }
        return true;
    }
}
