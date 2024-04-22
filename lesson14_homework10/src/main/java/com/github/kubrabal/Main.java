package com.github.kubrabal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        GenericClass<String> genericString = new GenericClass<>("Lesson14: Homework10");
        genericString.printValue();

        GenericClass<Integer> genericInt = new GenericClass<>(123);
        genericInt.printValue();

        List<String> list = Arrays.asList("Java", "Python", "C++", "JavaScript");
        Optional<String> result = CollectionSearch.findItem(list, "Python");
        result.ifPresentOrElse(
                item -> System.out.println("Bulunan öğe: " + item),
                () -> System.out.println("Öğe bulunamadı: -1")
        );
    }
}