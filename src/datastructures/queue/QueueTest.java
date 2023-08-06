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
        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());
        queue.printQueue();
    }
}
