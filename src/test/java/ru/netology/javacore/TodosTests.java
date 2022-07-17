package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTests {

    @Test
    public void addTaskTest() {
        Todos todos = new Todos();
        todos.addTask("TestPoint#1");
        boolean condition = todos.getAllTasks().contains("TestPoint#1");
        Assertions.assertTrue(condition);
    }

    @Test
    public void removeTaskTest() {
        Todos todos = new Todos();
        todos.addTask("Test");
        todos.removeTask("Test");
        boolean condition = todos.getAllTasks().contains("Test");
        Assertions.assertFalse(condition);
    }

    @Test
    public void getAllTasksTest() {
        Todos todos = new Todos();
        todos.addTask("TestPoint#1");
        String result = todos.getAllTasks();
        Assertions.assertEquals(result, todos.getAllTasks());
    }
}
