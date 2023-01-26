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
        LinkedList app = new LinkedList();
        app.append(13);
        app.append(133); // maximum
        app.append(46); // append three times = infinite loop
        app.append(37);
        app.append(777);
    }

    @Test 
    public void testToString() {
        LinkedList s = new LinkedList();
        s.prepend(13);
        
        assertEquals("13 ", s.toString());

    }

    @Test
    public void testLast() {

    }

    @Test 
    public void testLength() {

    }
}