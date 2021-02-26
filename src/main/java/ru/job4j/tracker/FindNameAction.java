package ru.job4j.tracker;

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
        Item[] findName = tracker.findByName(name);
        if (findName.length > 0) {
            for (int i = 0; i < findName.length; i++) {
                out.println(findName[i]);
            }
        }
        else {
            out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
