import static org.junit.Assert.assertEquals;

import org.junit.*;

public class LinkedListTests {
    @Test
    public void testPrepend() {
        LinkedList prep = new LinkedList();
        prep.prepend(0);
        prep.prepend(13);
    }

    @Test 
    public void testAppend() {

    }

    @Test
    public void testLast() {

    }

    @Test 
    public void testToString() {
        LinkedList s = new LinkedList();
        s.prepend(13);
        
        assertEquals(13, s.toString());

    }

    @Test 
    public void testLength() {

    }
}