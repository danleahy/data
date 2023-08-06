package datastructures.queue;

import org.junit.jupiter.api.BeforeEach;

class QueueTest {

    Queue queue;
    @BeforeEach
    void setUp() {
        queue = new Queue(5);
    }
}
