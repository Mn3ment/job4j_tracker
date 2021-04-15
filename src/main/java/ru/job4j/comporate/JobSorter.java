package ru.job4j.comporate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);

        List<Job> job = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 5),
                new Job("Fix bug", 2),
                new Job("X task", 0),
                new Job("Reboot server", 3)
        );
        Collections.sort(job, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(job);

        Comparator<Job> comb = new JobDescByNameLn()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, comb);
        System.out.println(job);
        Comparator<Job> ascComb = new JobByPriority()
                .thenComparing(new SortByNameJob());

    }

}
