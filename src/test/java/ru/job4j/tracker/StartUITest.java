package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"8", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }

    @Test
    public void whenShowAllAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(
                new ShowAllAction(out)
        );
        actions.add(
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Show all items" + System.lineSeparator()+ "1. Exit" + System.lineSeparator()
                + "Menu." + System.lineSeparator() +
                "0. Show all items" + System.lineSeparator()+ "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void FindByNameAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "item", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = new Item("item");
        tracker.add(item);
        List<UserAction> actions = new ArrayList<>();
        actions.add(
                new FindNameAction(out)
        );
        actions.add(
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find item by name" + System.lineSeparator() + "1. Exit"
                        + System.lineSeparator() + item
                        + System.lineSeparator()+ "Menu." + System.lineSeparator() +
                        "0. Find item by name" + System.lineSeparator() + "1. Exit" + System.lineSeparator()
        ));
    }


    @Test
    public void FindByIdAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = new Item("item");
        tracker.add(item);
        List<UserAction> actions = new ArrayList<>();
        actions.add(
                new FindIdAction(out)
        );
        actions.add(new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find item by id" + System.lineSeparator() + "1. Exit"
                        + System.lineSeparator() + item
                        + System.lineSeparator()+ "Menu." + System.lineSeparator() +
                        "0. Find item by id" + System.lineSeparator() + "1. Exit" + System.lineSeparator()
        ));
    }

   @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
       List<UserAction> actions = new ArrayList<>();
       actions.add(
               new CreateAction(out)
       );
       actions.add(
               new Exit()
       );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(
                new EditAction(out)
        );
        actions.add(
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();

        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(
                new DeleteAction(out)
        );
        actions.add(
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}