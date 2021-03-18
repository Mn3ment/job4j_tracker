package ru.job4j.search;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindN() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Pushkin", "Aleksandr", "1837", "Sankt-Petersburg")
        );
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("rte");
        assertThat(persons.size(), is(0));
    }
}