package datastructures.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

    Queue queue;
    @BeforeEach
    void setUp() {
        queue = new Queue(5);
    }

    @Test
    void testSetup(){
        System.out.println("First: " + queue.getFirst());
        System.out.println("Last: " + queue.getLast());
        System.out.println("Length: " + queue.getLength());
        queue.printQueue();
    }
}
