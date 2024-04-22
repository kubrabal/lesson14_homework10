package com.github.kubrabal;

public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericClass<String> genericString = new GenericClass<>("Lesson14: Homework10");
        genericString.printValue();

        GenericClass<Integer> genericInt = new GenericClass<>(123);
        genericInt.printValue();
    }
}
