import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.*;

public class ListTests {
    @Test
    public void checkString() {
        StringChecker scheck = new StringChecker() {
            public boolean checkString(String s) {
                if(s != null) {
                    return true;
                }
                else {
                    return false;
                }
            }
        };
        ArrayList<String> check = new ArrayList<>();
        check.add("hi");
        check.add(null);
        check.add("hello");
        ArrayList<Boolean> b = new ArrayList<>();
        b.add(true);
        b.add(false);
        ArrayList<String> a = new ArrayList<>();
        a.add(0,"hi");
        a.add(0,"hello");
        assertEquals(a, ListExamples.filter(check, scheck));
    }




}