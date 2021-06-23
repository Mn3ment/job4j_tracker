package ru.job4j.lambda;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("a", 20),
                new Attachment("c", 120),
                new Attachment("d", 23)
        };
        Comparator<Attachment> desComp = (left, right) -> {
            System.out.println("compare - " + left.getName() + " : " + right.getName());
            return right.getName().compareTo(left.getName());
        };
        Arrays.sort(atts, desComp);
        System.out.println(atts);
    }
}

