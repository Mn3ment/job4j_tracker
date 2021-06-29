package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Accounts> accounts = List.of(
                new Accounts("123", "Petr Arsentev", "eDer3432f"),
                new Accounts("142", "Petr Arsentev", "000001")
        );
        HashSet<Accounts> expect = new HashSet<>(
                List.of(
                        new Accounts("123", "Petr Arsentev", "eDer3432f"),
                        new Accounts("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sen1() {
        List<Accounts> accounts = List.of(
                new Accounts("123", "Petr Arsentev", "eDer3432f"),
                new Accounts("142", "Petr Arsentev", "000001"),
                new Accounts("123", "Petr Arsentev", "eDer3432f"),
                new Accounts("142", "Petr Arsentev", "000001")
        );
        HashSet<Accounts> expect = new HashSet<>(
                List.of(
                        new Accounts("123", "Petr Arsentev", "eDer3432f"),
                        new Accounts("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}