package ru.job4j.stream;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class ProfilesTest {
    @Test
    public void profiles() {
        Address first = new Address("Kazan", "Kremlevskaya", 5, 43);
        Address second = new Address("Moscow", "Mavzoley", 6, 666);
        Address third = new Address("Amsterdam", "Street red-light district", 6, 9);
        Address forth = new Address("New-York", "Wall", 67, 12);
        Address five = new Address("Kazan", "Kremlevskaya", 5, 43);
        List<Profile> addresses = new ArrayList<>();
        addresses.add(new Profile(third));
        addresses.add(new Profile(first));
        addresses.add(new Profile(second));
        addresses.add(new Profile(forth));
        addresses.add(new Profile(five));
        List<Address> expected = new ArrayList<>();
        expected.add(third);
        expected.add(first);
        expected.add(second);
        expected.add(forth);
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(addresses);
        assertThat(expected, is(rsl));
    }

}