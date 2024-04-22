package com.github.kubrabal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CollectionSearch {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++", "JavaScript");

        // Öğe arama
        Optional<String> result = findItem(list, "Python");
        result.ifPresentOrElse(
                item -> System.out.println("Bulunan öğe: " + item),
                () -> System.out.println("Öğe bulunamadı: -1")
        );
    }

    public static <T> Optional<T> findItem(List<T> list, T item) {
        return list.stream().filter(i -> i.equals(item)).findFirst();
    }
}