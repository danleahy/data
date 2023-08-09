package datastructures.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayListTest {

    private StackArrayList<Object> stringStackArrayList;

    @BeforeEach
    void setUp() {
        stringStackArrayList = new StackArrayList<>();
    }

    @Test
    void printStack2() {
        stringStackArrayList.push("Hello world");
        stringStackArrayList.push(new Object());
        stringStackArrayList.printStack2();
    }

    @Test
    void push() {
        //Act
        stringStackArrayList.push("Hello world");
        stringStackArrayList.push(new Object());
        //Assert
        assertEquals(2,stringStackArrayList.size());
    }
}
