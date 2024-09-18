package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class HomeWork01Test {

    Node<Integer> list;
    HomeWork homeWork;

    @BeforeEach
     void init() {
        list = new Node<>(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        homeWork = new HomeWork();
    }

    @Test
    @DisplayName("Метод partitionBy. Пример 1: условие x < 4")
    void partitionByOne() {
        int count2 = homeWork.partitionBy(list, x -> x < 0);
        assertEquals(0, count2);
    }

    @Test
    @DisplayName("Метод partitionBy. Пример 2: условие x < 0")
    void partitionByTwo() {
        int count2 = homeWork.partitionBy(list, x -> x < 0);
        assertEquals(0, count2);
    }

    @Test
    @DisplayName("Метод findNthElement. Пример 1: поиск элемента на позиции 2")
    void findNthElementOne() {
        Integer element = homeWork.findNthElement(list, 2);
        assertEquals(3, element);
    }

    @Test
    @DisplayName("Метод findNthElement. Пример 2: поиск элемента на позиции 4")
    void findNthElementTwo() {
        Integer element = homeWork.findNthElement(list, 4);
        assertEquals(5, element);
    }

    @Test
    @DisplayName("Метод findNthElement. Пример 3: поиск элемента на позиции 5")
    void findNthElementThree() {
        Integer element = homeWork.findNthElement(list, 5);
        assertNull(element);
    }

    @Test
    @DisplayName("Метод findNthElement. Пример 4: поиск элемента на отрицательной позиции")
    void findNthElementFour() {
        Integer element = homeWork.findNthElement(list, -1);
        assertNull(element);
    }
}