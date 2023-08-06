package datastructures.queue;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    Queue queue;
    @BeforeEach
    void setUp() {
        queue = new Queue(5);
    }
}
