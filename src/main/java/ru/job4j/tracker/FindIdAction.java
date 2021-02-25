package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idEntered = input.askInt("=== Enter Id ===");
        Item findId = tracker.findById(idEntered);
        if (findId != null) {
            System.out.println(findId);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
