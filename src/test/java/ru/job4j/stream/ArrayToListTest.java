package ru.job4j.stream;

import org.junit.Test;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayToListTest {

    @Test
    public void convert() {
        Integer[][] array = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        List<Integer> con = ArrayToList.convert(array);
        List<Integer> expected = List.of(5,7,3,17,7,0,1,12,8,1,2,3);
        assertThat(expected, is(con));
    }
}