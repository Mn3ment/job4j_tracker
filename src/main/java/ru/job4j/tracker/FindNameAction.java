package ru.job4j.tracker;

public class FindNameAction implements UserAction {
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
                System.out.println(findName[i]);
            }
        }
        else {
            System.out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
