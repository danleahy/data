package datastructures.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack(1);
    }

    @Test
    void printStack() {
        stack.printStack();
        assertEquals(1,stack.getHeight());
    }

    @Test
    void push() {
        //Act
        stack.push(4);
        //Assert
        assertEquals(2, stack.getHeight());
        stack.printStack();
    }

    @Test
    void pop() {
        //Arrange
        stack.push(2);
        stack.push(3);
        stack.push(4);
        //Act
        Node returnedNode = stack.pop();
        //Assert
        assertEquals(4, returnedNode.getValue());
        assertEquals(3,stack.getHeight());
        stack.printStack();
    }
}
