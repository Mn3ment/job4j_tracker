package ru.job4j.collection;

import java.util.Iterator;
import java.util.List;

public class IteratorForList {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "four", "five");
        Iterator<String> iterator = list.iterator();
        /**
         * Iterator<E> iterator() - метод возвращает объект Iterator,
         * который содержит в себе все элементы исходной коллекции. */
        while (iterator.hasNext()) {
            /**
             * E next() - метод переводит курсор на следующий элемент в списке,
             * при этом возвращает этот элемент. Всегда перед вызовом этого метода надо использовать
             * метод hasNext(), иначе будет сгенерировано исключение NoSuchElementException.
             */
            System.out.println("Next element has - " + iterator.hasNext()
                    + ", this element is " + iterator.next());
        }
        /**
         * boolean hasNext() - метод проверяет содержит ли итератор следующий элемент,
         * возвращает false, если курсор станет равным размеру списка,
         * т.е. следующего элемента не существует.
         */
        System.out.println("Next element has - " + iterator.hasNext());
    }
}
