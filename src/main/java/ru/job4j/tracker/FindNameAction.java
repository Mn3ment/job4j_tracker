package ru.job4j.tracker;

import java.util.List;

public class FindNameAction implements UserAction {
    private final Output out;

    public FindNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> findName = tracker.findByName(name);
        if (findName.size() > 0) {
            for (Item item : findName) {
                out.println(item);
            }
        }
        else {
            out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
