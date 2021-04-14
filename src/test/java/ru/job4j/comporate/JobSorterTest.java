package ru.job4j.comporate;

import static org.hamcrest.Matchers.lessThan;
import org.junit.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class JobSorterTest {
    @Test
    public void whenAscPriority() {
        List<Job> job = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0),
                new Job("Reboot server", 3)
        );
        job.sort(new JobByPriority());
        List<Job> expected = List.of(
                new Job("X task", 0),
                new Job("Fix bug", 1),
                new Job("Fix bug", 2),
                new Job("Reboot server", 3),
                new Job("Fix bug", 4)
        );
        assertThat(job, is(expected));

    }

    @Test
    public void whenComb() {
        List<Job> job = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 2),
                new Job("Reboot server", 4)
        );
        Comparator<Job> ascComb = new JobByPriority()
                .thenComparing(new SortByNameJob());
        job.sort(ascComb);
        List<Job> expected = List.of(
                new Job("Fix bug", 1),
                new Job("Fix bug", 2),
                new Job("X task", 2),
                new Job("Fix bug", 4),
                new Job("Reboot server", 4)
        );
        assertThat(job, is(expected));

    }

    @Test
    public void whenDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("X task", 3),
                new Job("Reboot server", 5)
        );
        assertThat(rsl, lessThan(0));
    }
}